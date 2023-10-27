package Praktikum;

import java.util.Scanner;

public class ChatRoom {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
     
            if (s.indexOf("a") != -1) {
                s = s.substring(s.indexOf("a"), s.length());
            } else {
                System.out.println("Maybe he's confused after all.");
                return;
            }

            if (s.indexOf("p") != -1) {
                if (s.indexOf("p") == s.length() - 1) {
                    System.out.println("Maybe he's confused after all.");
                    return;
                }
                s = s.substring(s.indexOf("p") + 1, s.length());
            } else {
                System.out.println("Maybe he's confused after all.");
                return;
            }
     
            if (s.indexOf("p") != -1) {
                s = s.substring(s.indexOf("p") + 1, s.length());
            } else {
                System.out.println("Maybe he's confused after all.");
                return;
            }
     
            if (s.indexOf("l") != -1) {
                s = s.substring(s.indexOf("l"), s.length());
            } else {
                System.out.println("Maybe he's confused after all.");
                return;
            }
     
            if (s.indexOf("e") != -1) {
                s = s.substring(s.indexOf("e"), s.length());
            } else {
                System.out.println("Maybe he's confused after all.");
                return;
            }
     
            System.out.println("he's a little confused but he got the spirit.");
    }    
}
