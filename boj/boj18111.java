import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj18111 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int blocks = Integer.parseInt(st.nextToken());
        int area[] = new int[a*b];
        int max = 0;
        int min = 256;
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < b; j++) {
                area[i*b+j] = Integer.parseInt(st.nextToken());
                min = area[i*b+j]<min?area[i*b+j]:min;
                max = area[i*b+j]>max?area[i*b+j]:max;
            }
        }
        Arrays.sort(area);
        int res[][] = new int[max-min+1][2];
        for (int i = 0; i < res.length; i++, min++) {
            res[i] = fill(min, blocks,area); 
        }
        Arrays.sort(res, (o, p) -> {
            if(o[0] == p[0]) {
                return p[1] - o[1];    
            }
            else {
                return o[0] - p[0];
            }
        });
        System.out.println(res[0][0]+" "+res[0][1]);
    }
    public static int[] fill(int height, int inv, int area[]) {
        int result[] = {0,height};
        int time = 0;
        for (int i = area.length-1; i >= 0; i--) {
            if(area[i] > height) {
                inv += area[i]-height;
                time += (area[i]-height)*2;
            }else if(area[i] < height) {
                if(height-area[i] > inv){
                    result[0] = fill(0,0,area)[0]+1;
                    return result;
                }
                inv -= height-area[i];
                time += height-area[i];
            }
        }
        result[0] = time;
        return result;
    }
}
