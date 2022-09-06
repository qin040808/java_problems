import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj1463 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int n = num;
        int a = num;
        int b = num;
        int arr[] = new int[num+1];
        arr[1] = 0;
        for (int i = 2; i <= num; i++) {
            a = i%3==0?arr[i/3]+1:num+1;
            b = i%2==0?arr[i/2]+1:num+1;
            n = a<b?a:b;
            arr[i] = arr[i-1]+1<n?arr[i-1]+1:n;
        }
        System.out.println(arr[num]);
    }
}
