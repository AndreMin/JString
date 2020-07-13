package stringpack;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
    String s = "Garage";
    String a = "Ragega";
    anagram(s,a);
    }

    static void anagram(String s1, String s2){
        String a1 = s1.toLowerCase();
        String a2 = s2.toLowerCase();
        boolean flag=false;
        if(a1.length()==a2.length()){
            char[] ch1 = a1.toCharArray();
            char[] ch2 = a2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            for (int i=0;i<ch1.length;i++){
                if(ch1[i]!=ch2[i]){
                    flag=false;
                    break;
                }else{
                    flag=true;
                }
            }
        }
        if(flag){
            System.out.println("Is anagramma");
        }else{
            System.out.println("Not anagramma");
        }
    }


}
