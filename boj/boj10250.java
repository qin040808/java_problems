import java.util.Scanner;

public class boj10250 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m= in.nextInt();
        int n[] = new int[3];
        int sum[] = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n.length; j++) {
                n[j] = in.nextInt();
            }
            sum[i] = ((n[2]%n[0]==0?n[0]:n[2]%n[0])*100)+((n[2]/n[0])+(n[2]%n[0]==0?0:1));
        }
        for (int i : sum) {
            System.out.println(i);
        }
        in.close();
    }
}