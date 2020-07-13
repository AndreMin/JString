package stringpack;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Madam";
        palindrome(s);
    }

    static void palindrome(String a) {
        boolean flag = true;
        String s = a.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Is palindrome!");
        } else {
            System.out.println("NOT palindrome!");
        }
    }
}
