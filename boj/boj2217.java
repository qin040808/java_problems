import java.util.Arrays;
import java.util.Scanner;

public class boj2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] =  new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(num);
        int max=0;
        for (int i = 0; i < num.length; i++) {
            if(max<(num.length-i)*num[i]){
                max=(num.length-i)*num[i];
            }
        }
        System.out.println(max);
    }
}
