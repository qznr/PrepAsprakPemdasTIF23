public class Operator {

    public static void main(String[] args) {

        int angka = 100;
        int angkaDua = 200;
        System.out.println(angka + angkaDua);
        System.out.println("100 + 200 = " + (angka + angkaDua));
        System.out.println("100 + 200 tanpa kurung = " + angka + angkaDua);
        System.out.println(angka - angkaDua);
        System.out.println("100 - 200 = " + (angka - angkaDua));
        System.out.println("100 - 200 tanpa kurung = " + angka + -angkaDua);
        System.out.println(50*5);
        System.out.println(55f/2);
        System.out.println(200%5);
        System.out.println(201%5);
        System.out.println(202%5);
        System.out.println(203%5);
        System.out.println(204%5);
        System.out.println(205%5); // Operasi Modulo sama aplikasinya

        //Uninary operation
        angka++; //increment
        //variable++
        //variable + 1
        System.out.println(angka);
        angka--;
        System.out.println(angka);

        //Binary operation
        angka = angka + 7;
        System.out.println(angka);
        angka = angka - 17;
        System.out.println(angka);

        angka *= 2;
        System.out.println(angka);
        angka -= 5;
        System.out.println(angka);

        //Post increment
        System.out.println("\nPost Increment");
        System.out.println(angka++); //angka++ -> 100+1 dilakukan setelah pencetakan. 100+1
        System.out.println(angka); //kita cek
        System.out.println(angka--);//angka-- -> 101-1 dilakukan setelah pencetakan selesai berjalan.
        System.out.println(angka); //kita cek 100

        //Pre Increment
        System.out.println("Pre Increment");
        System.out.println(++angka); //melakukan operasi terlebih dahulu. ++angka -> 100 + 1 dilakukan dahulu sebelum pencetakan.
        System.out.println(--angka);

        //char juga bisa increment maupun decrement
        char huruf = 'a';
        
        System.out.println("asci a : " + (int) 'a');
        System.out.println("asci b : " + (int) 'b');

        System.out.println(++huruf);
        System.out.println(--huruf);

        System.out.println(huruf+=10);
    }
}

//bit
//ascii
//operasi modulo
//post dan pre increment