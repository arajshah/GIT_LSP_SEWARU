package org.howard.edu.lsp.midterm.question1;

public class SecurityOpsDriver {
    public static void main(String[] args) {
        // Input text
        String text = "I love CSCI363";
        
        // Encrypt the text using the encrypt method from SecurityOps class
        String encryptedText = SecurityOps.encrypt(text);
        
        // Print the encrypted text
        System.out.println("Encrypted text: " + encryptedText);
    }
}
