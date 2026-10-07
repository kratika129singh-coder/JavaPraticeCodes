import java.util.Scanner;
public class RemoveDuplicateFromArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of  array ");
           int x = sc.nextInt();
        
           int  arr[]=new int[x];
      System.out.println("enter " + x + " elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();}
            System.out.println("After the Removing Duplicate No.");
        
        for(int i=0;i<arr.length;i++){
            boolean isduplicate=false;
              
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                   isduplicate=true;
                 break;}}
        
         if(!isduplicate){
            System.out.print( arr[i] + " ");
        
      }
    }}}