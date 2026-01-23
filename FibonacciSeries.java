import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args)
    {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter the no. of term");
        int n = Sc.nextInt();
              Series(n);
        System.out.print("Fibonacci Series uo to " + n + " Number : ");   
        for(int i=0;i<n;i++)
        System.out.print( Series(i) + "  ");   
    }
     
    public static int Series(int n){
        if(n==0)
         return 0;
        else if(n==1)
        return 1;
       else
       return Series(n-1) + Series(n-2);
    }}

