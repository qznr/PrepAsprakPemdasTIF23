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
        if (angka>0) System.out.printf("Angka %d adalah bilangan positif", angka);

        int nilai = in.nextInt();
        if (nilai > 80) {
            System.out.println("Nilai kamu adalah " + nilai);
            System.out.println("Congratsss!! kamu hebat dapet nilai A");
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
        if (angka>0) System.out.printf("Angka %d adalah bilangan positif", angka);
        else System.out.printf("Angka %d adalah bilangan negatif", angka);

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
    }
}
