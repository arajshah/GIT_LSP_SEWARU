//consider a sentence
// "This is an old house and we aren't guest here anymore. is, old, no more, we, and, house".
// give me a list of the words and their frequencies

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class rough {
	public static void main(String[] args) {
		
	//need a path to file
		String filepath = "src/dasdasd";
		
	//creating a file object from file path
		File file = new File(filepath);
		
	//creating a map to store frequencies
		Map<String, Integer> wordfrequencies = new HashMap<>();
		
	//extracting words from the file using scanner
		
		try {
			
			//creating a scanner to read file
			
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNext()) {
				
				String word = scanner.next();
				
				processwords(word, wordfrequencies);
				
			}
			
			
			//closing the scanner
			scanner.close();
			
			displayWordFrequencies(wordfrequencies);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
	}
	
	public static void processwords(String word, Map<String, Integer>wordfrequencies) {
		
		if (word.matches("[a-zA-Z]+")) {
			if (word.length() > 2) {
				
				word = word.toLowerCase();
				
				wordfrequencies.put(word,  wordfrequencies.getOrDefault(word, 0)+1);
		}
	   }
	}
	
	
	
	public static void displayWordFrequencies(Map<String, Integer> wordfrequencies) {
		
		for (Map.Entry<String, Integer> entry: wordfrequencies.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
	}
	
	
}


