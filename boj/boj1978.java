import java.util.Scanner;

public class boj1978 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = in.nextInt();
        }
        int sum=0;
        for(int c:b) {
            if(ifreal(c)){
                sum++;
            }
        }
        System.out.println(sum);
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
