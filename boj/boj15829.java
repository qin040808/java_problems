import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj15829 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String st = br.readLine();
        long n = 0;
        long mod = 1234567891;
        long mul = 1;
        for (long i = 0; i < st.length(); i++) {
            n+=(long)((st.charAt((int)i)-96)*(mul%mod))%mod;
            mul = (mul*31)%mod;
        }
        System.out.println(n%mod);
    }
}
