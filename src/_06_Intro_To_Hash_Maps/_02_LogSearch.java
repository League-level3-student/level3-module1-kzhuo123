package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.bind.ParseConversionEvent;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3= new JButton();
	HashMap<Integer, String> log = new HashMap<Integer, String>();

	public static void main(String[] args) {
		_02_LogSearch run = new _02_LogSearch();
		run.Setup();
	}

	public void Setup() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button.setText("Add Entry");
		button1.setText("Search by ID");
		button2.setText("View List");
		button3.setText("Remove Entry");
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();

		if (pressed == button) {
			String ID = JOptionPane.showInputDialog("Enter an ID number");
			int id1 = Integer.parseInt(ID);
			String name = JOptionPane.showInputDialog("Enter a name");
			log.put(id1, name);
		}

		if (pressed == button1) {
			String ask = JOptionPane.showInputDialog("Search an ID number");
			int ask1 = Integer.parseInt(ask);
			if (log.containsKey(ask1)) {
				JOptionPane.showMessageDialog(null, log.get(ask1));
			} else {
				JOptionPane.showMessageDialog(null, "That entry does not exist");
			}

		}

		if (pressed == button2) {
			String print="";
			for (int i = 0; i < log.keySet().size(); i++) {
			print+="ID: "+ log.keySet().toArray(new Integer[0])[i] + "  Name: " + log.get(log.keySet().toArray(new Integer[0])[i]) + "\n";
			}
			JOptionPane.showMessageDialog(null, print);
		}
		
		if (pressed == button3) {
			String ask = JOptionPane.showInputDialog("Search an ID number");
			int ask1 = Integer.parseInt(ask);
			if (log.containsKey(ask1)) {
				log.remove(ask1);
			} else {
				JOptionPane.showMessageDialog(null, "That entry does not exist");
			}
		}
	}
}
