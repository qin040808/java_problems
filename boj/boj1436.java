import java.util.Scanner;

public class boj1436 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while (n>0) {
            sum++;
            if(String.valueOf(sum).contains("666")){
                n--;
            }
        }
        System.out.println(sum);
        in.close();
    }
}
