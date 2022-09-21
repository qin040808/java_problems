import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj1764 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, String> hash = new HashMap<String,String>();
        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            hash.put(tmp, tmp);
        }
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> li = new ArrayList<String>();
        for (int i = 0; i < m; i++) {
            String tmp = br.readLine();
            if(hash.containsKey(tmp)&& hash.containsValue(tmp)) {
                cnt++;
                li.add(tmp);
            }
        }
        Collections.sort(li);
        for (String string : li) {
            sb.append(string+"\n");
        }
        System.out.println(cnt+"\n"+sb);
    }
}
