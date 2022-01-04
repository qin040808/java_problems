import java.util.Arrays;
import java.util.Scanner;

public class boj4153 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n[] = new int[3];
        while(true) {
            for (int i = 0; i < n.length; i++) {
                n[i]=in.nextInt();
            }
            if(n[0]+n[1]+n[2]==0){
                break;
            }
            Arrays.sort(n);
            if(n[0]*n[0]+n[1]*n[1]==n[2]*n[2]) {
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
        in.close();
    }
}
