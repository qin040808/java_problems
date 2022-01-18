import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class boj10814 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String st[][] = new String[l][2];
        for (int i = 0; i < st.length; i++) {
            st[i][0] = in.next();
            st[i][1] = in.next();
        }
        in.close();
        Arrays.sort(st,new Comparator<String[]>() {
            @Override
			public int compare(String[] o1,String[] o2) {
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}		
		});
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i][0]+" "+st[i][1]);
        }
    }
}
