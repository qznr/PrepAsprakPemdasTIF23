import java.util.Scanner;  //Untuk menggunakan Scanner harus mengimport library terlebih dahulu

public class InputOutput {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte angkaByte = in.nextByte();
        short angkaShort = in.nextShort();
        int angkaInt = in.nextInt();
        long angkaLong = in.nextLong();
        float angkaFloat = in.nextFloat();
        double angkaDouble = in.nextDouble(); in.nextLine();//Jangan lupa untuk menambagkan nextLine() setelah next() jika ada input lagi.
        //next() apapun itu kecuali nextLine() misal nextInt(), nextFloat(), nextDouble(), maupun next() saja.
        //Hal ini dikarenakan sifat next() yang hanya mengambil karakter yang diperlukan (dimaksud) saja.
        //Contoh next() yang hanya mengambil sebelum spasi atau sebelum baris baru.
        //Lalu untuk nextInt() maupun untuk yang floating point seperti nextFloat() hanya mengambil angka saja.
        //Nah karena itu, ketika kita memencet enter artinya kita membuat baris baru.
        //Dalam komputer sendiri sebenarnya mencetak karakter tak terlihat yang mewakili baris baru, yaitu new line.
        //Ketika kita menggunakan next(), new line itu tidak diambil, jadi masih tersisa di dalam buffer (anggap saja memori sementara).
        //Lalu saat kita menggunakan next() lagi, kita malah mengambil new line yang tersisa tadi dan selesai sebelum mengambil input yang sebenarnya kita mau.
        //Contoh :
        //"Teknik\nInformatika" \n adalah karakter line seperatornya (ketika kita memencet enter).
        //"\nInformatika" setelah kita memanggil next()
        //"Informatika" kita memanggil next() lagi namun yang terambil adalah /n dan bukan "Informatika", ketika kita mencetak maka muncullah baris kosong dan bukan "Informatika"
        //Contoh 2:
        //500\n adalah input kita
        //\n setelah kita menggunakan nextInt()
        //Namun, ketika kita ada input baru misalnya angka 700, di buffer akan menjadi
        //\n700
        //700 akan terlewati karena nextInt() mengambil karakter line separator tadi, bukannya angka 700.
        String kalimat = in.nextLine(); // Input sampai baris baru (new line)
        String kata = in.next(); //Input sampai spasi
        in.nextLine(); //Jangan lupa untuk menambagkan nextLine() setelah next() jika ada input lagi.

        //Tidak ada nextChar(), gunakan next() namun ditambah dengan method charAt(index) untuk mengambil karakter dari kata tersebut.
        char huruf = in.next().charAt(0); in.nextLine(); //Jangan lupa nextLine() setelah next() apapun itu.

        System.out.println("==================================");
        System.out.println(angkaByte);
        System.out.println(angkaShort);
        System.out.println(angkaInt);
        System.out.println(angkaLong);
        System.out.println(angkaFloat);
        System.out.println(angkaDouble);
        System.out.println(kalimat);
        System.out.println(kata);
        System.out.println(huruf);
        System.out.println("==============================");

        //Output
        //Ada tiga method untuk output di java, yaitu:
        //System.out.println(); mencetak apa adanya.
        //System.out.println(); mencetak lalu diakhiri dengan baris baru.
        //System.out.printf(format, arguments); mencetak dengan formatting.
        
        //Aturan format
        //%[width][.precision][flags]
        //flags menentukan format yang dipakai, mencetak decimal atau floating-point ataupun string.

        //Contoh penggunaan
        //%s untuk string
        //%d untuk decimal
        //%f untuk floating point

        //flags Wajib ada untuk formatting, lalu untuk modifier selanjutnya opsional.
        
        //width menentukan jumlah karakter yang dicetak.
        //Contoh penggunaan
        //%15s (ada 15 karakter totalnya. Jika kata kurang dari 15, akan diisi spasi lalu ada kata yang akan dikeluarkan dengan total 15 karakter)
        //%-15s (sama, namun kata akan dicetak terlebih dahulu baru spasi, total karakter berjumlah 15)

