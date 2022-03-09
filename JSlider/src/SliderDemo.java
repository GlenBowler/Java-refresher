import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class SliderDemo implements ChangeListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		
		frame = new JFrame("Slider demo");
		panel = new JPanel();
		label = new JLabel ();
		slider = new JSlider(0,100,50);
		
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10); //space of 10
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25); // every 25 got major part
		slider.setPaintLabels(true); // show totals on slider
		slider.setFont(new Font("MV Boli",Font.PLAIN,15));
		slider.setOrientation(SwingConstants.VERTICAL);//changing the slider to vertical
		slider.addChangeListener(this);
		label.setText("Degree C= " + slider.getValue());
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("Degree C= " + slider.getValue());
		
	}

}
