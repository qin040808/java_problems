import java.util.Scanner;

public class boj2941 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s=s.replace(" ","");
        s=s.replaceAll("c=","a");
        s=s.replaceAll("s=","a");
        s=s.replaceAll("dz=","a");
        s=s.replaceAll("z=","a");
        s=s.replaceAll("c-","a");
        s=s.replaceAll("d-","a");
        s=s.replaceAll("lj","a");
        s=s.replaceAll("nj","a");
        System.out.println(s.length());
    }
}