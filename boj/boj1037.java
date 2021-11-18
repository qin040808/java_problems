import java.util.Scanner;

public class boj1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum[] = new int[n];
        for (int i = 0; i < sum.length; i++) {
            sum[i]=sc.nextInt();
        }
        sc.close();
        int min=sum[0];
        int max=0;
        for (int i : sum) {
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        System.out.println(max*min);
    }
}
