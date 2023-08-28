public class HelloWorld {

    public static void main(String[] args) {
        String tesKataPrintf = "Gustav";
        System.out.printf("%15s%15s\n", tesKataPrintf, tesKataPrintf);
        System.out.printf("%-15s%-15s\n", tesKataPrintf, tesKataPrintf);
        System.out.println();
        int tesAngkaPrintf = 700;
        System.out.printf("%15d%15d\n", tesAngkaPrintf, tesAngkaPrintf);
        System.out.printf("%-15d%-15d\n", tesAngkaPrintf, tesAngkaPrintf);
    }

}