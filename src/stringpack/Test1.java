package stringpack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws Exception {
        String s1 = "The bESt beAr of the best one in the WORLD!";
        String s2 = "Kayak";
//        allsubs(s1);
//        anagram(s1, s2);
//        dupl(s1);
//        equalsubs(s1, 7);
//        freqch(s1);
//        fromfile();
//        palindrome(s2);
//        replace(s1);
//        reversestr(s1);
        shortestword(s1);
    }

    static void allsubs(String s) {
        int n = s.length() * (s.length() + 1) / 2;
        int temp = 0;
        String[] arr = new String[n];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                arr[temp] = s.substring(i, j + 1);
                temp++;
            }
        }
        for (String a : arr) {
            System.out.println(a);
        }
    }

    static void anagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        boolean flag = true;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (s1.length() != s2.length()) {
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
            System.out.println("Is anagram");
        } else {
            System.out.println("Not anagram");
        }
    }

    static void dupl(String s) {
        String[] str = s.split("[.,/\\s]+");
        int fr[] = new int[str.length];
        int vis = -10;
        for (int i = 0; i < str.length; i++) {
            int c = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    fr[j] = vis;
                    c++;
                }
            }
            if (fr[i] != vis) {
                fr[i] = c;
            }
        }
        for (int i = 0; i < str.length; i++) {
            if (fr[i] != vis) {
                System.out.println(str[i] + " - " + fr[i]);
            }
        }
    }

    static void equalsubs(String s, int n) {
        if (s.length() % n != 0) {
            System.out.println("Cannot be divided " + s.length());
        } else {
            int b = s.length() / n;
            int c = s.length() / n;
            int i = 0;
            while (i < s.length()) {
                String a = s.substring(i, b);
                i += c;
                b += c;
                System.out.println(a);
            }
        }
    }

    static void freqch(String s) {
        char[] ch = s.toCharArray();
        int[] fr = new int[ch.length];
        int vis = -1;
        for (int i = 0; i < ch.length; i++) {
            int c = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    fr[j] = vis;
                    c++;
                }
            }
            if (fr[i] != vis) {
                fr[i] = c;
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if (fr[i] != vis) {
                System.out.println(ch[i] + " - " + fr[i]);
            }
        }
    }

    static void fromfile() throws Exception {
        String line, word = "";
        ArrayList<String> list = new ArrayList<>();
        int max = 0;
        FileReader file = new FileReader("D://1.txt");
        BufferedReader reader = new BufferedReader(file);
        while ((line = reader.readLine()) != null) {
            String[] arr = line.toLowerCase().split("[.,/;\\s\\n]+");
            for (String s : arr) {
                list.add(s);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int c = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    c++;
                }
            }
            if (max < c) {
                max = c;
                word = list.get(i);
            }
        }
        System.out.println(word + " - " + max);
    }

    static void palindrome(String s) {
        boolean flag = true;
        s = s.toLowerCase();
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

    static void replace(String s) {
        System.out.println(s);
        StringBuilder str = new StringBuilder(s);
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
    static void reversestr(String s){
        System.out.println(s);
        String a="";
        for (int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);
        }
        System.out.println(a);
    }

    static void shortestword(String s){
        String[] arr = s.split(" ");
        String word="";
        int min=arr[0].length();
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<min){
                min=arr[i].length();
                word=arr[i];
            }
        }
        System.out.println(word+" - "+min);
    }
}
