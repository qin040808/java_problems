import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long des = Integer.parseInt(st.nextToken());
        long cm = (des-a)/(a-b);
        long sum = (des-a)%(a-b) == 0 ?
            cm + 1 : cm +2;
        System.out.println(sum);
    }
}
