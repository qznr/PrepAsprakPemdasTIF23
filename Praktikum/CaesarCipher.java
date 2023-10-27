package Praktikum;
import java.util.Scanner;

public class CaesarCipher {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean maintainCase = false;
        boolean ignoreCase = false;
        boolean includeNonAlphabet = false;

        System.out.println("Caesar Cypher :");
        System.out.println("1. Encode");
        System.out.println("2. Decode");
        System.out.println("3. Exit");
        System.out.print("Pilihan Anda? ");
        int pilihan = in.nextInt();
        
        switch(pilihan){
            case 1: 
                boolean inEncodingMenu = true;
                while (inEncodingMenu) {
                    System.out.printf("%-35s%s\n","1. Maintain case", maintainCase ? "ON" : "OFF");
                    System.out.printf("%-35s%s\n","2. Ignore case", ignoreCase ? "ON" : "OFF");
                    System.out.printf("%-35s%s\n","3. Include non-alphanumerical", includeNonAlphabet ? "ON" : "OFF");
                    System.out.println("4. Input text");
                    System.out.println("9. Back");
                    System.out.print("Pilihan Anda? ");
                    int encodeChoice = in.nextInt();
                    
                    switch (encodeChoice) {
                        case 1:
                            maintainCase = !maintainCase;
                            break;
                        case 2:
                            ignoreCase = !ignoreCase;
                            break;
                        case 3:
                            includeNonAlphabet = !includeNonAlphabet;
                            break;
                        case 4:
                            // Get the input text from the user
                            in.nextLine();  // Consume the previous newline character
                            System.out.print("Enter the text to encode: ");
                            String inputText = in.nextLine();
                            System.out.print("Enter the shift (integer): ");
                            int shift = in.nextInt();
                            String encodedText = encodeCaesarCipher(inputText, shift, maintainCase, ignoreCase, includeNonAlphabet);
                            System.out.println("Encoded text: " + encodedText);
                            break;
                        case 9:
                            // Handle going back to the main menu
                            break;
                        default:
                            // Handle invalid input
                    }
                }
                break;
            case 2:
                System.out.printf("%-35s%s\n","1. Maintain case", maintainCase ? "ON" : "OFF");
                System.out.printf("%-35s%s\n","2. Ignore case", ignoreCase ? "ON" : "OFF");
                System.out.printf("%-35s%s\n","3. Include non-alphanumerical", includeNonAlphabet ? "ON" : "OFF");
                System.out.println("4. Input text");
                System.out.println("9. Back");
                System.out.print("Pilihan Anda? ");
                int decodeChoice = in.nextInt();
                break;
            default:

        }
    }

    public static String encodeCaesarCipher(String text, int shift, boolean maintainCase, boolean ignoreCase, boolean includeNonAlphabet) {
        String encodedText = "";
        int alphabetSize = 26;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';

                if (ignoreCase) {
                    base = 'A';  // If ignoreCase is true, convert all letters to uppercase
                }

                int originalAlphabetIndex = c - base;
                int newAlphabetIndex = (originalAlphabetIndex + shift) % alphabetSize;

                if (newAlphabetIndex < 0) {
                    newAlphabetIndex += alphabetSize;
                }

                char encodedChar = (char) (base + newAlphabetIndex);

                if (!maintainCase && Character.isLowerCase(c)) {
                    encodedChar = Character.toLowerCase(encodedChar);  // Convert back to lowercase if needed
                }
                encodedText += encodedChar;
            } else {
                if (includeNonAlphabet) {
                    // Include non-alphabet characters by shifting them
                    int shiftAmount = shift % 26;
                    char shiftedChar = (char) (c + shiftAmount);
                    encodedText += shiftedChar;
                } else {
                    encodedText += c;  // Include non-alphabet characters without modification
                }
            }
        }
        return encodedText;
    }

}
