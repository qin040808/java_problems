import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj7568 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int n[][] = new int[k][2];
        int res[] = new int[k];
        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n[i][0] = Integer.parseInt(st.nextToken());
            n[i][1] = Integer.parseInt(st.nextToken());
            res[i] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if(n[i][0]>n[j][0] && n[i][1]>n[j][1]) {
                    res[j]++;
                }else if(n[i][0] < n[j][0] && n[i][1] < n[j][1]) {
                    res[i]++;
                }
            }
        }
        for (int i : res) {
            sb.append(i+" ");
        }
        System.out.println(sb);
    }
}
