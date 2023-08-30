public class Variabel {
    public static void main(String[] args) {

        /* Variabel adalah item yang digunakan data untuk menyimpan pernyataan objek. Variabel memiliki tipe data dan nama. 
         * Tipe data menandakan tipe nilai yang dapat dibentuk oleh variabel itu sendiri.
         * Nama variabel harus mengikuti aturan untuk identifier. 
         */

        /*
         * Tipe data dibagi menjadi dua, yaitu tipe data primitif dan tipe data reference.
         * Tipe data primitif adalah tipe data simple yang menyimpan langsung nilai dia sendiri. 
         * Misalnya: 64, 20.3, -390, 077, 0xFFFF
         * Tipe data reference sesuai dengan namanya yaitu tipe data yang merefenrensikan ke tempat lain (tidak menyimpan nilai secara langsung)
         * Hal ini dilakukan karena data yang disimpan bersifat kompleks, tidak seperti tipe data primitif,
         * Misalnya: String, Object, Array, Node, LinkedList, Stack, Queue, Tree, Graph, dan struktur data lainnya.
         */

        // Tipe data Primitif ada dua, yaitu tipe data integral dan tipe data floating point.


        //Tipe data textual primitif
        //Char berada diantara single quote ('')
        char hurufKecilA = 'a';
        char hurufBesarB = 'B';
        char simbolAsterisk = '*';
        char singleQuote = '\''; // Backslash digunakan sebagai character escape (untuk menyampaikan makna yang berbeda pada sebuah karakter)
        char doubleQuote = '\"';

        //String adalah tipe data reference, tapi saya masukkan saja sekalian.
        String pesan = "Hello world"; //String berada diantara double quote ("")
        System.out.println(pesan);


        /* Tipe data Boolean adalah tipe data yang menyimpan dua nilai (bersifat binary), yaitu true or false. 
         * Tipe data logika
         */

        boolean isBenar = true;
        boolean isSalah = false;
        boolean isBiggerThanNinety = 100 > 90;
        System.out.println(isBenar);
        System.out.println(isSalah);
        System.out.println(isBiggerThanNinety);
        System.out.println(100>90);
        System.out.println(90>100);

        /* 
         * Tipe data integral yaitu byte, short, int, dan long.
         * Tipe data integral menyimpan bilangan bulat positif maupun negatif tanpa pecahan maupun angka desimal.
         */

        System.out.println(hurufKecilA);
        System.out.println(hurufBesarB);
        System.out.println(simbolAsterisk);
        System.out.println(singleQuote);
        System.out.println(doubleQuote);
        System.out.println();



        byte angkaByte = 64;
        byte minimumByteValue = Byte.MIN_VALUE;
        byte maximumByteValue = Byte.MAX_VALUE;

        System.out.println("Angka Byte : " + angkaByte);
        System.out.println("Minimum Value Byte : " + minimumByteValue);
        System.out.println("Maximum Byte : " + maximumByteValue);
        System.out.println();

        int angkaInteger = 19;
        int minimumIntegerValue = Integer.MIN_VALUE; // 
        int maximumIntegerValue = Integer.MAX_VALUE; // 

        System.out.println("Angka Integer : " + angkaInteger);
        System.out.println("Minimum Value Integer : " + minimumIntegerValue);
        System.out.println("Maximum Integer : " + maximumIntegerValue);
        System.out.println();

        long angkaLong = 999999999999999999l;
        long minimumLongValue = Long.MIN_VALUE; //
        long maximumLongValue = Long.MAX_VALUE; //

        System.out.println("Angka Long : " + angkaLong);
        System.out.println("Minimum Value Long : " + minimumLongValue);
        System.out.println("Maximum Long : " + maximumLongValue);
        System.out.println();

        float angkaFloat = 19.9f;
        float minimumFloatValue = Float.MIN_VALUE; //
        float maximumFloatValue = Float.MAX_VALUE; //

        System.out.println("Angka Float : " + angkaFloat);
        System.out.println("Minimum Value Float : " + minimumFloatValue);
        System.out.println("Maximum Float : " + maximumFloatValue);
        System.out.println();

        double angkaDouble = 999999999999999999.9d;
        double minimumDoubleValue = Double.MIN_VALUE; //
        double maximumDoubleValue = Double.MAX_VALUE; //

        System.out.println("Angka Double : " + angkaDouble);
        System.out.println("Minimum Value Double : " + minimumDoubleValue);
        System.out.println("Maximum Double : " + maximumDoubleValue);
        System.out.println();

        //Casting
        //Konversi tipe data ke tipe data lain.
        //Ada dua, implisit dan explicit casting.

        //Implicit
        int numInt = 100;
        double numDouble = numInt;
        System.out.println(numDouble);

        //Explicit
        numDouble = 240.5;
        numInt = (int) numDouble;
        System.out.println(numInt);

        char huruf = 'x';
        int angkaASCI = (int) huruf;
        System.out.println(angkaASCI);
    }
}