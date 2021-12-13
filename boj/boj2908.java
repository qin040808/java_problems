import java.util.Scanner;

public class boj2908{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String s1 = in.next();
        in.close();
        String[] l = s.split("",3);
        String[] l1 = s1.split("",3);
        String r = l[2]+l[1]+l[0];
        String r1 = l1[2]+l1[1]+l1[0];
        if(Integer.parseInt(r)>Integer.parseInt(r1)){
            System.out.println(r);
        }else{
            System.out.println(r1);
        }
    }
}