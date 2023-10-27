package Course;
public class Perulangan {
    
    public static void main(String[] args) {
        //Perulangan
        //Kode akan dijalankan berulang kali.

        int angka =  3;
        while(angka > 0) {
            System.out.println(angka);
            angka--;
        }

        while(angka > 0) {
            System.out.println("Apakah kode berjalan?");
        }

        do {
            System.out.println("Kode berjalan meskipun tidak memenuhi");
            System.out.println(angka);
            //Pasti berjalan sekali
        } while(angka > 0);


        for (int i = 1; i <= 5;) {
            System.out.println("Ini berjalan dari i = " + i);
        }

        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Ini berjalan dari i = " + i);
        // }

        int i = 0;
        while(i < 10) {
            System.out.println("Ini akan berjalan dari i = " + i);
            i++;
        }
    }
}
