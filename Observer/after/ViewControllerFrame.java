import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.util.*;

public class ViewControllerFrame extends JFrame implements Observer {
	private JTextField dataTextField = new JTextField(10);
	private JButton setButton = new JButton("Set");

	private Model model;

	public ViewControllerFrame(Model model) {
		super("View-Controller");
		this.model = model ;
		model.addObserver(this);

		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		c.add(dataTextField);
		c.add(setButton);
		dataTextField.setText("" + model.getData());
		pack();

        setButton.addActionListener(
			new ActionListener() {
            	public void actionPerformed(ActionEvent evt) {
                	setButtonAction();
            	}
        	}
        );
	}

	public void update(Observable o, Object arg) {
		dataTextField.setText("" + ((Model) o).getData());
	}

	private void setButtonAction()	{
		int number;
		try {
			number = Integer.parseInt(dataTextField.getText());
			model.setData(number);
		}
		catch (NumberFormatException e) {
			dataTextField.setText(""+ model.getData());
		}
	}
}