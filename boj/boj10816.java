import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj10816 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        int cards[] = new int[len];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < len; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);

        len = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int select[] = new int[len];
        int has[] = new int[len];
        
        for (int i = 0; i < has.length; i++) {
            select[i] = Integer.parseInt(st.nextToken());
        }
        int low;
        int high;
        int mid;
        int a,b;
        StringBuilder sb = new StringBuilder();
            for (int i = 0; i < has.length; i++) {
            low = 0;
            high = cards.length;
            while(low<high) {
                mid = (high - low)/2+low;
                if(cards[mid] > select[i]) {
                    high = mid;
                }else {
                    low = ++mid;
                }
            }
            a = low;
            low = 0;
            high = cards.length;
            while(low<high) {
                mid = (high - low)/2+low;
                if(cards[mid] >= select[i]) {
                    high = mid;
                }else {
                    low = ++mid;
                }
            }
            b = low;
            sb.append(a-b+" ");

        }
        System.out.println(sb);
    }
}
