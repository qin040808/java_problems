import java.util.Scanner;

public class boj1259 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        int l;
        String num;
        String comp;
        while(true) {
            str = in.next();
            if(str.equals("0")){ break; }
            l = str.length();
            comp="";
            num = str.substring(0, l/2);
            for (int i = l; i > (l%2==0?l/2:l/2+1); i--) {
                comp= comp +str.substring(i-1,i);
            }
            if(num.equals(comp)) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        in.close();
    }
}
