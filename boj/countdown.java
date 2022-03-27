public class countdown {
    public static void main(String[] args) {
        double start = 35;
        double arr[] = new double[15];
        arr[0] = 13;
        for (int i = 1; i < 14; i++, start--) {
            arr[i] = (arr[i-1] + (100/start)); 
        }
        for (double i : arr) {
            System.out.println(i);
        }

    }
}