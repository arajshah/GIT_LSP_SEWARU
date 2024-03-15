package org.howard.edu.lsp.midterm.question1;

/**
 * The SecurityOps class employs a technique to rearrange characters. It separates characters based on their position 
 * (even or odd index) and combines the resulting sequences.
 */
public class SecurityOps {
    /**
     * Encrypts the input text by separating even and odd characters and concatenating them.
     * 
     * @param text - the original text to be encrypted
     * @return encrypted string that undergoes the encryption technique.
     */
    public static String encrypt(String text) {
        StringBuilder evenIndexChars = new StringBuilder(); // Stores characters at even indexes
        StringBuilder oddIndexChars = new StringBuilder(); // Stores characters at odd indexes
        
        // Remove spaces since they won't affect index calculations
        text = text.replace(" ", "");
        
        // Loop through each character in the text
        for (int index = 0; index < text.length(); index++) {
            char character = text.charAt(index);
            if (index % 2 == 0) { // If the character is at an even index
                evenIndexChars.append(character);
            } else { // If the character is at an odd index
                oddIndexChars.append(character);
            }
        }
        
        // Concatenate characters at even and odd indexes to form the encrypted string
        return evenIndexChars.toString() + oddIndexChars.toString();
    }
}