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
      
      boolean issorted=true;
  
      for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                {issorted =false;
                     break;}} }

    if(issorted==true){
        System.out.println("Array is sorted ");}
    else{
        System.out.println("Array is not sorted");}

    }}