import java.util.Scanner;
public class CountNoWords {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the text ");
        String text = Sc.nextLine();
         int count=0; 
         String Largestword=" ";
        String[] words=text.split(" ");
        for(String word:words){
            count++;
            if(word.length()>Largestword.length()){
                Largestword=word;
            }

        }
        System.out.println("No. of Words :" + count);
        System.out.println("Largest word : " + Largestword);
        
    }
    
}
