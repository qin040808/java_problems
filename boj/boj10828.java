import java.util.Scanner;

public class boj10828 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String line[][] = new String[l][2];
        in.nextLine();
        for (int i = 0; i < line.length; i++) {
            line[i] = in.nextLine().split(" ");
        }
        int stack[] = new int[l];
        for (int i = 0; i < stack.length; i++) {
            switch(line[i][0]) {
                case "push":
                    break;
                case "pop":
                    break;
                case "size":
                    break;
                case "empty":
                    break;
                case "top":
                    break;
            }
        }
        in.close();
    }
}
