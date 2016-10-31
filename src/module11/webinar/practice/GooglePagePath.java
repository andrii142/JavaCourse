package module11.webinar.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GooglePagePath {

  public static void main(String[] args) throws IOException {

    URL url = new URL("https://google.com");
//    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
    BufferedReader reader = new BufferedReader(
        new InputStreamReader(url.openStream(), "Cp1251"));

    String line;
    StringBuilder stringBuilder = new StringBuilder();
    while ((line = reader.readLine()) != null) {
      stringBuilder.append(line + System.lineSeparator());
    }
    reader.close();

    String result = stringBuilder.toString()
        .replaceAll("google", "yandex")
        .replaceAll("Google", "Yandex");

    Path file = Paths.get(URI.create("file:///home/oleg/test/google.html"));
    Files.write(file, result.getBytes(StandardCharsets.UTF_8));
    
    System.out.println("OK!" + result);

  }

}
