import java.util.Scanner;
public class boj2446 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        int b=a;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(b-1)*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
            b--;
        }
        b=2;
        for (int i = a-1; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(b-1)*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
            b++;
        }
    }
}