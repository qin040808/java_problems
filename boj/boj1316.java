import java.util.Scanner;

public class boj1316{

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check() {
        boolean[] check = new boolean[26];
        int b = 0;
        String str = in.next();
        for(int i = 0; i < str.length(); i++) {
            int current = str.charAt(i);
            if (b != current) {
                if ( check[current-'a'] == false ) {
                    check[current-'a'] = true;		
                    b = current;					
                }
                else {
                    return false;
                }
            }
            else {
                continue;
            }
        }
        return true;
    }
}