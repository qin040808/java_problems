import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10773 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<Integer>();
        int tmp;
        for (int i = 0; i < k; i++) {
            tmp = Integer.parseInt(br.readLine()); 
            //정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다. 
            //고 합니다 그냥 empty 체크는 안하도록 하죠
            if(tmp == 0) {
                s.pop();
            }else {
                s.push(tmp);
            }
        }
        int sum=0;
        while(!s.isEmpty()) {
            sum += s.pop();
        }
        System.out.println(sum);
    }
}
