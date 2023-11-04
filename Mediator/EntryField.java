import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EntryField implements Widget {

    private DialogDirector director;

    JTextField textField = new JTextField(20);

    public EntryField(DialogDirector director) {
        this.director = director;

        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changed();
            }
        };
        textField.getDocument().addDocumentListener(documentListener);

    }

    public String getText() {
        return textField.getText();
    }

    @Override
    public void changed() {
        director.widgetChanged(this);
    }

    public JTextField getJTextField() {
        return textField;
    }

}
