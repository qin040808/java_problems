import java.util.Scanner;

public class boj2947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        sc.close();
        boolean check = false;
        int temp;
        int i=0;
        while(!check) {
            check=true;
            if(num[i]>num[i+1]) {
                temp = num[i];
                num[i] = num[i+1];
                num[i+1] = temp;                    
                for (int j = 0; j < num.length; j++) {
                    if(num[j]!=j+1) {
                        check=false;
                    }
                    System.out.print(num[j]+" ");
                }
                System.out.println();
            }
            i++;
            if(i>3){
                i=0;
            }
            for (int j = 0; j < num.length; j++) {
                if(num[j]!=j+1) {
                    check=false;
                }
            }
        }
    }
}
