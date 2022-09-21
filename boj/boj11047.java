import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj11047 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Stack<Integer> m = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            m.push(Integer.parseInt(br.readLine()));
        }
        int cnt = 0;
        while(!m.isEmpty()){
            cnt+=k/m.peek();
            k%=m.pop();
        }
        System.out.println(cnt); 
    }
}
