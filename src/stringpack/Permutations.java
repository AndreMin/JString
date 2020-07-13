package stringpack;

public class Permutations {
    public static void main(String[] args) {
        String s1 = "ABC";
        genPermut(s1, 0, s1.length());
    }

    static String swap(String s, int i, int j) {
        char[] chArr = s.toCharArray();
        char ch;
        ch = chArr[i];
        chArr[i] = chArr[j];
        chArr[j] = ch;
        return String.valueOf(chArr);
    }

    static void genPermut(String s, int start, int end) {
        if (start == end - 1) {
            System.out.println(s);
        } else {
            for (int i = start; i < end; i++) {
                s = swap(s, start, i);
                genPermut(s, (start + 1), end);
                s = swap(s, start, i);

            }
//            System.out.println(s);
        }

    }
}
