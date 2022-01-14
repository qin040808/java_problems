import java.util.Scanner;

public class boj10814 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String st[] = new String[l];
        for (int i = 0; i < st.length; i++) {
            st[i] = in.next();
        }
        in.close();
        String tmp;
        int a,b;
        int min;
        String s[] = new String[3];
        for (int i = 0; i < st.length; i++) {
            min=i;
            for (int j = i+1; j < st.length; j++) {
                s=st[i].split(" ");
                a=Integer.parseInt(s[0]);
                s=st[j].split(" ");
                b=Integer.parseInt(s[0]);
                if(a>b) {
                    min = j;
                }
                tmp = st[i];
                st[i] = st[min];
                st[min] = tmp;
            }
        }
        for (String string : st) {
            System.out.println(string);
        }
    }
}
