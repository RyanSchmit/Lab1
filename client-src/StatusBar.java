import javax.swing.*;

public class StatusBar extends JPanel {
	
	public StatusBar() {
		JButton button1 = new JButton("Undo");
		JButton button2 = new JButton("Erase");
		add(button1);
		add(button2);
		ActionNanny actionNanny = new ActionNanny(); // new line compared to version 1.0
		button1.addActionListener(actionNanny); // new line compared to version 1.0
		button2.addActionListener(actionNanny); // new line compared to version 1.0
	}

}