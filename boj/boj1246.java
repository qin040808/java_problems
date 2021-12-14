import java.util.Arrays;
import java.util.Scanner;

public class boj1246 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(arr);
        int c;
        int sum=0;
        int max[] = {0,0};
        for (int i = 0; i < arr.length; i++) {
            c=arr[i];
            for (int j = i; j < arr.length&&j<m+i; j++) {
                if(arr[j]>=c) {
                    sum+=c;
                }
            }
            if(max[1]<sum) {
                max[0] = c;
                max[1] = sum;
            }
            sum=0;
        }
        System.out.print(max[0]+" "+max[1]);
    }
}