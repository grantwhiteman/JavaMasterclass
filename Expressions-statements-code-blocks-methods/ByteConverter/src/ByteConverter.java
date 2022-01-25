public class ByteConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        String output = "Invalid Value";
        if (kiloBytes >= 0) output = kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB";
        System.out.println(output);
    }
}
