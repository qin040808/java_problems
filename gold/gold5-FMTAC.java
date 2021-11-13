import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a,b;
        int n;
        int sum;
        int arr[] = new int[t];
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            b-=a;
            n = (int)Math.round(Math.sqrt(b));
            sum = n*n;
            if(b-sum>0){
                arr[i]=n*2;
            }else{
                arr[i]=n*2-1;
            }

        }
        for (int e:arr) {
            System.out.println(e);
        }
    }
}
