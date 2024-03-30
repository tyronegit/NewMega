public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(-1);
        printMegaBytesAndKiloBytes(-2050);
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(3000);
    }
}

