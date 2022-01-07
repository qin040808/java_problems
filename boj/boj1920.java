import java.util.Arrays;
import java.util.Scanner;

public class boj1920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ns[] = new int[n];
        for (int i = 0; i < n; i++) {
            ns[i]=in.nextInt();
        }
        Arrays.sort(ns);
        int m = in.nextInt();
        int ms[] = new int[m];
        int sum[] = new int[m];
        for (int i = 0; i < m; i++) {
            ms[i]=in.nextInt();
        }
        int l;
        int cm;
        for (int i = 0; i < ms.length; i++) {
            l=n%2==0?n/2-1:n/2;
            cm= n;
            while(true) {
                if(ms[i]==ns[l]){
                    sum[i] = 1;
                    break;
                }else if(ms[i]>ns[l]) {
                    l = l + (cm - l == 1 ?2:cm-l)/2; 
                }else{
                    cm=l;
                    l/=2;
                }
                if(l>=cm) {
                    sum[i] = 0;
                    break;
                }
            }
        }
        for (int i : sum) {
            System.out.println(i);
        }
        in.close();
    }       
}
