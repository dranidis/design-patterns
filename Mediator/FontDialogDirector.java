/**
 * The director is responsible for managing the widgets and their state. The
 * director needs to know all the widgets that it manages.
 * <p>
 * In this implementation, the widgets are created by the director.
 * Alternatively, the widgets could be created by the client and passed to the
 * director using a setter method for each widget.
 */
public class FontDialogDirector implements DialogDirector {

    private ListBox fontList;
    private EntryField fontName;
    private Button ok;
    private Button cancel;

    private String font;

    public FontDialogDirector() {
        this.createWidgets();
    }

    /**
     * This method is called by the constructor to create the widgets that the
     * director manages.
     */
    private void createWidgets() {
        fontList = new ListBox(this);
        fontName = new EntryField(this);
        ok = new Button(this);
        cancel = new Button(this);
    }

    public void show() {
        System.out.println("FontDialog is shown");
    }

    public void dismiss() {
        System.out.println("FontDialog is dismissed");
    }

    @Override
    public void widgetChanged(Widget widget) {
        if (widget == fontList) {
            fontName.setText(fontList.getSelection());
        } else if (widget == ok) {
            // apply font change and dismiss dialog
            font = fontName.getText();
            this.dismiss();
        } else if (widget == cancel) {
            // dismiss dialog
            this.dismiss();
        }
    }

    /**
     * This method is called by the client to get the font selected by the user.
     * 
     * @return
     */
    public String getFont() {
        return font;
    }

    // The following methods exist ONLY to simulate in a test scenario
    // the user interaction with the widgets.
    //
    // Normally these methods would be called by the widgets themselves
    // when the user interacts with the GUI.

    public void fontListSelect(String font) {
        System.out.println("User selects from the list: " + font);
        fontList.setSelection(font);
        // fontName.setText(fontList.getSelection());
    }

    public void okButtonPress() {
        System.out.println("User presses OK");
        ok.changed();
    }

    public void cancelButtonPress() {
        System.out.println("User presses Cancel");
        cancel.changed();
    }

}
