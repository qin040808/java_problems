import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj1676 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger ns[] = new BigInteger[n+1];
        ns[0] = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            BigInteger num = new BigInteger(Integer.toString(i));
            ns[i] = num.multiply(ns[i-1]);
        }
        String str = (ns[n].toString());
        n = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i) != '0'){
                break;
            }
            n++;
        }
        System.out.println(n);
    }
}
