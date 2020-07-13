package stringpack;

public class EqualSubs {
//    divide on equal substrings
public static void main(String[] args) {
    String s = "The best in the world";
    divSubs(s,3);
}
static void divSubs(String s, int n){
    if(s.length()%n!=0){
        System.out.println("Lazha");
    }else{
        int a =s.length()/n;
        int b =s.length()/n;
        int i=0;
        while (i<s.length()){
            String sub=s.substring(i,a);
            System.out.println(sub);
            i+=b;
            a+=b;
        }
    }
}
}
