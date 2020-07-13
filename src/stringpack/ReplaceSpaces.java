package stringpack;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String s = "The best in the world";
        removeSp(s);
    }

    static void removeSp(String s) {

//        String a = s.replaceAll(" ", "");
        String b = s.replace(" ","");

//        System.out.println(a);
        System.out.println(b);
    }
}

