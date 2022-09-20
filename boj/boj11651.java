import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11651 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int arr[][] = new int[len][2];
        for (int i = 0; i < len; i++) {
            StringTokenizer st = new StringTokenizer (br.readLine());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][0] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (a, b) -> {
            if(a[0] == b[0]) {
                return a[1] - b[1];    
            }
            else {
                return a[0] - b[0];
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int[] num : arr) {
            sb.append(num[1]+" "+num[0]+"\n");
        }
        System.out.println(sb);
    }
}
