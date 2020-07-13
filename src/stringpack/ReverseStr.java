package stringpack;

public class ReverseStr {
    public static void main(String[] args) {
        String str = "The best bear in the world";
        reverseStr(str);
    }

    static void reverseStr(String s) {
        System.out.println(s);
        String a = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            a = a + s.charAt(i);
        }
        System.out.println(a);
    }
}
