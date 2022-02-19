import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj10845 {

	static Deque<Integer> q = new ArrayDeque<Integer>();
	static int N;
	static String order;

	static int stoi(String s) {
		return Integer.parseInt(s);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = stoi(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			order = st.nextToken();

			switch (order) {
			case "push":
				q.offer(stoi(st.nextToken()));
				break;
			case "pop":
				if (q.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(q.poll()).append("\n");
				}
				break;
			case "size":
				sb.append(q.size()).append("\n");
				break;
			case "empty":
				if (q.isEmpty()) {
					sb.append("1").append("\n");
				} else {
					sb.append("0").append("\n");
				}
				break;
			case "front":
				if (q.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(q.peek()).append("\n");
				}
				break;
			case "back":
				if (q.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(q.peekLast()).append("\n");
				}
				break;
			default:
				break;
			}
		}
		System.out.println(sb);
	}
}