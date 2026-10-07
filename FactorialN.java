import java.util.Scanner;
public class FactorialN {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = Sc.nextInt();
        int result = Factorial(n);
        System.out.println("Factorial of Number "  + n + " :" +result);
    }
    public static int  Factorial(int n){
        if(n==0)
        {
           return 1 ;
        }
           return n* Factorial(n-1);
    } 
    
}
