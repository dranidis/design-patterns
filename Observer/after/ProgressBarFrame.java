import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.util.*;

public class ProgressBarFrame extends JFrame implements Observer {
	private JProgressBar progressBar = new JProgressBar(0,100);

	public ProgressBarFrame(Model model) {
		super("Slider");
//		this.model = model ;
		model.addObserver(this);

		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		c.add(progressBar);
		pack();
	}

	public void update(Observable o, Object arg) {
		progressBar.setValue(((Model) o).getData());
	}
}