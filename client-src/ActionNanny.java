import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionNanny implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionNanny: " + e.getActionCommand());

		if (e.getSource() instanceof JComboBox) {
			JComboBox comboBox = (JComboBox) e.getSource();
			System.out.println("Selected: " + comboBox.getSelectedItem());
		}
	}
	
}