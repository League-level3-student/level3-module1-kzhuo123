package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> dub = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack
		Random r=new Random();
		for (int i = 0; i < 100; i++) {
			double q=r.nextDouble()*100;
			dub.push(q);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String s=JOptionPane.showInputDialog("Enter a number between 0 and 100" );
		String s1=JOptionPane.showInputDialog("Enter another number between 0 and 100" );
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		int i1= Integer.parseInt(s);
		int i2= Integer.parseInt(s1);
		
		for (int i = 0; i < dub.size(); i++) {
			double q=dub.pop();
			if (q>=i1&&q<i2) {
				System.out.println(q);
			}
		}
		
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
