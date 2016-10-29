package module11.webinar;

import java.io.*;

public class FileReaderExample {

    //does nothing
    void test() {
        int n = 5;
        while (n > 0) {
            if (n == 3) return;
            System.out.println(n);
            n--;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br;
        try {
            FileReader fileReader = new FileReader("/Users/Andrey/Desktop/file.txt");
            br = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                if (!line.equals("pop")) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                }
                line = br.readLine();

                //line=+br.readLine();
                //line+='\n'
            }

            String everything = sb.toString();
            System.out.println(everything);

            BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/Andrey/Desktop/file.txt"));
            bw.write(everything);
            bw.close();
        } catch (IOException e) {
            System.out.println("read failed");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("can't close reade");
            }
        }

       /* BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/Andrey/Desktop/file.txt"));
        bw.newLine();
        bw.write("BufferedWriter works");
        //bw.append("dddd", 5, 5);
        bw.close();*/
    }
}
