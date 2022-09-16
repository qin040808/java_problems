import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class boj4949 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> str = new LinkedList<String>();
        while(true){
            String tmp = br.readLine();
            if(tmp.equals(".")){
                break;
            }
            str.add(tmp);
        }
        boolean balanced = true;
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<String>();
        while(!str.isEmpty()) {
            balanced = true;
            for (String s: str.poll().split("")) {
                if(s.equals("[")) {
                    st.push("]");
                }else if(s.equals("(")) {
                    st.push(")");
                }else if(s.equals(")") || s.equals("]")){
                    if(!st.isEmpty()) {
                        if(!s.equals(st.pop())) {
                            balanced=false;
                            break;
                        }
                    }else {
                        balanced=false;
                        break;
                    }
                }
            }
            if(balanced&&st.isEmpty()) {
                sb.append("yes\n");
            }else {
                sb.append("no\n");
            }
            st.clear();
        }
        System.out.println(sb);
    }
}
