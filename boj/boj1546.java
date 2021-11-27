import java.util.Scanner;
public class boj1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double sum=0;
        double b[] = new double[a];
        for (int i = 0; i < a; i++) {
            b[i] = in.nextInt();
        }
        double max=0;
        for (int i = 0; i < a; i++) {
            if(b[i]>max){
                max=b[i];
            }
        }
        for (int i = 0; i < a; i++) {
            b[i]=b[i]/max*100;
        }
        for(double c:b){
            sum+=c;
        }
        System.out.println(sum/a);
    }
}