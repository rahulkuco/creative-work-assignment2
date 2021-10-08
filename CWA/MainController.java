import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * Main Controller
 *
 */
public class MainController {

	// main method
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// frame title
		frame.setTitle("Lesson 3 Polymorphism");

		// setting the label
		JLabel label = new JLabel("Click on the following buttons:");
		label.setBounds(10, 24, 180, 23);
		frame.getContentPane().add(label);

		// square button
		JButton squareJButton = new JButton("Square");
		squareJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Square square = new Square();
				square.view();
			}
		});
		squareJButton.setBounds(91, 126, 111, 45);
		frame.getContentPane().add(squareJButton);

		// circle button
		JButton circleJButton = new JButton("Circle");
		circleJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Circle circle = new Circle();
				circle.view();
			}
		});
		circleJButton.setBounds(91, 70, 111, 45);
		frame.getContentPane().add(circleJButton);

		// rectangle button
		JButton rectangleJButton = new JButton("Rectangle");
		rectangleJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rectangle rectangle = new Rectangle();
				rectangle.view();
			}
		});
		rectangleJButton.setBounds(91, 182, 111, 45);
		frame.getContentPane().add(rectangleJButton);

		// triangle button
		JButton triangleJButton = new JButton("Triangle");
		triangleJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Triangle triangle = new Triangle();
				triangle.view();
			}
		});
		triangleJButton.setBounds(91, 241, 111, 45);
		frame.getContentPane().add(triangleJButton);

		// hexagon button
		JButton hexagonJButton = new JButton("Hexagon");
		hexagonJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hexagon hexagon = new Hexagon();
				hexagon.view();
			}
		});
		hexagonJButton.setBounds(91, 298, 111, 45);
		frame.getContentPane().add(hexagonJButton);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
