import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1966 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cases; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int temp[][] = new int[n][2];
            for (int j = 0; j < temp.length; j++) {
                temp[j][0] = j;
                temp[j][1] = Integer.parseInt(st.nextToken());    
            }
            int cnt = 1;
            while (true) {
                Boolean print = true;
                for (int k = 0; k < temp.length; k++) {
                    if(temp[0][1]<temp[k][1]) {
                        int ex[] = temp[0];
                        for (int m = 0; m < temp.length-1; m++) {
                            temp[m] = temp[m+1];
                        }
                        temp[temp.length-1] = ex;
                        print = false;
                        break;
                    }
                }
                if(print) {
                    temp[0][1] = -1;
                    if(temp[0][0]==l) {
                        sb.append(cnt+"\n");
                        break;
                    }
                    cnt++;
                }
            }
        }
        System.out.println(sb);
    }
}
