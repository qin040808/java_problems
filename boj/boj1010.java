import java.util.Scanner;

public class boj1010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        long sum[] = new long[l];
        long n[][] = new long[l][2];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < 2; j++) {
                n[i][j] = in.nextInt();
            }
        }
        in.close();
        for (int i = 0; i < sum.length; i++) {
            sum[i]=res(n[i]);
        }
        for (long i : sum) {
            System.out.println(i);
        }
    }

    public static long res(long n[]) {
        long sum=1;
        long a;
        long b;
        if(n[1]-n[0]<n[0]){
            a=fac(n[1]-n[0]);
            b=n[0];
        }else{
            a=fac(n[0]);
            b=n[1]-n[0];
        }
        for (long i = 0; i < n[1]-b; i++) {
            sum*=n[1]-i;
        }
        return sum/a;
    }

    public static long fac(long a) {
        long sum = 1;
        for (long i=1;i<=a;i++) {
            sum*=i;
        }
        return sum;
    }
}
