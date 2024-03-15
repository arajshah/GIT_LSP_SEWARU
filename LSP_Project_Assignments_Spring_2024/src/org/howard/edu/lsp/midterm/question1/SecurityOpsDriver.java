package org.howard.edu.lsp.midterm.question1;

/**
 * The SecurityOpsDriver class is responsible for demonstrating the functionality of the SecurityOps class.
 * It contains a main method that encrypts a given text using the SecurityOps.encrypt method and prints the encrypted text.
 */
public class SecurityOpsDriver {

    /**
     * The main method demonstrates the encryption functionality of the SecurityOps class.
     * It takes a text as input, encrypts it using the SecurityOps.encrypt method, and prints the encrypted text.
     * @param args The command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        // Input text
        String text = "I love CSCI363";
        
        // Encrypt the text using the encrypt method from SecurityOps class
        String encryptedText = SecurityOps.encrypt(text);
        
        // Print the encrypted text
        System.out.println("Encrypted text: " + encryptedText);
    }
}