import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The director is responsible for managing the widgets and their state. The
 * director needs to know all the widgets that it manages.
 * <p>
 * In this implementation, the widgets are created by the director.
 * Alternatively, the widgets could be created by the client and passed to the
 * director using a setter method for each widget.
 */
public class FontDialogDirector extends JDialog implements DialogDirector {

    JFrame frame;

    private ListBox fontList;
    private EntryField fontName;
    private Button ok;
    private Button cancel;

    private String font;

    public FontDialogDirector(Frame parent) {
        super(parent, "Font Selector", true);

        this.createWidgets();

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel.add(fontName.getJTextField(), BorderLayout.NORTH);

        panel.add(fontList.getJList(), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(cancel.getJButton());
        buttonPanel.add(ok.getJButton());

        panel.add(buttonPanel, BorderLayout.SOUTH);

        getContentPane().add(panel);
        pack();
    }

    /**
     * This method is called by the constructor to create the widgets that the
     * director manages.
     */
    private void createWidgets() {
        List<String> fonts = new ArrayList<>();
        fonts.add("Arial");
        fonts.add("Arial Black");
        fonts.add("Courier New");
        fonts.add("Times New Roman");
        fonts.add("Verdana");

        fontList = new ListBox(this, fonts);

        fontName = new EntryField(this);

        ok = new Button(this, "OK");
        cancel = new Button(this, "Cancel");

        ok.disable();
        cancel.enable();
    }

    public String getFontFromDialog() {
        setLocationRelativeTo(getParent());
        setVisible(true);
        return this.font;
    }

    @Override
    public void widgetChanged(Widget widget) {
        if (widget == fontList) {
            font = fontList.getSelection();
            ok.enable();
        } else if (widget == ok) {
            this.dispose();
        } else if (widget == cancel) {
            font = null;
            this.dispose();
        } else if (widget == fontName) {
            fontList.filterFonts(fontName.getText());
        }
    }

}
