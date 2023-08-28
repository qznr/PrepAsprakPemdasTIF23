public class TipeData {
    public static void main(String[] args) {

        /*
         * Tipe data dibagi menjadi dua, yaitu tipe data primitif dan tipe data reference.
         * Tipe data primitif adalah tipe data simple yang menyimpan langsung nilai dia sendiri. 
         * Misalnya: 64, 20.3, -390, 077, 0xFFFF
         * Tipe data reference sesuai dengan namanya yaitu tipe data yang merefenrensikan ke tempat lain (tidak menyimpan nilai secara langsung)
         * Hal ini dilakukan karena data yang disimpan bersifat kompleks, tidak seperti tipe data primitif,
         * Misalnya: Object, Array, Node, LinkedList, Stack, Queue, Tree, Graph, dan struktur data lainnya.
         */

        // Tipe data Primitif ada dua, yaitu tipe data integral dan tipe data floating point.

        /* 
         * Tipe data integral yaitu byte, short, int, dan long.
         * Tipe data integral menyimpan bilangan bulat positif maupun negatif tanpa pecahan maupun angka desimal.
         */

        byte angkaByte = 64;
        byte minimumByteValue = Byte.MIN_VALUE;
        byte maximumByteValue = Byte.MAX_VALUE;

        int angkaInteger = 19;
        int minimumIntegerValue = Integer.MIN_VALUE; // 
        int maximumIntegerValue = Integer.MAX_VALUE; // 

        long angkaLong = 999999999999999999l;
        long minimumLongValue = Long.MIN_VALUE; //
        long maximumLongValue = Long.MAX_VALUE; //

        System.out.println(angkaLong);

        float angkaFloat = 19.9f;
        float minimumFloatValue = Float.MIN_VALUE; //
        float maximumFloatValue = Float.MAX_VALUE; //

        double angkaDouble = 999999999999999999.9d;
        double minimumDoubleValue = Double.MIN_VALUE; //
        double maximumDoubleValue = Double.MAX_VALUE; //

        char hurufKecilA = 'a';
        char hurufBesarB = 'B';
        char simbolAsterisk = '*';
        char singleQuote = '\''; // Backslash digunakan sebagai character escape (untuk menyampaikan makna yang berbeda pada sebuah karakter)
        char doubleQuote = '\"';

        /* Tipe data Boolean adalah tipe data yang menyimpan dua nilai (bersifat binary), yaitu true or false. 
         * 
         */

        boolean isBenar = true;
        boolean isSalah = false;
        boolean isBiggerThanNinety = 100 > 90;
    }
}