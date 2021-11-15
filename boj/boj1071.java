import java.util.Arrays;
import java.util.Scanner;

public class boj1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean check = true;
        int temp = 0;
        boolean sec = true;
        while (check) {
            check = false;
            for (int i = 0; i < arr.length-1; i++) {
                if ((arr[i] + 1) == arr[i + 1]) {
                    sec = true;
                    check = true;
                    for (int j = i; j < arr.length; j++) {
                        if ((arr[i] + 1) < arr[j]) {
                            temp = arr[i + 1];
                            arr[i + 1] = arr[j];
                            arr[j] = temp;
                            sec = false;
                            break;
                        }
                    }
                    if (sec) {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        break;
                    }
                }
            }
        }
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}