import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.Socket;

public class Main extends JFrame {
	public static Sender socket;
	/*
	 * Names: Jonathan Martin, Ronan Biggs, Ryan Schmitt, Bernardo Lopez
	 *
	 * Note: to run, run Server.java in its own package for its main method
	 *       and all other classes in another package to run the Main.java
	 *       main method
	 */

    static {
        try {
            socket = new Sender("localhost", 1111);
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