import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj1211_not {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[259999999];
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        //the input has to be Strings first because of numberformat exception
        String a = st.nextToken();
        String b = st.nextToken();
        // BigInteger c = new BigInteger("2");  only use big integer operation once per loop
        // BigInteger d = new BigInteger("2");  loop for maximun (below 2599,999,999)
        // c.multiply(d);                       then no time out
        //1000000000000000000 1119214745569532790
        long rs = 0;
        long min = Long.parseLong(a);
        long max = Long.parseLong(b);
        Stack<Long> s = new Stack<Long>();
        //use the dynamic programming thing on the self digit!
        //but how
        //use string and char at to add one by one?
        //idk how lol help
        arr[0] = 1;
        s.push(1L);
        // long compare = 1;
        for (long i = 1L; i <  2599999999L; i++) {
            if(Long.toString(i).contains("0")){
                continue;
            }
            s.push(s.get((int)i/10) * i%10);
            rs = s.peek() * i;
            // rs = compare * i;
            if(min<=rs&&rs<=max) {
                System.out.println("["+i+"]"+rs+" ");
                sb.append("["+i+"]"+rs+" ");
            }
        }
        System.out.println(sb);
    }
    public static BigInteger selfNumber(long n) {
        BigInteger rs = new BigInteger("0");
        return rs;
    }

    // public static long selfnum(long n) {
    //     long x,y;
    //     x=n;
    //     y=x%10;
    //     for (long j = n; j > 10 ; j/=10) {
    //         x/=10;  
    //         y*=x%10;
    //     }
    //     return n*y;
    // }
}
