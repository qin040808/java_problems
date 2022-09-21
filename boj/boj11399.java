import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11399 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            k[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(k);
        int sum=0;
        for (int i = 0, j=n; i < k.length; i++,j--) {
            sum+=k[i]*j;
        }
        System.out.println(sum);
    }
}
