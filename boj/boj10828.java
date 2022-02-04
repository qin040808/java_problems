import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int l = Integer.parseInt(br.readLine());
        String line[][] = new String[l][2];
        for (int i = 0; i < line.length; i++) {
            line[i] = br.readLine().split(" ");
        }
        br.close();
        int stack[] = new int[l];
        int place = 0;
        for (int i = 0; i < line.length; i++) {
            switch(line[i][0]) {
                case "push":
                    stack[place] = Integer.parseInt(line[i][1]);
                    place++;
                    break;
                case "pop":
                    bw.write(Integer.toString(place == 0 ? -1 : stack[place-1])+"\n");
                    place= place > 0 ? --place : 0 ;
                    break;
                case "size":
                    bw.write(Integer.toString(place)+"\n");
                    break;
                case "empty":
                    bw.write(Integer.toString(place == 0 ? 1 : 0)+"\n");
                    break;
                case "top":
                    bw.write(Integer.toString(place == 0 ? -1 : stack[place-1])+"\n");
                    break;
            }
        }
        bw.close();
    }
}
