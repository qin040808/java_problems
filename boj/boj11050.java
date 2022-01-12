import java.util.Scanner;

public class boj11050 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sum = fac(n)/(fac(k)*(fac(n-k)));
        System.out.println(sum);
        in.close();
        
    }

    public static int fac(int a) {
        int sum = 1;
        for (long i=1;i<=a;i++) {
            sum*=i;
        }
        return sum;
    }
}
