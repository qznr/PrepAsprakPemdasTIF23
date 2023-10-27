package Praktikum;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Work {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("Rp#,###.00",symbols);
        System.out.println("=========Program penghitung upah kerja=========");
        System.out.println("Rules:");
        System.out.println("1. Upah kerja berjumlah Rp50.000,-/jam.");
        System.out.println("2. Kerja lebih dari 60 jam dianggap lembur.");
        System.out.println("3. Kerja kurang dari 50 jam terkena denda.");
        System.out.println("4. Upah lembur berjumlah Rp60.000,-/jam.");
        System.out.println("5. Denda kerja berjumlah Rp10.000,-/jam.");
        System.out.println("===============================================");
        System.out.print("Masukkan jumlah jam kerja\t: "); long jam = in.nextLong();
        System.out.println("===============================================");
        long upah = 0, lembur = 0, denda = 0, total = 0;
        if (jam > 60) {
            upah += 60*50000;
            lembur += (jam-60)*60000;
        } else if (jam < 50) {
            upah += jam*50000;
            denda += (50-jam)*10000;
        } else {
            upah += jam*50000;
        }
        total = upah + lembur - denda;
        System.out.printf("%-15s: %30s\n","Upah",df.format(upah));
        System.out.printf("%-15s: %30s\n", "Lembur", lembur == 0 ? "Tidak ada lembur" : df.format(lembur));
        System.out.printf("%-15s: %30s\n", "Denda", denda == 0 ? "Tidak ada denda" : df.format(denda));        
        System.out.println("-----------------------------------------------");
        System.out.printf("%-15s: %30s\n","Total",total <= 0 ? "Membayar " +  df.format(-total): df.format(total));
    }
}