        String tesKataPrintf = "Gustav";
        System.out.printf("%15s%15s\n", tesKataPrintf, tesKataPrintf);
        System.out.printf("%-15s%-15s\n", tesKataPrintf, tesKataPrintf);
        System.out.println("------------------------------");
        System.out.printf("%15S%15S\n", tesKataPrintf, tesKataPrintf); //gunakan S besar untuk format kapital
        System.out.printf("%-15S%-15S\n", tesKataPrintf, tesKataPrintf);
        System.out.println("------------------------------");
        int tesAngkaPrintf = 700;
        System.out.printf("%15d%15d\n", tesAngkaPrintf, tesAngkaPrintf);
        System.out.printf("%-15d%-15d\n", tesAngkaPrintf, tesAngkaPrintf);
        System.out.println("------------------------------");
        float tesFloatPrintf = 700.7f;
        System.out.printf("%15f%15f\n", tesFloatPrintf, tesFloatPrintf);
        System.out.printf("%-15f%-15f\n", tesFloatPrintf, tesFloatPrintf);
        System.out.println("==============================");

        //Untuk floating-point precision error tersebut dikarenakan memang batasan dari implementasi komputer biner (base 2) menghitung angka decimal (base 10).
        //Untuk penjelasan lebih lanjut ada di youtube ketik saja keyword "floating-point approximation".

        //precision menentukan presisi yang diinginkan
        //Contoh
        System.out.printf("%.1f\n", tesFloatPrintf);
        System.out.printf("%.2f\n", tesFloatPrintf);
        System.out.printf("%.3f\n", tesFloatPrintf);
        System.out.println("------------------------------");
        System.out.printf("%.1s\n", tesKataPrintf);
        System.out.printf("%.2s\n", tesKataPrintf);
        System.out.printf("%.3s\n", tesKataPrintf);
        System.out.println("==============================");
        //Pemakaiannya juga bisa digabung
        //Contoh
        System.out.printf("%15.3s%15.3s\n", tesKataPrintf, tesKataPrintf);
        System.out.printf("%-15.3s%-15.3s\n", tesKataPrintf, tesKataPrintf);
        System.out.println("------------------------------");
        System.out.printf("%15.3S%15.3S\n", tesKataPrintf, tesKataPrintf); //gunakan S besar untuk format kapital
        System.out.printf("%-15.3S%-15.3S\n", tesKataPrintf, tesKataPrintf);
        System.out.println("------------------------------");
        System.out.printf("%15.3f%15.3f\n", tesFloatPrintf, tesFloatPrintf);
        System.out.printf("%-15.3f%-15.3f\n", tesFloatPrintf, tesFloatPrintf);
        System.out.println("==============================");

        //Selain \n untuk new line, ada juga \t untuk tab.
        //Contoh
        System.out.printf("%s\t%s\n",tesKataPrintf, tesKataPrintf);
        System.out.printf("%s\t\t%s\n",tesKataPrintf, tesKataPrintf);
        System.out.printf("%s\t\t\t%s\n",tesKataPrintf, tesKataPrintf);

        //Contoh Program Input output sederhana
        System.out.println("\n==============Program Sederhana==============");
        System.out.print("Input nama anda\t\t: ");
        String nama = in.nextLine();
        System.out.print("Input usia anda (tahun) : ");
        byte usia = in.nextByte(); in.nextLine(); //Jangan lupa nextLine() setelah next() apapun itu.
        System.out.print("Input IPK anda\t\t: ");
        float ipk = in.nextFloat(); in.nextLine(); //Jangan lupa nextLine() setelah next() apapun itu.

        //Output
        System.out.println("==============Output Sederhana===============");
        System.out.printf("Nama\t: %-20s\n", nama);
        System.out.printf("Usia\t: %-20d\n", usia);
        System.out.printf("IPK\t: %-20.2f\n", ipk);

        in.close();
    }
}
