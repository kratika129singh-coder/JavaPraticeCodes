import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheckOfString {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Entr the Fisrt String");
        String x = Sc.next();
        System.out.println("Entr the Second String");
        String y = Sc.next();
            x.toLowerCase();
            y.toLowerCase();
        if(x.length()!=y.length()){
            System.out.println("Strings are not Anagrams ");
            return;
        }
            char[] arr1=x.toCharArray();
            char[] arr2=y.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Strings are  Anagrams ");
        }
        else{
            System.out.println("Strings are not Anagrams ");
        }

    
    
    
    
        }
        
    
    
}
