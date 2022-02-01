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
        int place = 0;
        for (int i = 0; i < line.length; i++) {
            switch(line[i][0]) {
                case "push":
                    stack[place] = Integer.parseInt(line[i][1]);
                    place++;
                    break;
                case "pop":
                    System.out.println(place == 0 ? -1 : stack[place-1]);
                    place= place > 0 ? --place : 0 ;
                    break;
                case "size":
                    System.out.println(place);
                    break;
                case "empty":
                    System.out.println(place == 0 ? 1 : 0);
                    break;
                case "top":
                    System.out.println(place == 0 ? -1 : stack[place-1]);
                    break;
            }
        }
        in.close();
    }
}
