import java.util.Scanner;

public class boj2675 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String[] l = new String[a];
        for (int i = 0; i < a; i++) {
            int n = in.nextInt();
            String s = in.next();
            in.close();
            String str="";
            for (int k = 0; k < s.length(); k++) {
                char c = s.charAt(k);
                for (int j = 0; j < n; j++) {
                    str=str+c;
                }
            }
            l[i]=str;
        }
        for(String e:l){
            System.out.println(e);
        }
    }
}