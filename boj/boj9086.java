import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj9086 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            sb.append((char)tmp.charAt(0));
            sb.append((char)tmp.charAt(tmp.length()-1));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
