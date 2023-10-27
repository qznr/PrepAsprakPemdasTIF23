package Course;
import java.util.Scanner;

public class PertemuanTiga {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Pembuatan object Scanner

        //Pertanyaannya aku pengen input angka, caranya bagaimana?
        //Input dari keyboard aku?
        //float bisa double
        // float angkaDecimal = in.nextFloat();
        // int angkaMasuk = in.nextInt(); //camel case
        // in.nextLine();
        String line = in.nextLine();
        //line "Halo dunia aku sekarang lagi belajar ngoding" in.nextLine();
        //"setelah belajar aku pusing" in.nextLine();
        //in.next "Halo dunia aku sekarang lagi belajar ngoding"
        //Halo
        String kata = in.next();

        char huruf = in.next().charAt(0);

        // System.out.println("Angka Double adalah " + angkaDecimal);
        // System.out.println("Angka Int adalah " + angkaMasuk);
        System.out.println("line masuk adalah " + line);
        System.out.println("Kata masuk adalah " + kata);
        System.out.println("Huruf masuk adalah " + huruf);
    }
}