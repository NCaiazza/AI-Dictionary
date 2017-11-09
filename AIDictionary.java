package simpleAI;

import java.util.HashMap;
import java.util.Scanner;

// Author: Nicholas Caiazza

public class AIDictionary {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		HashMap<String,String> dictionary = new HashMap<>();
		
		loadWords(dictionary); //Loads pre-defined words into dictionary
		
		System.out.println("Hello, I can tell you the meaning of a word.\n");
		
		while (true) {
			System.out.print("Enter a word: ");
			String word = kbd.nextLine();
			word = word.toLowerCase();
			
			if (dictionary.containsKey(word)) {
				System.out.println("The definition of " + word + " is:");
				System.out.println(dictionary.get(word) + "\n");
			} else {
				System.out.println("I do not know that word.  Please enter the definition:");
				String def = kbd.nextLine();
				
				dictionary.put(word, def);
				
				System.out.println();
			}
		}
	}
	
	public static void loadWords(HashMap<String,String> m) {
		//All keys must be in lowercase
		m.put("talk", "Speak in order to give information or express ideas or feelings; converse or communicate by spoken words");
		m.put("hello","Used as a greeting or to begin a telephone conversation");
		m.put("information", "Acts provided or learned about something or someone");
		m.put("learn", "Gain or acquire knowledge of or skill in (something) by study, experience, or being taught");
		m.put("computer", "An electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program");
	}

}
