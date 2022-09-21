import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj17219 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        HashMap<String, String> hash = new HashMap<String, String>();
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            hash.put(st.nextToken(), st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= k; i++) {
            sb.append(hash.get(br.readLine())+"\n");
        }
        System.out.println(sb);
    }
}
