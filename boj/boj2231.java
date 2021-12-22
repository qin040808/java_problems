import java.util.Scanner;

public class boj2231 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int m = in.nextInt();
        int n = 0;
        int c;
        int tmp;
        for (int i = m-55; i < m; i++) {
            c=i;
            tmp=i;
            while(tmp>0){
                c+=tmp%10;
                tmp/=10;
            }
            if(c==m) {
                n=i;
                break;
            }
        }
        System.out.println(n);
        in.close();
    }
}
