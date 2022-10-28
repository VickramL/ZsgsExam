
import java.util.HashMap;
import java.util.Scanner;

public class EqualArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the  First Array : ");
        int n1 = input.nextInt();

        System.out.print("Enter the length of the  Second Array : ");
        int n2 = input.nextInt();

        if(n1!=n2){
            System.out.println("Not Equal");
            System.exit(0);
        }

        int[] array1 = new int[n1];
        System.out.print("enter array elements of First Array : ");
        for(int i = 0;i<n1;i++){
            array1[i] = input.nextInt();
        }


        int[] array2 = new int[n2];

        System.out.print("enter array elements of Second Array : ");
        for(int i = 0;i<n2;i++){
            array2[i] = input.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key:array1){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int key:array2){
            if(map.containsKey(key)){
                int value = map.get(key);
                if(value>1){
                    map.put(key,--value);
                }else
                    map.remove(key);
            }
        }
        if(map.size() == 0)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
