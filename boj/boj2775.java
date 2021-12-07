import java.util.Scanner;
public class boj2775 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[15][15];
        in.close();
        for(int i = 0; i < 15; i++) {
            a[i][1] = 1;	
            a[0][i] = i;	
        }
        for(int i = 1; i < 15; i ++) {
            for(int j = 2; j < 15; j++) {	
                a[i][j] = a[i][j - 1] + a[i - 1][j];
            }
        }
        int b = in.nextInt();
        for(int i = 0; i < b; i++) {
            int k = in.nextInt();
            int n = in.nextInt();
            System.out.println(a[k][n]);
        }
    }
}