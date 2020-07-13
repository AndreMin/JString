package stringpack;

public class CountCharacters {
    public static void main(String[] args) {
        String s = "The best in the world!";
        count(s);
    }

    static void count(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
