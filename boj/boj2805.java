import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2805 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long h = Long.parseLong(st.nextToken());
        long arr[] = new long[n];
        long top = 0;
        long bottom = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Long.parseLong(st.nextToken());
            if(arr[i] > top) {
                top = arr[i];
            }
        }
        long sum;
        long mid=0;
        while(top>bottom){
            sum = 0;
            mid = (top + bottom) /2;
            for (long a : arr) {
                if( a > mid ) {
                    sum += a-mid;
                }
            }
            if(sum >= h) {
                bottom = mid+1;
            }else {
                top =  mid;
                bottom--;
            }

        }
        System.out.println(mid);
    }
}
