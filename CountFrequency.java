import java.util.Scanner;
public class CountFrequency {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int count=0;
       System.out.println("Enter the text");
          String text=sc.nextLine();
       System.out.println("which character you want to count");
             char x = sc.next().charAt(0);
          for(int i=0;i<text.length();i++){
            if(text.charAt(i)==x){
                count++;
            }} 
            System.out.println(" Number " + x + "'s frequency is " + count  );     
    }
    
}
