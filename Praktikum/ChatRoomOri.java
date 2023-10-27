package Praktikum;

import java.util.Scanner;

public class ChatRoomOri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
 
        if (s.indexOf("h") != -1) {
            s = s.substring(s.indexOf("h"), s.length());
        } else {
            System.out.println("NO");
            return;
        }
 
        if (s.indexOf("e") != -1) {
            s = s.substring(s.indexOf("e"), s.length());
        } else {
            System.out.println("NO");
            return;
        }
 
        if (s.indexOf("l") != -1) {
            if (s.indexOf("l") == s.length() - 1) {
                System.out.println("NO");
                return;
            }
            s = s.substring(s.indexOf("l") + 1, s.length());
        } else {
            System.out.println("NO");
            return;
        }
 
        if (s.indexOf("l") != -1) {
            s = s.substring(s.indexOf("l") + 1, s.length());
        } else {
            System.out.println("NO");
            return;
        }
 
        if (s.indexOf("o") != -1) {
            s = s.substring(s.indexOf("o"), s.length());
        } else {
            System.out.println("NO");
            return;
        }
 
        System.out.println("YES");
    }
}
