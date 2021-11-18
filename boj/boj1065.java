import java.util.Scanner;

public class boj1065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i < 100) {
                sum++;
            } else {
                int num = i;
                if(hak(num)){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
    public static boolean hak(int num) {
        int d = num % 10- num/10%10;
        while (num /10 != 0) {
            int c = num% 10- num/10%10;
            if (c!= d) {
                return false;
            }
            num/=10;
        }
        return true;
    }
}