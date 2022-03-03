import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String a[] = (br.readLine().split(" "));
        int n = Integer.parseInt(a[0]);
        int k = Integer.parseInt(a[1]) - 1;
        Stack<Integer> st = new Stack<Integer>(); 
        for (int i = 1; i <= n; i++) {
            st.push(i);
        }ff
        int i = 0;
        sb.append("<");
        while(!st.empty()) {
            i = (i + k >= st.size() ? (i + k) % st.size() : i + k);
            sb.append(st.remove(i));
            if(st.empty()){
                sb.append(">");
                break;
            }
            sb.append(", ");
        }
        System.out.println(sb);
    }
}
