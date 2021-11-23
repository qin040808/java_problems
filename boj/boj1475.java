import java.util.Scanner;

public class boj1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.close();
        int nums[] =new int[10];
        int com;
        while(t>0){
            com= t%10;
            t=t/10;
            nums[com]++;
        }
        com = nums[6]+nums[9];
        if(com%2==0) {
            nums[6] = com / 2;
            nums[9] = com / 2;
        }else {
            nums[6] = com / 2 +1;
            nums[9] = com / 2 +1;
        }
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max) {
                max=nums[i];
            }
        }
        System.out.println(max);
    }
}