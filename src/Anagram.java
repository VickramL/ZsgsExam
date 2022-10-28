import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        while(n-->0){
            String str = input.next();
            int length = str.length();
            int count = 0;

                int l = 1,r=length-2;
                while (r>=0 && l<length-1){
                    String s1 = str.substring(0,l+1);
                    String s2 = str.substring(r,length);
                    char[] c1 = s1.toCharArray();
                    char[] c2 = s2.toCharArray();
                    Arrays.sort(c1);
                    Arrays.sort(c2);
                    if(String.valueOf(c1).equals(String.valueOf(c2))) {
                        count++;
                        System.out.println(s1+","+ s2);
                    }
                    l++;
                    r--;
                }
                int i = 0,j=length-1;
                while (i<=j){
                    if(str.charAt(i) == str.charAt(j)) {
                        System.out.println(str.charAt(i)+","+str.charAt(j));
                        count++;
                    }
                    i++;
                    j--;
                }

            System.out.println(count);
        }


    }
}
