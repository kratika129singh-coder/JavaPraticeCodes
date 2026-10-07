import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Text");
        String str = Sc.nextLine();
        String result = Reverse(str); 
        System.out.println("Reverse Text : " + result );
        
    }
    public static String Reverse(String str){
        if(str.length()<=1){
            return str;
        }
            return Reverse(str.substring(1))+str.charAt(0);
    }
}
    

