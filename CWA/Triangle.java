import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * Triangle Model
 *
 */
public class Triangle extends JPanel {

	private static final long serialVersionUID = 1L;

	// overriding paintComponent method to draw triangle
	public void paintComponent(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, getWidth(), getHeight());
		graphics.setColor(Color.GRAY);
		int [] xAxis = {140,190,90};
        int [] yAxis = {50,190,190};
        graphics.fillPolygon(xAxis, yAxis, 3);
	}

	// method to display triangle
	public void view() {
		JFrame frame = new JFrame("Triangle");

		Triangle panel = new Triangle();

		frame.add(panel);

		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}