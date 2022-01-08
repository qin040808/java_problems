import java.util.Scanner;
import java.util.Stack;

public class boj1874 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int n[] = new int[l];
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }
        in.close();
        Stack<Integer> s = new Stack<Integer>();
        String sum = "";
        for (int i = 0,j=1; i < l;) {
            if(s.empty()) {
                    s.push(j);
                    sum = sum+"+\n";
                    j++;
            }else {
                if(s.peek()==n[i]){
                    s.pop();
                    sum = sum+"-\n";
                    i++;
                }else {
                    if(j>l){
                        sum = "NO";
                       break;
                    }
                    s.push(j);
                    sum = sum+"+\n";
                    j++;
                }
            }
        }
        System.out.println(sum);
    }
}
        