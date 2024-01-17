public class MegaBytesConverter {

    public static void main(String[] args) {

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println(kiloBytes < 0 ? "Invalid Value" : kiloBytes + " KB = " + kiloBytes / 1024 + " MB and " + kiloBytes % 1024 + " KB");

//        if(kiloBytes < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            int megabytes = kiloBytes / 1024;
//            int remainder = kiloBytes % 1024;
//            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainder + " KB");
//        }
    }
}
