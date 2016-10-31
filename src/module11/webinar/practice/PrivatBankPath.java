package module11.webinar.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.nio.file.*;

public class PrivatBankPath {

  public static void main(String[] args) throws IOException {

    URL url = new URL("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    BufferedReader reader = new BufferedReader(
        new InputStreamReader(url.openStream()));

    String line;
    StringBuilder stringBuilder = new StringBuilder();
    while ((line = reader.readLine()) != null) {
      stringBuilder.append(line + System.lineSeparator());
    }
    reader.close();
    String result = stringBuilder.toString();

/*    
    Path file = Paths.get(URI.create("file:///home/oleg/test/privat.json"));
    Files.write(file, result.getBytes());
*/    
    
    Path file = Paths.get("/home/oleg/test/privat.json");
    try {
      Files.write(file, result.getBytes(), StandardOpenOption.APPEND);
    } catch (NoSuchFileException e) {
      file = Paths.get(URI.create("file:///home/oleg/test/privat.json"));
      Files.write(file, result.getBytes());
    } 
    
    System.out.println("OK!\n" + result);

  }

}
