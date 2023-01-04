import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BryanGUI implements ActionListener {
private int count = 0;
private JLabel label; // displays the number of button clicks
private JFrame frame; // container for the GUI elements
private JPanel panel; // container for the button and label
private JButton button; // button that the user clicks

public BryanGUI() {
	// initialize the frame and set its properties
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("BT 1st GUI");

	// initialize the button and add an action listener to it
	button = new JButton("Click me");
	button.addActionListener(this);

	// initialize the label and set its initial text
	label = new JLabel("Number of clicks: 0");

	// initialize the panel and set its layout and border
	panel = new JPanel();
	panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
	panel.setLayout(new GridLayout(0, 1));

	// add the button and label to the panel
	panel.add(button);
	panel.add(label);

	// add the panel to the frame and set its size and visibility
	frame.add(panel, BorderLayout.CENTER);
	frame.pack();
	frame.setVisible(true);
}

public static void main(String[] args) {
	// create a new instance of the BryanGUI class
	new BryanGUI();
}

@Override
public void actionPerformed(ActionEvent e) {
	// increment the count and update the label text when the button is clicked
	count++;
	label.setText("Number of clicks: " + count);
}
}
