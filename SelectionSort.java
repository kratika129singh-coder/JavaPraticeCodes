import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=Sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the Element of the Array");
        for(int i=0;i<n;i++){
           arr[i] = Sc.nextInt();}
        
        int[] arrcopy=arr.clone();
        AsendingSort(arr);
        System.out.println("\nThe Asending order of the Array :"  );
          print(arr);
        DecendingSort(arrcopy);
        System.out.println("\nThe Decending order of the Array :"  );
          print(arrcopy);
    }
    public static void AsendingSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {int min=i;
            for(int j=i+1;j<n;j++)
            {if(arr[j]<arr[min])
                {
                    min=j;
                }
                 int temp=arr[min];
                 arr[min]=arr[i];
                 arr[i]=temp;} } }

    public static void DecendingSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {int max=i;
            for(int j=i+1;j<n;j++)
            {if(arr[j]>arr[max])
                {
                    max=j;
                }
                 int temp=arr[max];
                 arr[max]=arr[i];
                 arr[i]=temp;}}}
    
    public static void print(int[] arr){
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.print(" ");
    }
}
