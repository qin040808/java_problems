import java.util.Scanner;

public class boj1022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt(); 
        int y1 = in.nextInt(); 
        int x2 = in.nextInt(); 
        int y2 = in.nextInt();
        int max = 0;
        if(Math.abs(x1)>max){ max=Math.abs(x1); }
        if(Math.abs(y1)>max){ max=Math.abs(y1); }
        if(Math.abs(x2)>max){ max=Math.abs(x2); }
        if(Math.abs(y2)>max){ max=Math.abs(y2); }
        if(max==0){ System.out.println(1); return;}
        int board[][] = new int[max*2+1][max*2+1];
        board = snail(board);
        // x1+=board.length/2;
        // y1+=board.length/2;
        // x2+=board.length/2;
        // y2+=board.length/2;
        // String str;
        // int n= 1;
        // int ns = board.length*board.length;
        // while(ns>9){
        //     ns/=10;
        //     n*=10;
        // }
        // ns=n;
        // for (int i = x1; i <= x2; i++) {
        //     for (int j = y1; j <= y2; j++) {
        //         str="";
        //         n=ns;
        //         while(board[i][j]<n){
        //             str=str+" ";
        //             n/=10;
        //         }
        //         System.out.print(str+board[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
    public static int[][] snail(int n[][]) {
        int mid = n.length/2;
        int x=mid;
        int y=mid;
        int cnt = 2;
        int way=1;
        int move=1;
        int i,j;
        n[y][x]=1;
        while(move<=n.length) {
            for (i = 1; i <= move; i++) {
                x+=way;
                n[y][x]=cnt;
                cnt++;
                if(cnt>n.length*n.length){ break; }
            }
            if(cnt>n.length*n.length){ break; }
            for (j = 1; j <=move; j++) {
                y+=-1*way;
                n[y][x]=cnt;
                cnt++;
                if(cnt>n.length*n.length){ break; }
            }
            if(cnt>n.length*n.length){ break; }
            move++;
            way*=-1;
        }
        return n;
    }
}
