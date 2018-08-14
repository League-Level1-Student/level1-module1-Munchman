import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JTextField textthing = new JTextField(20);

	BinaryConverter() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setText("press 0's and 1's randomly");
		frame.add(panel);
		panel.add(label);
		panel.add(button);
		button.setText("convert it!!!!!!");
		panel.add(textthing);
		button.addActionListener(this);
		frame.pack();
	}

	public String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			int theLetter = asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	public static void main(String[] args) {
		new BinaryConverter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String binary = textthing.getText();
		String decimal = convert(binary);
		label.setText("this is what you wrote!!!  "+decimal);
	}
}
