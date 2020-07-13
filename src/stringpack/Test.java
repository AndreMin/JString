package stringpack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        String s1 = "ObJeCt  object,objEct  sdf sdf q wer ty  ?";
        String s2 = "The best, perhaps, bear in the world is  PH!";
        String s3 = "babagfg";
//        allsubs(s2);
//        anagram(s1, s2);
//        countch(s1);
//        duplicate(s1);
//        equalsubs(s1, 6);
//        frech(s1);
//        getFromFile();
//        tolowercase(s1);
//        palindrome(s2);
//        replaceSp(s1);
//        revertStr(s3);
//        strRotate(s3,s2);
        shortest(s2);
    }

    static void allsubs(String s) {
        int n = s.length() * (s.length() + 1) / 2;
        String[] arr = new String[n];
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                arr[t] = s.substring(i, j + 1);
                t++;
            }
        }
        for (String a : arr) {
            System.out.println(a);
        }
    }

    static void anagram(String s1, String s2) {
        boolean flag = true;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (ch1.length != ch2.length) {
            flag = false;
        } else {
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Is Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    static void countch(String s) {
        char[] arr = s.toCharArray();
        int g = arr.length;
        System.out.println(g);
    }

    static void duplicate(String s) {
        String[] arr = s.split("([,.\\s]+)");
        int[] fr = new int[arr.length];
        int vis = -1;
        for (int i = 0; i < arr.length; i++) {
            int c = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    fr[j] = vis;
                    c++;
                }
            }
            if (fr[i] != vis) {
                fr[i] = c;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (fr[i] != vis) {
                System.out.println(arr[i] + " - " + fr[i]);
            }
        }
    }

    static void equalsubs(String s, int n) {
        if (s.length() % n != 0) {

            System.out.println("Cannot be divided " + s.length());
        } else {
            int a = s.length() / n;
            int b = s.length() / n;
            int i = 0;
            while (i < s.length()) {
                String str = s.substring(i, a);
                System.out.println(str);
                i += b;
                a += b;
            }
        }
    }

    static void frech(String s) {
        char[] arr = s.toCharArray();
        int[] fr = new int[arr.length];
        int vis = -1;
        char minCh = arr[0];
        char maxCh = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int c = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    fr[j] = vis;
                    c++;
                }
            }
            if (fr[i] != vis) {
                fr[i] = c;
            }
        }
        int min = fr[0];
        int max = fr[0];
        for (int i = 0; i < arr.length; i++) {
            if (fr[i] != vis && fr[i] < min) {
                min = fr[i];
                minCh = arr[i];
            }
            if (fr[i] != vis && fr[i] > max) {
                max = fr[i];
                maxCh = arr[i];
            }
        }

        System.out.println(maxCh + " - " + max);
        System.out.println(minCh + " - " + min);
    }

    static void getFromFile() throws Exception {
        FileReader file = null;
        try {
            file = new FileReader("D://1.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(file);

        int max = 0;
        String line, word = "";
        ArrayList<String> list = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            String[] str = line.toLowerCase().split("[,.;\\s\\n]+");
            for (String s : str) {
                list.add(s);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (max < count) {
                max = count;
                word = list.get(i);
            }
        }
        System.out.println(word + " - " + max);
        reader.close();
    }

    static void tolowercase(String s) {
        StringBuilder str = new StringBuilder(s);
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                str.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
            if (Character.isUpperCase(s.charAt(i))) {
                str.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(str);
    }

    static void palindrome(String s) {
        s = s.toLowerCase();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    static void replaceSp(String s) {
        String str = s.replace(" ", "");
        System.out.println(str);
    }

    static void revertStr(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }
        System.out.println(str);
    }
    static void strRotate(String s1, String s2){
        String str =s1+s1;
        if(str.indexOf(s2)!=-1){
            System.out.println("Ok");
        }else {
            System.out.println("NotOk");
        }
    }
    static void shortest(String s){
        s=s.toLowerCase();

        String[] arr = s.split("[.,\\s]+");
        int min=arr[0].length();
        String[] smin=new String[arr.length];
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i].length()<arr[j].length()){
                    min=arr[i].length();
                  smin[i] = arr[i];
                }
            }
        }
       for (int i=0; i<arr.length;i++){
           if(smin[i]!=null && smin[i].length()==min){
               System.out.println(smin[i]+" - "+min);
           }
       }
    }
}


