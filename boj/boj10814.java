import java.util.Scanner;

public class boj10814 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String st[] = new String[l*2];
        for (int i = 0; i < st.length; i++) {
            st[i] = in.next();
        }
        in.close();
        bubbleSort(st, st.length);
        for (int i = 0; i < st.length; i+=2) {
            System.out.println(st[i]+" "+st[i+1]);
        }
    }
    static void bubbleSort(String st[], int n) {            
        String tmp;                           
        if (n == 1) {
            return;
        }
        for (int i=0; i<n-2; i+=2) {
            if (Integer.parseInt(st[i]) > Integer.parseInt(st[i+2])) {                         
                tmp = st[i];
                st[i] = st[i+2];
                st[i+2] = tmp;
                tmp = st[i+1];
                st[i+1] = st[i+3];
                st[i+3] = tmp;
            }
        }
        bubbleSort(st, n-1);
    }
}
