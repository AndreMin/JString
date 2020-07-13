package stringpack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FromFile {
    public static void main(String[] args) throws Exception {
        getFromFile();
    }

    static void getFromFile() throws Exception {
        int count = 0;
        int max = 0;
        String line, word = "";
        ArrayList<String> list = new ArrayList<>();

        FileReader file = new FileReader("D://1.txt");
        BufferedReader reader = new BufferedReader(file);

        while ((line = reader.readLine()) != null) {
            String[] str = line.toLowerCase().split("([,.;\\s\\n]+)");
            for (String s : str) {
                list.add(s);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            count = 1;
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                word = list.get(i);
            }
        }
        System.out.println("The repeated word is: " + word + " - " + max);
        reader.close();
    }
}
