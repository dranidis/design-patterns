public class Client {
    public static void main(String[] args) {
        FontDialogDirector fontDialog = new FontDialogDirector();

        fontDialog.show();

        // simulate user interaction with the widgets

        fontDialog.fontListSelect("Arial");
        fontDialog.okButtonPress();

        // get the font selected by the user
        System.out
                .println(null == fontDialog.getFont() ? "No font selected" : "Font selected: " + fontDialog.getFont());
    }

}
