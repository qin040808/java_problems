import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2750_2751 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int n[] = new int[a];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(n);
        for (int i : n) {
            st.append(i).append("\n");
        }
        System.out.println(st);
    }
}