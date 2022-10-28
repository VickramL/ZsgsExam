import java.util.Scanner;

public class LargestSubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the Array : ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("enter array elements : ");
        for(int i = 0;i<n;i++){
            array[i] = input.nextInt();
        }
        int max = 0;
        int i =0, j= 0;
        int sum = 0;
        for(i = 0;i<n;i++){
             sum = 0;
            for(j =i;j<n;j++){
                sum += array[j];
                if(sum == 0){
                    max = Math.max(j-i+1,max);
                }
            }
        }
        if(sum == 0){
            max = Math.max(j-i+1,max);
        }
        System.out.println(max);
    }
}
