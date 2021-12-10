import java.util.Scanner;

public class boj2003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int n = in.nextInt();
        int num[] = new int[l];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        in.close();
        int sum=0;
        int cnt;
        for (int i = 0; i < num.length; i++) {
            cnt=0;
            for (int j = i;cnt<n&&j<num.length; j++) {
                cnt+=num[j];
                if(cnt==n){
                    sum++;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
