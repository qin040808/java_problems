import java.io.*;
public class boj1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  a = br.readLine();
        String[] ba = a.split("");
        int[] ab = new int[ba.length];
        for (int i = 0; i < ba.length; i++) {
            ab[i]=Integer.parseInt(ba[i]);
        }
        int temp =0;
        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < ab.length; j++) {
               if(ab[i]>ab[j]) {
                   temp=ab[i];
                   ab[i]=ab[j];
                   ab[j]=temp;
               }
            }
        }
        for(int c:ab){
            System.out.print(c);
        }
    }
}