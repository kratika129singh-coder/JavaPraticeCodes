import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of  1st array ");
           int x = sc.nextInt();
        int arr1[]=new int[x];
      System.out.println("enter " + x + " elements of array");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();}
      
             System.out.println("enter the size of  2nd array ");
           int y = sc.nextInt();
        int arr2[]=new int[y];
      System.out.println("enter " + y + " elements of array");
        for(int i=0;i<arr1.length;i++){
            arr2[i]=sc.nextInt();}

     int[] mergeArray= new int [arr1.length+arr2.length];
     for(int i=0;i<arr1.length;i++){
        mergeArray[i]=arr1[i];
     }
     for(int i=0;i<arr2.length;i++){
        mergeArray[arr1.length+i]=arr2[i];
     }

     System.out.println("The Merged Array : ");
     for( int i=0;i<mergeArray.length;i++){
        System.out.print(mergeArray[i]+ " ");
     }
 

    }
    
}
