import java.util.Scanner;
public class SwapCharacterOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
          String text = sc.next();
        if(text.length()>1)//String should be bigger then 1
         {  
           char first=text.charAt(0);
           char last=text.charAt(text.length()-1);
           String middle=text.substring(1,text.length()-1);
               String Swapper=last + middle + first;
           System.out.println("original String " + text);
           System.out.println("Swapped String  " + Swapper );}
        else  //if not then this                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
            {
           System.out.println("String is too short to swap");}
    }
}
