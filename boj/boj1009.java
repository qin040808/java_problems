import java.util.Scanner;

public class boj1009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int n[][] = new int[l][2];
        for (int i = 0; i < n.length; i++) {
            n[i][0] = in.nextInt();
            n[i][1] = in.nextInt();
            n[i][0] = getend(n[i][0], n[i][1]);
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i][0]);
        }
        in.close();
    }

    public static int getend(int a, int b) {
        int sum = a;
        for (int i = 1; i < b; i++) {
            sum = (sum*a)%10;
        }
        while(sum>10){
            sum%=10;
        }
        return sum==0?10:sum;
    }
}
