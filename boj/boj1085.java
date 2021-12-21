import java.util.Scanner;

public class boj1085 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int min = a<b?a:b;
        if(min>c-a){
            min = c-a;
        }
        if(min>d-b){
            min = d-b;
        }
        System.out.println(min);
        in.close();
    }
}