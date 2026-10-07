import java.util.Scanner;
public class Arrayoprations {
    public static void main(String[] args){ 
      Scanner sc = new Scanner(System.in);

      System.out.println("enter the size of array ");
      int x = sc.nextInt();

       int arr[]=new int[x];
       int a[]=new int [x];
      System.out.println("enter " + x + " elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();}

      System.out.print("Array :");
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
      }

       while(true){
      System.out.println("\nwhich opration do you want to do");
      System.out.println("  pessr 1:  To know the  Sum of Array Elements");
      System.out.println("  press 2:  To  Count  Even and Odd Numbers ");
      System.out.println("  press 3:  To know the Maximum no.of Array");
      System.out.println("  press 4:  To know the Minimum no. of Array");
      System.out.println("  press 5:  To know the Number occurence");
      System.out.println("  press 6:  To know Reverse an Array");
      System.out.println("  press 7: To know Second Largest no.");
      System.out.println("  press 8: if you have Done");
      
      System.out.println(" Enter the choice");
       int choice=sc.nextInt();
       switch(choice){
        case 1: 
        int sum=0;
        for(int i=0;i<arr.length;i++)
           sum += arr[i];
        System.out.println("Sum of Array :" +sum);
        break;
         
        case 2:
        int even=0; int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               even++;}
            else{
               odd++;}}
        System.out.println("Even no :" +even+ ", Odd no.:" +odd );
        break;

        case 3:
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>0){
            max=arr[i];} }
        System.out.println("Maximum no. of Array :" +max);
        break;

        case 4:
          int min=arr[0];
          for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
              min=arr[i];  }}
          System.out.println("Minimum no. of Array :" +min);
           
            break;

        case 5:
        int count=0;
        System.out.println("which no. want to count");
        int y = sc.nextInt();
        for(int i=0;i<arr.length;i++){
          if(arr[i]==y){
            count++;}}
        System.err.println("The " + y + " no. is " + count + " times in Array" );
        break;
         case 6:
          System.out.println("Reverse of the Array : ");
          for(int i=x-1; i>=0; i--){
             a[i]=arr[i];
          System.out.print(a[i] +" ");}
          break;
        
        case 7:
        int secondLargest=0; int Largest=0;
        for(int i=0;i<arr.length;i++){
          if(Largest>arr[i])
            secondLargest=arr[i];
            Largest=arr[i];
          } 
        System.out.println("Second Largest no is : " +secondLargest);
        break;    
         case 8: 
        System.out.println("Thankyou" );
        sc.close();
        return; 
          
    default:
        System.out.println("invalid choice Sorry");

    }
      }
    }
}