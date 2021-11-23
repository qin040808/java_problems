import java.util.Scanner;
public class boj2581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c= in.nextInt();
        int sum = 0;
        int min=c;
        in.close();
        for (int i = a; i <=c ; i++) {
            if(ifreal(i)){
                if(min>i){
                    min=i;
                }
                sum+=i;
            }
        }
        if(sum==0){
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }
    public static boolean ifreal(int i){
        if(i==1){
            return false;
        }
        for (int j = 2; j < i; j++) {
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}