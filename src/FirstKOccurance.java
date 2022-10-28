import java.util.HashMap;
import java.util.Scanner;

public class FirstKOccurance {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,20};
        System.out.print("Enter k : ");
        int k = input.nextInt();
        if(k == 1){
            System.out.println(array[0]);
            System.exit(0);
        }
        for(int key: array){
            if(map.containsKey(key)){
                int val = map.get(key);
                if(val+1 == k) {
                    System.out.print(key);
                    System.exit(0);
                }
                map.put(key,++val);
            }
            map.putIfAbsent(key,1);
        }
        System.out.println("0");
    }
}
