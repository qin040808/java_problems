import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj11723 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        String input;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            input = st.nextToken();
            if(input.equals("add")){
                a = a | (int)(Math.pow(2, Integer.parseInt(st.nextToken())-1));
            }else if(input.equals("remove")){
                a = a & (1048575-(int)(Math.pow(2, Integer.parseInt(st.nextToken())-1)));
            }else if(input.equals("check")){
                bw.write(
                    Integer.toBinaryString(a & (int)Math.pow(2, Integer.parseInt(st.nextToken())-1)).charAt(0)
                    +"\n"
                );
            }else if(input.equals("toggle")){
                a = a ^ (int)(Math.pow(2, Integer.parseInt(st.nextToken())-1));
            }else if(input.equals("all")){
                a = 1048575;
            }else if(input.equals("empty")){
                a = 0;
            }
        }
        bw.flush();
    }
}
