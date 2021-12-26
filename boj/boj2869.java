import java.util.Scanner;

public class boj2869 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long b = in.nextInt();
        long des = in.nextInt();
        long sum =0;
        sum+=des%(a-b);
        System.out.println(sum);
        in.close();
    }
}
