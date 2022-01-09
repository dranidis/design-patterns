import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.util.*;

public class SliderFrame extends JFrame implements Observer {
	private JSlider slider = new JSlider(0,100);

	private Model model;

	public SliderFrame(Model model) {
		super("Slider");
		this.model = model ;
		model.addObserver(this);

		Container c = getContentPane();
		c.setLayout( new FlowLayout() );
		c.add(slider);
		pack();

		slider.addChangeListener(
			new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					setValue() ;
				}
			}
		);
	}

	public void update(Observable o, Object arg) {
		slider.setValue(((Model) o).getData());
	}

	private void setValue() {
		model.setData(slider.getValue());
	}
}