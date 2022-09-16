import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2738 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int nums[][] = new int[w][h];
        for (int i = 0; i < nums.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] += Integer.parseInt(st.nextToken());
                sb.append(nums[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
