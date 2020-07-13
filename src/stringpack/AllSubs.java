package stringpack;

public class AllSubs {
    public static void main(String[] args) {
        String s="fun";
        allSubs(s);
    }

    static void allSubs(String s){
        int t = 0;
        int a = s.length()*(s.length()+1)/2;
        String[] arr=new String[a];
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                arr[t]=s.substring(i,j+1);
                t++;
            }
        }
        for (String b:arr){
            System.out.println(b);
        }
    }
}
