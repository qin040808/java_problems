import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i+"\n");
        }
        System.out.println(sb);
    }
}
