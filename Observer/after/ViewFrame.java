import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.*;

public class ViewFrame extends JFrame implements Observer {
	private JTextField dataTextField = new JTextField(10);

//	private Model model;

	public ViewFrame(Model model) {
		super("View");

//		this.model = model ;
//		model.setViewFrame(this); // connect the model to this frame

		model.addObserver(this);

		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		c.add(dataTextField);
		dataTextField.setEditable(false);
		dataTextField.setText("" + model.getData());
		pack();
	}

	public void update(Observable o, Object arg) {
		dataTextField.setText("" + ((Model) o).getData());
	}
}