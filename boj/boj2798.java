import java.util.Scanner;

public class boj2798 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int be = 0;
        int n = in.nextInt();
        int max = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i]=in.nextInt();
        }
        in.close();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if(num[i]+num[j]+num[k]>be&&num[i]+num[j]+num[k]<=max){
                        be=num[i]+num[j]+num[k];
                    }
                }
            }
        }
        System.out.println(be);
    }
}