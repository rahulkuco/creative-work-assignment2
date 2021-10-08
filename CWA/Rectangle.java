import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * Rectangle Model
 *
 */
public class Rectangle extends JPanel {

	private static final long serialVersionUID = 1L;

	// overriding paintComponent method to draw rectangle
	public void paintComponent(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, getWidth(), getHeight());
		graphics.setColor(Color.GRAY);
		graphics.fillRect(40, 80, 200, 100);	
	}

	// method to display rectangle
	public void view() {
		JFrame frame = new JFrame("Rectangle");

		Rectangle panel = new Rectangle();
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}