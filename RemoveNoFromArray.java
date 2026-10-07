import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class RemoveNoFromArray {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array ");
             int x = sc.nextInt();

         int arr[]=new int[x];
         System.out.println("enter " + x + " elements of array");
              for(int i=0;i<arr.length;i++){
              arr[i]=sc.nextInt();}

         System.out.print("Array :");
          for(int i=0;i<arr.length;i++){
          System.out.print(arr[i] +" ");} 
          System.out.print("\n ");
             
        Set<Integer>NewArray =new LinkedHashSet<>();
        for(int num : arr){
            NewArray.add(num);

        }
        System.out.print("Array without Duplicate: ");
        for( int num : NewArray){
            System.out.print(num +" ");
        
      }

    }
    
}
