import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1025 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int arr[][] = new int[h][w];
        for (int i = 0; i < arr.length; i++) {
            int n = 0;
            for (String tmp : br.readLine().split("")) {
                arr[i][n] = Integer.parseInt(tmp);
                n++;
            }
        }
        int fin = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int res = sr(i,j,arr);
                fin = fin > res ? fin: res;
            }
        }
        System.out.println(fin);
    }
    public static int sr(int a, int b, int arr[][]) {
        int sqrt = Math.sqrt((double)arr[a][b])==(int)Math.sqrt((double)arr[a][b])?arr[a][b]:-2;
        int temp;
        for (int i = -a; i <= arr.length-a-1; i++) {
            for (int j = -b; j <= arr[0].length-b-1; j++) {
                temp = arr[a][b];
                if(i==0&&j==0){
                    continue;
                }
                for (int k = a+i, l = b+j; (k < arr.length && k >= 0) && (l < arr[0].length && l >= 0); k+=i,l+=j) {
                    temp*=10;
                    temp+=arr[k][l];
                    if (Math.sqrt((double)temp)==(int)Math.sqrt((double)temp)) {
                        sqrt = temp > sqrt ? temp : sqrt;
                    }
                }
            }
        }
        return sqrt;
    }
}
