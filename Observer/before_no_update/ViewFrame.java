import java.awt.*;
import javax.swing.*;

public class ViewFrame extends JFrame {
	private JTextField dataTextField = new JTextField(10);

	private Model model;

	public ViewFrame(Model model) {
		super("View");
		this.model = model;

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(dataTextField);
		dataTextField.setEditable(false);
		pack();
		update();
	}

	public void update() {
		dataTextField.setText("" + model.getData());
	}
}