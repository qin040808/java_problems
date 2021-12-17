import java.util.Scanner;

public class boj1018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String board[] = new String[a];
        String chess[][] = new String[8][8];
        int min=64;
        int ch;
        for (int i = 0; i < board.length; i++) {
            board[i]=in.next();
        }
        in.close();
        for (int i = 0; i < board.length-7; i++) {
            for (int l = 0; l < b-7; l++) {   
                for (int j = 0,k=i; j < chess.length; j++,k++) {
                    chess[j]=(board[k].substring(l, l + 8)).split("");
                }
                ch=check(chess);
                if(ch<min) {
                    min=ch;
                }
            }
        }
        System.out.println(min);
    }

    public static int check(String chess[][]) {
        int cnt=0;
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if(((j%2)+(i%2))%2==0){
                    if(chess[i][j].equals("W")) {
                       cnt++; 
                    }
                }else{
                    if(chess[i][j].equals("B")) {
                        cnt++;
                    }
                }
            }
        }
        if(cnt==32){
            cnt=0;
            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess[i].length; j++) {
                    if((j%2)+(i%2)==1){
                        if(chess[i][j].equals("W")) {
                           cnt++; 
                        }
                    }else{
                        if(chess[i][j].equals("B")) {
                            cnt++;
                        }
                    }
                }
            }
        }
        return cnt>32?64-cnt:cnt;
    }
}
