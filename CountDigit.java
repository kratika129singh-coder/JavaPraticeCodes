import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=Sc.nextInt();
            CountDigit(n);
        if(n==0){
            System.out.println("No. of Digit is : 1");
        }
        else{
        System.out.println("No. of Digit in " + n + " is : "  + CountDigit(Math.abs(n)));
        }

    }
    public static int CountDigit(int n){
        if(n==0){
            return 0;}
            return 1+ CountDigit(n/10); 
    }
    
}
