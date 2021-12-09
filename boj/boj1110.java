import java.util.Scanner;
public class boj1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        int x = a;
        int w= 1;
        while(true){
            int b = x/10;
            int c = x%10;
            x=(b+c)%10+c*10;
            if(x==a){
                System.out.println(w);
                break;
            }
            w++;
        }
    }
}