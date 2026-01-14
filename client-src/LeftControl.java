import javax.swing.*;
import java.awt.*;

public class LeftControl extends JPanel {
	
	public LeftControl() {
		String[] colors = {
			"Black", "Red", "Blue", "Green", "Yellow", "Orange", "Pink"
		};
		JComboBox colorMenu = new JComboBox(colors);
		JRadioButton rectangleRadio = new JRadioButton("Rectangle");
		JRadioButton circleRadio = new JRadioButton("Circle");
		JRadioButton arcRadio = new JRadioButton("Arc");

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rectangleRadio);
		buttonGroup.add(circleRadio);
		buttonGroup.add(arcRadio);

		setLayout(new GridLayout(7, 1));

		add(colorMenu);
		add(rectangleRadio);
		add(circleRadio);
		add(arcRadio);

		ActionNanny actionNanny = new ActionNanny();
		rectangleRadio.addActionListener(actionNanny);
		circleRadio.addActionListener(actionNanny);
		arcRadio.addActionListener(actionNanny);
		colorMenu.addActionListener(actionNanny);
	}
	
}