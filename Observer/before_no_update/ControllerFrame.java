import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControllerFrame extends JFrame {
	private JButton setButton = new JButton("Set");
	private JTextField entryTextField = new JTextField(10);

	private Model model;

	public ControllerFrame(Model model)	{
		super("Controller");
		this.model = model ;

		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		c.add(entryTextField);
		c.add(setButton);
		pack();

		addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					System.exit (0);
				}
			}
		);

        setButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setButtonAction();
            }
        }
        );
	}

	private void setButtonAction()	{
		int number;
		try {
			number = Integer.parseInt(entryTextField.getText());
			model.setData(number);
		}
		catch (NumberFormatException e) {
			entryTextField.setText("");
		}
	}

}