import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class boj2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();
        Stack<Integer> cards = new Stack<Integer>();
        for (int i = 1; i <= n; i++) {
            cards.push(i);
        }
        while(cards.size() != 1) {
            cards.remove(0);
            cards.push(cards.remove(0));
        }
        // 1 1  2 2  3 2  4 4  5 2  6 4  7 6  8 8  9 2  10 4
        bw.write(Integer.toString(cards.peek())+"\n");
        bw.flush();
        bw.close();
    }
}