package Course;
import java.util.Scanner;

public class Percabangan {
    
    public static void main(String[] args) {
        
        //Statement if
        //Pernyataan if akan menentukan sebuah pernyataan (atau blok kode) akan eksekusi 
        //jika dan hanya jika persyaratan bernilai benar (true).

        //if (boolean_expression) statement;

        /* 
         * if (boolean_expression) {
         *      statement1;
         *      statement2;
         * }
         */

        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        //Program yg menentukan bilangan positif atau negatif.
        if (angka < 0) System.out.printf("Angka %d adalah bilangan negatif\n", angka);

        int nilai = in.nextInt();
        if (nilai > 80) { //Program memberikaan selamat kalau nilai > 80
            System.out.println("Nilai kamu adalah " + nilai);
            System.out.println("Congratsss!! kamu hebat dapet nilai A"); //Contoh aja, 
        }

        //Statement if-else
        //Pernyataan if-else digunakan apabila kita ingin mengeksekusi beberapa pernyataan
        //dengan kondisi true dan pernyataan yang lain dengan kondisi false

        //if (boolean_expression) statement1;
        //else statement2;

        /* 
         * if (boolean_expression) {
         *      statement1;
         *      statement2;
         * } else {
         *      statement3;
         *      statement4;
         * }
         */

        angka = in.nextInt();
        if (angka > 0) System.out.printf("Angka %d adalah bilangan positif\n", angka);
        else System.out.printf("Angka %d adalah bilangan negatif\n", angka);

        //Jika dia A, maka aku ngelakuin B.
        //Kalau dia bukan A, maka aku ngelakuin C.

        nilai = in.nextInt();

        if (nilai > 80) {
            System.out.println("Nilai kamu adalah " + nilai);
            System.out.println("Congratsss!! kamu hebat dapet nilai A");
        } else {
            System.out.println("Nilai kamu adalah " + nilai);
            System.out.println("Yahhhh nilai kamu kurang dari 80 :(");
            System.out.println("Enggak dapet nilai A");
        }

        //Statement if-else-if

        //&& AND
        //AND artinya dan
        //A dan B = true atau false
        //A true dan B true --> True
        //A true dan B false --> False
        //A false dan B true --> False
        //A false dan B false --> False

        //OR atau, jadi bisa salah satu. Selama salah satu atau lebih ada yg true, dia tetep jalan.
        //A true dan B true --> true
        //A true dan B false --> true
        //A false dan B true --> true
        //A faalse dan B false --> false

        // != NOT
        // A == B True or False
        // A <- B Assignment

        // 11%2 -> 1
        // 10 * 100

        // ||

        nilai = in.nextInt();
        if (nilai >= 80) {
            System.out.println("Nilai kamu adalah " + nilai);
            System.out.println("Congratsss!! kamu hebat dapet nilai A :D");
        } else if (nilai >= 70){
            System.out.println("Nilai kamu adalah " + nilai);
            System.out.println("Niceeee kamu dapet nilai B :)");
        } else if (nilai >= 60){
            System.out.println("Nilai kamu adalah " + nilai);
            System.out.println("Hmmmmm kamu dapet nilai C :o");
        } else if (nilai < 60){
            System.out.println("Nilai kamu adalah " + nilai);
            System.out.println("Waduhhh kamu dapet nilai D :(");
        }

        nilai = in.nextInt();
        if (nilai >= 70 && nilai < 80) {
            System.out.println("Nilai kamu adalah " + nilai);
            System.out.println("Niceeee kamu dapet nilai B :)");
        } else if (nilai >= 80){
            System.out.println("Nilai kamu adalah " + nilai);
            System.out.println("Congratsss!! kamu hebat dapet nilai A :D");
        } else if (nilai >= 60){
            System.out.println("Nilai kamu adalah " + nilai);
            System.out.println("Hmmmmm kamu dapet nilai C :o");
        } else if (nilai < 60){
            System.out.println("Nilai kamu adalah " + nilai);
            System.out.println("Waduhhh kamu dapet nilai D :(");
        }

        //Cara lain untuk membuat cabang adalah dengan menggunakan kata kunci switch.
        //Switch mengkonstruksikan cabang untuk beberapa kondisi dari nilai. 
        //Bentuk statement switch

        // switch(switch_expression):
        //     case case_1:
        //         statement1;
        //         statement2;
        //         break;
        //     case case_2:
        //         statement1;
        //         statement2;
        //         break;
        //     default:
        //         statement1;
        //         break;

        System.out.print("Enter a fruit name: "); in.nextLine();
        String fruit = in.nextLine().toLowerCase(); // biar semua jadi lower case

        switch (fruit) {
            case "apple":
                System.out.println("You selected an apple.");
            case "banana":
                System.out.println("You selected a banana.");
            case "cherry":
                System.out.println("You selected a cherry.");
            case "date":
                System.out.println("You selected a date.");
            default:
                System.out.println("Sorry, we don't have information about that fruit.");
        }
    }
}
