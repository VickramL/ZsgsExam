import java.util.Scanner;

public class FirstLeader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the Array : ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("enter array elements : ");
        for(int i = 0;i<n;i++){
            array[i] = input.nextInt();
        }
        int max = array[0], i = 0, j=array.length-1;
        while(i<j){
            if(array[i] >= array[j]){
                j--;
            }
            else{
                max = array[j];
                i++;
                j= array.length-1;
            }
        }
        System.out.println(max);
    }
}
