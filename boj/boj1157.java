import java.util.Scanner;

public class boj1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        s = s.toLowerCase();
        int[] al = new int[26];
        for (int j = 97, i = 0; j <= 122; j++, i++) {
            for (int k = 0; k < s.length(); k++) {
                if(s.charAt(k) == (char)j){
                    al[i]++;
                }
            }
        }
        int max=0;
        int maxs=0;
        int maxr=0;
        for (int i =0; i<al.length;i++) {
            if(al[i]>max){
                max=al[i];
                maxr = i;
                maxs=0;
            }else if(al[i]==max){
                maxs++;
            }
        }
        if(maxs>0){
            System.out.println("?");
        }else{
            System.out.println((char)(maxr+65));
        }
    }
}