import java.util.Scanner;

public class boj1929 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		for (int i=m; i<=n; i++) {
			int j;
			for (j=2; j*j<=i; j++) {
				if (i%j == 0) {
					break;
                }
			}
			if ((j*j > i)&&(i != 1)) {
                System.out.println(i);
            }
		}
        in.close();
	}
}
