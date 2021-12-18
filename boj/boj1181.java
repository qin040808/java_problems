import java.util.Scanner;

public class boj1181 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String tmp[] = new String[l];
        for (int i = 0,n=0; n < tmp.length; i++,n++) {
            tmp[i] = in.next();
            for (int j = 0; j < i; j++) {
                if(tmp[i].equals(tmp[j])){
                    l--;
                    tmp[i] = null;
                    i--;
                    break;
                }
            }
        }
        in.close();
        String arr[] = new String[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=tmp[i];
        }
        String temp;
        int min;
        for (int i = 0; i < arr.length; i++) {
            min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min].length()>=arr[j].length()) {
                    if(arr[min].length()==arr[j].length()){
                        for (int k = 0; k < arr[min].length(); k++) {
                            if((int)(arr[min].charAt(k))>(int)(arr[j].charAt(k))) {
                                min=j;
                                break;
                            }else if((int)(arr[min].charAt(k))<(int)(arr[j].charAt(k))){
                                break;
                            }
                        }
                    }else{
                        min=j;
                    }
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (String string : arr) {
            System.out.println(string);
        }
    }
}
