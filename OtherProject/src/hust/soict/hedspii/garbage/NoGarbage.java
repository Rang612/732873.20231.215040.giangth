package hust.soict.hedspii.garbage;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.sql.SQLOutput;
public class NoGarbage {
    public static void main(String[] argvs) throws IOException {
        String filename = "D:\\IT3130.732873.2023.1.215040.giangth\\OtherProject\\src\\hust\\soict\\hedspii\\garbage\\test.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;
        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputStringBuilder.append((char) b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}