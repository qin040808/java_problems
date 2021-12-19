import java.util.Scanner;

public class boj1436 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int de = 666;
        int se = 6666;
        int c = 1000;
        int t = 1;
        int temp;
        int num=de;
        for (int i = 1, s = 0, k = 0; i < n; i++,k++,s++) {
            if(s>5){
                s=0;
                k=0;
                t*=10;
            }
            if(k>9){
                s=0;
                k=0;
                c*=10;
            }
            if(num<se) {
                num = s*c+de*t;
            }else {
                num = de*t+k*t/10;
            }
            System.out.println(num);
        }
        for (int i = 1, s = 0, k = 0; i < n; i++,k++,s++) {
            
        }
    }
}
