import java.util.Scanner;

public class boj2920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n[] = new int[8];
        for (int i = 0; i < n.length; i++) {
            n[i]=in.nextInt();
        }
        in.close();
        boolean a = true;
        boolean d = true;
        for (int i = 0, j=1, k=8; i < n.length&&(a||d); i++,j++,k--) {
            if(n[i]!=j){
                a = false;
            }
            if(n[i]!=k){
                d = false;
            }
        }
        if(a){
            System.out.println("ascending");
        }else if(d){
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }
    }
}
