import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj11718 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            if(str==null) {
                break;
            }
            sb.append(str+"\n");
        }
        System.out.println(sb);
    }
}
