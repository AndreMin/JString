package stringpack;

public class RotString {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdabe";
        rotateStr(s1,s2);
    }

    static void rotateStr(String s1, String s2){
        String str = s1+s1;
        System.out.println(str);
        if(str.indexOf(s2)!=-1){
            System.out.println("OK");
        }else {
            System.out.println("Not");
        }
    }
}
