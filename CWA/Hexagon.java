import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * Hexagon Model
 *
 */
public class Hexagon extends JPanel {

	private static final long serialVersionUID = 1L;

	// overriding paintComponent method to draw hexagon
	public void paintComponent(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, getWidth(), getHeight());
		graphics.setColor(Color.GRAY);
		Polygon polygon = new Polygon();
		int sides = 6;
		for (int side = 0; side < sides; side++) {
			polygon.addPoint((int) (140 + 85 * Math.cos(side * 2 * Math.PI / sides)),
					(int) (130 + 85 * Math.sin(side * 2 * Math.PI / sides)));			
		}
		graphics.fillPolygon(polygon);
	}

	// method to display hexagon
	public void view() {
		JFrame frame = new JFrame("Hexagon");

		Hexagon panel = new Hexagon();
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}