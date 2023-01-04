import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// GUI stands for Graphical User Interface
public class BryanGUI implements ActionListener {

	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	public BryanGUI() {
		
		 frame = new JFrame();
		
		 button = new JButton("Click me");
		
		button.addActionListener(this);
		
		label = new JLabel("Number of clicks: 0");
		
		 panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
	
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("BT 1st GUI");
		frame.pack();
		frame.setVisible(true);
		
	
	}
	
	public static void main(String[] args) {
		new BryanGUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		label.setText("Number of clicks: " + count);
	}

}