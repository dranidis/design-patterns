import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Button implements Widget {

    private DialogDirector director;

    private JButton jButton;

    public Button(DialogDirector director, String text) {
        this.director = director;
        jButton = new JButton(text);

        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                changed();
            }
        });
    }

    public void enable() {
        jButton.setEnabled(true);
    }

    public void disable() {
        jButton.setEnabled(false);
    }

    @Override
    public void changed() {
        director.widgetChanged(this);
    }

    public JButton getJButton() {
        return jButton;
    }

}
