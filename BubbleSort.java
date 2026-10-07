import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=Sc.nextInt();
        
        int[] arr=new int[n];

        System.out.println("Enter "+ n + " Elements of the Array");
        for(int i=0;i<n;i++){
          arr[i] = Sc.nextInt();
        }
         int result = bubble(arr,arr.length);
           System.out.print("Sorted Array:");
             for(int num:arr){
            System.out.print(num + " ");
            
            }
            System.out.println("");
            System.out.println("Total Swapping: " +result);

         }
          
         public static int bubble(int[] arr, int n){
            if(n==1){
               return 0 ; }
            boolean swapped=false;
            int count=0;

            for(int i=0;i<arr.length-1;i++)
                {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    count++;
                    swapped=true;
                    
                }
            }
            //if no swap happed, array is already sorted-stop resursion
            if(swapped==false)
                return count;
              return bubble(arr,n-1)+count;
             }

    }
