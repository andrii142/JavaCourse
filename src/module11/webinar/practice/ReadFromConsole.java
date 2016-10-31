package module11.webinar.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFromConsole {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        List<Double> doubles = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        String line;
        while (!(line = reader.readLine()).equals("q")) {
            try {
                //double res = Double.valueOf(line);
                //doubles.add(res);
                integers.add(Integer.valueOf(line));
            } catch (NumberFormatException e) {
                try {
                    doubles.add(Double.valueOf(line));
                } catch (NumberFormatException e1) {
                    strings.add(line);
                }
            }
        }

        //other solution
        /*String line = "";
        boolean parsed;

        while (!(line = reader.readLine()).equals("q")) {
            parsed = false;

            try {
                integers.add(Integer.parseInt(line));
                parsed = true;
            } catch (NumberFormatException ex) {
                // TODO: handle exception
            }
            if (!parsed) {
                try {
                    doubles.add(Double.parseDouble(line));
                    parsed = true;
                } catch (NumberFormatException ex) {
                    // TODO: handle exception
                }
            }
            if (!parsed) {
                strings.add(line);
            }

        }*/

        reader.close();


        if (!integers.isEmpty()) {
            System.out.println(integers);
        }
        if (!doubles.isEmpty()) {
            System.out.println(doubles);
        }
        if (!strings.isEmpty()) {
            System.out.println(strings);
        }
    }
}
