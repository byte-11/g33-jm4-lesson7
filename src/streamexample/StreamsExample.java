package streamexample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class StreamsExample {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("resources/bot.png");
//        int next;
//        while ((next = fis.read()) != -1) {
//            System.out.print((char) next);
//        }
//        fis.close();
//
//        String str = "WOW";
//        FileOutputStream fos = new FileOutputStream("resources/ios.txt");
//        for (byte aByte : str.getBytes()) {
//            fos.write(aByte);
//        }
//        fos.close();

        FileReader fileReader = new FileReader("resources/ios.txt");
        BufferedReader bf = new BufferedReader(fileReader);
        String nextLine;
        while ((nextLine = bf.readLine()) != null){
            System.out.println(nextLine);
        }


        bf.lines().forEach(System.out::println);

    }
}
