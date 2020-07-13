package stringpack;

public class FreqCharacter {
    public static void main(String[] args) {
        String str = "The besTt beeeeeeear int the world";
        String str1 ="object  object,object  sdf sdf q wer ty  ?";
        freqChr(str);
    }

    static void freqChr(String s) {
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
}
