import java.util.Scanner;

public class boj2033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int com = 10;
        int b;
        while(n > com) {
            b=n%com;
            if(b*10/com >=5){
                n+=com;
            }
            n -= b;
            com *=10;
        }
        System.out.println(n);
    }
}
