import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntryField implements Widget {

    private DialogDirector director;

    JTextField textField = new JTextField(20);

    public EntryField(DialogDirector director) {
        this.director = director;

        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                changed();
            }
        });

    }

    public void setText(String text) {
        textField.setText(text);
        this.changed();
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
