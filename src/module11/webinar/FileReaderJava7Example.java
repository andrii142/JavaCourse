package module11.webinar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderJava7Example {
    public static void main(String[] args) {

        try {
            //this is try with resourses, and readed will be cloed automatically
            try (BufferedReader br = new BufferedReader(new FileReader("/Users/Andrey/Desktop/file.txt"))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                String everything = sb.toString();
                System.out.println(everything);
            }
        } catch (IOException e) {

        }
    }
}
