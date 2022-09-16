import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj14928 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int res = 0;
        for (int i = 0; i < num.length(); i++) {
            res*=10;
            res += (int)num.charAt(i)-'0';;
            res%=20000303;
        }
        System.out.println(res);
    }
}