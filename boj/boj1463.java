import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj1463 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        int n = num;
        int a = num;
        int b = num;
        int c;
        while(n!=1){
            a = n%3==0?n/3+1:a;
            b = n%2==0?n/2+1:b;
            c = n-1;
            n = a<b?a<c?a:c:c<b?c:b;
            count++;
            if(n==1) {
                break;
            }
        }
        System.out.println(count);
    }
}
