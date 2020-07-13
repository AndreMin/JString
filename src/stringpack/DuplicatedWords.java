package stringpack;

public class DuplicatedWords {
    public static void main(String[] args) {
        String str = "The best pet is one of my best pet";
        duplWords(str);
    }

    static void duplWords(String s) {
        String[] arr = s.split(" ");
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
                System.out.println(arr[i] + " " + fr[i]);
            }
        }
    }
}
