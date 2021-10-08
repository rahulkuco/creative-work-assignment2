import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * Circle Model
 *
 */
public class Circle extends JPanel {

	private static final long serialVersionUID = 1L;

	// overriding paintComponent method to draw circle
	public void paintComponent(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, getWidth(), getHeight());
		graphics.setColor(Color.GRAY);
		graphics.fillOval(55, 50, 170, 170);		
	}

	// method to display circle
	public void view() {
		JFrame frame = new JFrame("Circle");

		Circle panel = new Circle();
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
