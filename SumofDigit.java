import java.util.Scanner;
public class SumofDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
            int result = SumDigit(n);
        System.out.println("Sum of Digit of " + n + " Number : " +result);
    }
    public static int SumDigit(int n){
        if (n==0){
            return 0;
        }
        return n%10+ SumDigit(n/10);
    }
    
}
