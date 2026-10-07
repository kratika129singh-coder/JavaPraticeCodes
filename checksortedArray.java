import java.util.Scanner;

public class checksortedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of  array ");
           int x = sc.nextInt();

         int  arr[]=new int[x];
      System.out.println("enter " + x + " elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();}
      
      boolean Asending=true;
      boolean Desending=true;
  {
      for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                {Asending =false;
                     break;}} }
      for(int i=0;i<arr.length-1;i++){
        if(arr[i]<arr[i+1]){
            {
                Desending=false;
                break;}}
            }
 }
      
     if(Asending){
        System.out.println("Array is sorted in Asending order ");}
    else if(Desending){
        System.out.println("Array is not sorted in Desending order");}
    else{
        System.out.println("Array is not sorted in any order");
        }

    }}