import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj2108 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            sum += val;
            if( max < val ) {
                max = val;
            }
            if( min > val ) {
                min = val;
            }
            arr[val+4000]++;
        }
        int mid = 8002;
        int most = 8002;
        int cnt = 0;
        int tmp = 0;
        boolean first = false;
        for (int i = min+4000; i <= max+4000; i++) {
            if(arr[i]>0) {
                if(cnt< (n+1) / 2) {
                    mid = i-4000;
                    cnt += arr[i];
                }
                if(tmp < arr[i]){
                    tmp = arr[i];
                    most = i-4000;
                    first=true;
                }else if(tmp == arr[i]&&first) {
                    most = i-4000;
                    first = false;
                }
            }
        }
        System.out.println((int)Math.round((double)sum/n)+"\n"+mid+"\n"+most+"\n"+(max-min));
    }
}
