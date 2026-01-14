import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class MouseNanny implements MouseListener {
	public void mouseClicked(MouseEvent e) {
	}
	
	public void mouseEntered(MouseEvent e) {
	}
	
	public void mouseExited(MouseEvent e) {
	}
	
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
        try {
            Main.socket.send(x + ", " + y);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
	
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		try {
			Main.socket.send(x + ", " + y);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}
