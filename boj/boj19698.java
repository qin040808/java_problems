import java.util.Scanner;

public class boj19698 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int area = sc.nextInt();
        sc.close();
        int sum=0;
        for (sum = 0;sum<n&&y>=area; y-=area) {
            for (int i = x; sum<n&&i>=area; sum++) {
                i -= area;
            }
        }
        System.out.println(sum);
    }
}