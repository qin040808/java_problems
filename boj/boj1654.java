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
        long res=0;
        long cn = n[l-1];
        long st = 1;
        long tmp;
        long sum;
        while(st<=cn){
            tmp = (st+cn)/2;
            sum=0;
            for (int i = 0; i < n.length; i++) {
                sum+=n[i]/tmp;
            }
            if(sum>=m) {
                st = tmp+1;
                res=tmp;
            }else{
                cn = tmp-1;
            }
        }
        System.out.println(res);
        in.close();
    }
}