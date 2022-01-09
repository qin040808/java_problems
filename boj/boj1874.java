import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class boj1874 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int l = Integer.parseInt(br.readLine());
        int n[] = new int[l];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0,j=1; i < l;) {
            if(s.empty()) {
                    s.push(j);
                    sb.append('+').append('\n');
                    j++;
            }else {
                if(s.peek()==n[i]){
                    s.pop();
                    sb.append('-').append('\n');
                    i++;
                }else {
                    if(j>l){
                        System.out.println("NO");
                        return;
                    }
                    s.push(j);
                    sb.append('+').append('\n');
                    j++;
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
        