import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        sb.append(getGCD(a, b)).append("\n");;
        sb.append(a*b/getGCD(a, b)).append("\n");
        System.out.print(sb.toString());
    }
    public static int getGCD(int a, int b){
        if(b > a){
            int temp = a;
            a = b;
            b = temp;
        }
        while(b != 0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
