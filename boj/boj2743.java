import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj2743 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        int a=0;
        switch(str.charAt(0)) {
            case 'A':
                a=4;
                break;
            case 'B':
                a=3;
                break;
            case 'C':
                a=2;
                break;
            case 'D':
                a=1;
                break;
            case 'F':
                a=0;
                break;
        }
        if(str.length() > 1) {
            switch(str.charAt(1)) {
                case '+':
                    sb.append(a+".3");
                    break;
                case '0':
                    sb.append(a+".0");
                    break;
                case '-':
                    a--;
                    sb.append(a+".7");
                    break;
            }
        }else {
            sb.append(a+".0");
        }
        System.out.println(sb);
    }
}
