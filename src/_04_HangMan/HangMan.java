package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JLabel label=new JLabel();
int life=10;
Stack<String> words;
	
public static void main(String[] args) {


HangMan run=new HangMan();
run.Setup();


}

public void Setup() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(label);
	frame.addKeyListener(this);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Stack<String> words = new Stack<String>();
	String s= JOptionPane.showInputDialog("Choose a number 1 to 266");
	int i1= Integer.parseInt(s);
	for (int i = 0; i < i1; i++) {
	words.add(Utilities.readRandomLineFromFile("dictionary.txt"));
	}

	for (int i = 0; i < words.pop().length(); i++) {
		label.setText(label.getText()+"_ ");

	}
	frame.pack();
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


}
