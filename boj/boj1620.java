import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj1620 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        HashMap<String, Integer> hash2 = new HashMap<String, Integer>();
        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            hash.put(i, input);
            hash2.put(input, i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= k; i++) {
            String input = br.readLine();
            if(input.matches("^[0-9]+$")){
                sb.append(hash.get(Integer.parseInt(input)));
            }else {
                sb.append(hash2.get(input));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
