package Praktikum;
import java.util.Scanner;

public class CaesarCipherLite {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean maintainCase = false;
        boolean ignoreCase = false;
        boolean includeNonAlphabet = false;
        boolean inEncodingMenu = true;
        while (inEncodingMenu) {
            System.out.printf("%-35s%s\n","1. Maintain case", maintainCase ? "ON" : "OFF");
            System.out.printf("%-35s%s\n","2. Ignore case", ignoreCase ? "ON" : "OFF");
            System.out.printf("%-35s%s\n","3. Include non-alphanumerical", includeNonAlphabet ? "ON" : "OFF");
            System.out.println("4. Input text");
            System.out.println("9. Exit");
            System.out.print("Pilihan Anda? ");
            int encodeChoice = in.nextInt();
            
            switch (encodeChoice) {
                case 1:
                    maintainCase = !maintainCase;
                    ignoreCase = false;
                    break;
                case 2:
                    ignoreCase = !ignoreCase;
                    maintainCase = false;
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
                    String encodedText = "";
                    int alphabetSize = 26;

                    for (int i = 0; i < inputText.length(); i++) {
                        char c = inputText.charAt(i);
                        char base = Character.isUpperCase(c) ? 'A' : 'a';

                        if (ignoreCase) {
                            base = 'a';  // Force all letters to lowercase if ignoreCase is true
                        }

                        if (Character.isLetter(c)) {
                            int originalAlphabetIndex = Character.toLowerCase(c) - base;
                            int newAlphabetIndex = (originalAlphabetIndex + shift) % alphabetSize;

                            if (newAlphabetIndex < 0) {
                                newAlphabetIndex += alphabetSize;
                            }

                            char encodedChar = (char) (base + newAlphabetIndex);

                            if (!maintainCase && Character.isLowerCase(c)) {
                                encodedChar = Character.toLowerCase(encodedChar);
                            }

                            encodedText += encodedChar;
                        } else {
                            if (includeNonAlphabet) {
                                int shiftAmount = shift % 26;
                                char shiftedChar = (char) (c + shiftAmount);
                                encodedText += shiftedChar;
                            } else {
                                encodedText += c;
                            }
                        }
                    }
                    System.out.println("Encoded text: " + encodedText);
                    break;
                case 9:
                    inEncodingMenu = false;
                    break;
                default:
                    // Handle invalid input
            }
        }
    }
}
