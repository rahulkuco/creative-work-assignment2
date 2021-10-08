import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * Square Model
 *
 */
public class Square extends JPanel {

	private static final long serialVersionUID = 1L;

	// overriding paintComponent method to draw square
	public void paintComponent(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, getWidth(), getHeight());
		graphics.setColor(Color.GRAY);
		graphics.fillRect(55, 50, 170, 170);	
	}

	// method to display square
	public void view() {
		JFrame frame = new JFrame("Square");

		Square panel = new Square();
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}