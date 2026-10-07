import java.util.Scanner;
public class PrintNo{
    public static void main(String[] args){
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=Sc.nextInt();
        if(n<=0){
            System.out.println("Please Enter the Positive No");
        }
        else{
            System.out.println("Asending order : ");
            printAsending(n);
            System.out.println(" ");
            System.out.println("Decending order : ");
            printDecending(n);
            System.out.println(" ");
        }
    } 
    public static void printAsending(int n){
        if(n==0)
        return;
       printAsending(n-1);
       System.out.print(n + " ");}
       
    public static void printDecending(int n){
        if(n==0)
        return;
       System.out.print(n + " ");
         printDecending(n-1);}

}