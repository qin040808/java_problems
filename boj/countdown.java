import java.util.Scanner;

public class countdown {
    public static void main(String[] args) {
        double start = 35;
        Scanner in = new Scanner(System.in);
        double st = in.nextDouble();
        int ln = in.nextInt();
        double arr[] = new double[ln];
        start = st;
        arr[0] = 13;
        for (int i = 1; i < 14; i++, start--) {
            arr[i] = (arr[i-1] + (100/start)); 
        }
        for (double i : arr) {
            System.out.println(i);
        }
        in.close();
    }
}