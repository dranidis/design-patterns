# Observer

This is a very simple example demonstrating the observer design pattern and also the Model-View-Controller architectural pattern.

Assume you have a class Model in your domain.  This is a very simple class encapsulating an integer number, for the sake of the example.

```
class Model
{
	private int data;

	public int getData() { return data ; }
	public void setData(int d) {data = d ;}
}
```

A frame in the GUI is responsible for setting the value of Model.  Let us call this class ControllerFrame.

```
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
 ```

The value of data in Model should be presented in the GUI each time it is modified.  For the presentation of the value we have created another frame implemented in class ViewFrame (It is not necessary to have the components that set and get the value of some data separately).

```
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ViewFrame extends JFrame
{
	private JTextField dataTextField = new JTextField(10);

	private Model model;

	public ViewFrame(Model model)
	{
		super("View");
		this.model = model ;
		model.setViewFrame(this); // connect the model to this frame

		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		c.add(dataTextField);
		dataTextField.setEditable(false);
		pack();
		update();
	}

	public void update()
	{
		dataTextField.setText("" + model.getData());
	}
}
```

Let us write a Main class, which connects the Model with our Controller and the View.

```
public class Main
{
	public static void main(String arg[])
	{
		Model model = new Model();
		ControllerFrame controllerFrame = new ControllerFrame(model);
		ViewFrame viewFrame = new ViewFrame(model);

		controllerFrame.show();
		viewFrame.show();
	}
}
```

Running this program presents two frames.  For the moment we can change the value of data by using the Controller Frame, but the View Frame is not updated, since it is not notified.



Which object should be responsible for notifying the View?  The Model object knows when the data value has changed.   It is changed when the method setData is called.  A first approach could lead to a solution in which setData calls the method update of ViewFrame.  So Model needs attribute visibility to ViewFrame.  This couples our domain class Model to the GUI class ViewFrame.  Such a solution is presented below:

```
class Model {
	private int data;

	public int getData() { return data ; }
	public void setData(int d) {
		data = d ;

		frame.update();
	}

	public void setViewFrame(ViewFrame frame) {	this.frame = frame ;}

	private ViewFrame frame;
}
```

The constructor of ViewFrame is modified to:

```
	public ViewFrame(Model model)
	{
		super("View");
		this.model = model ;
		model.setViewFrame(this); // connect the model to this frame

		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		c.add(dataTextField);
		dataTextField.setEditable(false);
		pack();
		update();
	}
```

The above solution is not desirable since it couples a domain class to a presentation class.  

The Model-View Separation principle states that domain classes should not know about presentation classes.  This principle enables the replacement of the presentation class without changing the domain class, and promotes Low Coupling, Protected Variations (changing user interfaces).

The Observer pattern can be used to accomplish Model-View Separation.  