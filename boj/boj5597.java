import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj5597 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums[] = new int[31];
        for (int i = 0; i < 28; i++) {
            nums[(Integer.parseInt(br.readLine()))]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == 0) {
                sb.append(i+"\n");
            } 
        }
        System.out.println(sb);
    }
}
