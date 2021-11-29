import java.util.Scanner;

public class boj4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[][] a = new double[n][];
        int sum;
        double num;
        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            a[i] = new double[l];
            for (int j = 0; j < l; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            sum = 0;
            num = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            sum /= a[i].length;
            for (double j : a[i]) {
                if (j > sum) {
                    num++;
                }
            }
            System.out.printf("%.3f", num / a[i].length * 100.000);
            System.out.println("%");
        }
    }
}