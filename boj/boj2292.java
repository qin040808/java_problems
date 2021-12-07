import java.util.Scanner;
public class boj2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int min=6;
        a--;
        int sum=1;
        while(a>0){
            a-=min;
            min+=6;
            sum++;
        }
        System.out.println(sum);
    }
}