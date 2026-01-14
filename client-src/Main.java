import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.Socket;

public class Main extends JFrame {
	public static Sender socket;

    static {
        try {
            socket = new Sender("localhost", 5555);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
		Main app = new Main();
		app.setSize(800, 600);
		app.setTitle("Second Attempt for a Drawing Application");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setResizable(false);
		app.setVisible(true);
	}
	
	public Main() {

		JPanel drawPanel = new DrawPanel();
		MouseNanny mouseNanny = new MouseNanny();
		drawPanel.addMouseListener(mouseNanny);

		JPanel leftControl = new LeftControl();
		JPanel statusBar = new StatusBar();

		setLayout(new BorderLayout());
		add(leftControl, BorderLayout.WEST);
		add(statusBar, BorderLayout.SOUTH);
		add(drawPanel, BorderLayout.CENTER);
	}
	
}