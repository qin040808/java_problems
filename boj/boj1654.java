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
        long cn = n[l-1];
        long sum=0;
        while(cn>0){
            res = 0;
            for (int i = 0; i < n.length; i++) {
                if(cn!=0){
                    res+=n[i]/cn;
                }
            }
            if(res>=m){
                if(cn>sum){
                    sum=cn;
                }
            }
            cn--;
        }
        System.out.println(sum);
        in.close();
    }
}