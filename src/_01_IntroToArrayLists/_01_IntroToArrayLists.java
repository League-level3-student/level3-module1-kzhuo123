package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> string = new ArrayList<String>();
		//2. Add five Strings to your list
		string.add("a");
		string.add("b");
		string.add("c");
		string.add("d");
		string.add("e");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < string.size(); i++) {
			System.out.println(string.get(i));
		}
		System.out.println("");
		//4. Print all the Strings using a for-each loop
		for (String string2 : string) {
			System.out.println(string2);
		}
		System.out.println("");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < string.size(); i++) {
			if (i%2==0) {
				System.out.println(string.get(i));
			}
		}
		
		System.out.println("");
		//6. Print all the Strings in reverse order.
		for (int i = string.size()-1; i >= 0; i--) {
			System.out.println(string.get(i));
		}
		
		System.out.println("");
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < string.size(); i++) {
			if (string.get(i).contains("e")) {
				System.out.println(string.get(i));	
			}
			
		}
	}
}
