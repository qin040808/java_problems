import java.util.Scanner;

public class boj2839 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int sum=0;
        int mul=0;
        int be = n+1;
        int a =n;
        while(a>0){
            a=n;
            sum+=mul;
            a-=3*mul;
            while(a>=5){
                a-=5;
                sum++;
            }
            if(a!=0){
                sum=be;
            }
            if(sum<be){
                be=sum;
            }
            sum=0;
            mul++;
        }
        if(be>n){
            be=-1;
        }
        System.out.println(be);
    }
}