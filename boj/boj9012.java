import java.util.Scanner;

public class boj9012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String st[] = new String[l];
        for (int i = 0; i < st.length; i++) {
            st[i] = in.next();
        }
        String res[] = new String[l];
        int a;
        for (int i = 0; i < res.length; i++) {
            a=0;
            for (int j = 0; j < st[i].length(); j++) {
                if(st[i].charAt(j) == '(') {
                    a++;
                }else {
                    a--;
                }
                if(a<0){
                    break;
                }
            }
            if(a==0) {
                res[i] = "YES";
            }else {
                res[i] = "NO";
            }
        }
        for (String string : res) {
            System.out.println(string);
        }
        in.close();
    }
}
