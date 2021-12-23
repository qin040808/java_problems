import java.util.Arrays;
import java.util.Scanner;

public class boj1654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        long m = in.nextLong();
        long n[] = new long[l];
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextLong();
        }
        Arrays.sort(n);
        long res;
        long cn = n[0];
        while(true){
            res = 0;
            for (int i = 0; i < n.length; i++) {
                for (int j = 1; j <= m; j++,res++) {
                    if(n[i]-j*cn<=0) {
                        break;
                    }
                }
            }
            if(res==m){
                break;
            }
            if(res<=m/2){
                cn/=2;
            }else{
                cn--;
            }
        }
        System.out.println(cn);
        in.close();
    }
}