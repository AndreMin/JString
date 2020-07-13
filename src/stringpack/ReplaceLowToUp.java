package stringpack;

public class ReplaceLowToUp {
    public static void main(String[] args) {
        String s = "The Best in tHe World!";
        shift(s);
        shiftVers2(s);
    }

    static void shift(String s) {
        StringBuilder str = new StringBuilder(s);
        System.out.println(str);
        String low = s.toLowerCase();
        String up = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != low.charAt(i)) {
                str.setCharAt(s.indexOf(s.charAt(i)), low.charAt(i));
            } else {
                str.setCharAt(s.indexOf(s.charAt(i)), up.charAt(i));
            }
        }
        System.out.println(str);
    }

    static void shiftVers2(String s) {
        StringBuilder newStr = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {

            //Checks for lower case character
            if (Character.isLowerCase(s.charAt(i))) {
                //Convert it into upper case using toUpperCase() function
                newStr.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
            //Checks for upper case character
            else if (Character.isUpperCase(s.charAt(i))) {
                //Convert it into upper case using toLowerCase() function
                newStr.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println("String after case conversion : " + newStr);
    }
}

