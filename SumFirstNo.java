import java.util.Scanner;
public class SumFirstNo {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=Sc.nextInt();
        int result = findSum(n);
        System.out.println("Sum of First "+ n +"Number is :" +result);
     }
     public static int findSum(int n){
        if(n==0)
            return 0;
        return n + findSum(n-1);
     }
    
}
