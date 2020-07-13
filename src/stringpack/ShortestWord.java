package stringpack;

public class ShortestWord {
    public static void main(String[] args) {
        String s = "The best, perhaps, bear in the world is a PH!";
        shortestWord(s);
    }

    static void shortestWord(String s) {
        String[] arr = s.split(" ");
        String min = arr[0];
        String max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].length() < min.length()) {
                    min = arr[i];
                }
                if (arr[i].length() > max.length()) {
                    max = arr[i];
                }
            }
        }
        System.out.println(max + " " + min);
    }
}
