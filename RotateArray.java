import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of  array ");
           int x = sc.nextInt();

         int  arr[]=new int[x];
      System.out.println("enter " + x + " elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();}
            
        while(true){
            System.out.println("Press 2 if you want Left Rotate");
            System.out.println("Press 1 if you wan to Right Rotate");
            System.out.println("Press 3 if you want to Exit");

            System.out.println("Enter your Chice");
            int choice=sc.nextInt();
            switch(choice){
            
          case 1:  
              int last=arr[arr.length-1];
             for(int i=x-1;i>0;i--){
                arr[i]=arr[i-1];
         }
            arr[0]=last;
         System.out.print("Right Rotation : ");  
        for(int num:arr)
        System.out.print( num + " ");
        System.out.print(" ");
        break;
      
          case 2:
             int first=arr[0];
        for(int i=0;i<x-1;i++){
            arr[i]=arr[i+1];}
        
            arr[arr.length-1]=first;
        System.out.print("Left Rotation : " );  
        for(int num1:arr)
        System.out.print(num1 + " ");
    
    break;
          case 3:
        System.out.print("Exit Thank you");
            break;
        default:
     System.out.println("Invalid choice");
    }
}
} }  
    
    

