import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Text");
        String text=sc.nextLine();
        String reversed = "";
        for(int i=text.length()-1;i>=0;i--)
            {
            reversed=reversed+text.charAt(i);
            }
             
        if(text.equalsIgnoreCase(reversed))
            System.out.println("String is Palindrome");
        
        else
            System.out.println("String is not Palindrom");
        }
}
