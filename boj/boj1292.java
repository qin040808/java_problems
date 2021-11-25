import java.util.Scanner;

public class boj1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int cn = 1;
        int num[] = new int[b];
        int count=0;
        int now = 1;
        for (int i = 0; i < num.length; i++, count++) {
            if(count==now){
                now++;
                count=0;
                cn++;
            }
            num[i]=cn;
        }
        int sum=0;
        for (int i = a-1; i < b; i++) {
            sum+=num[i];
        }
        System.out.println(sum);

    }
}