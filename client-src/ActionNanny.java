import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ActionNanny implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
        try {
            Main.socket.send(e.getActionCommand());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        if (e.getSource() instanceof JComboBox) {
			JComboBox comboBox = (JComboBox) e.getSource();
            try {
                Main.socket.send((String) comboBox.getSelectedItem());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
	}
	
}