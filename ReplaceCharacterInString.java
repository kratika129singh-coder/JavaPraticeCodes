import java.util.Scanner;
public class ReplaceCharacterInString {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the text");
        String text=Sc.nextLine();
        System.out.println("Which character you want to Replace");
          String x=Sc.next();
        System.out.println("what you want to insert instead of " + x);
          String y=Sc.next();
         String z =text.replace(x, y);
        System.out.println("New String : " + z );
    }
    
}
