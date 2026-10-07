import java.util.Scanner;
public class CountVowelConsonant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Text");
        String S=sc.nextLine();
        S = S.toLowerCase();
        int Vowel=0; int Consonant=0;

        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);//take the charters at position i and store it in a variable named 'ch'
        if(ch>='a' && ch<='z'){
        if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' ||ch=='u')
             Vowel++; 
        else
           Consonant++;  }}

        System.out.println("Vowel:" + Vowel);
        System.out.println("Consonant" + Consonant);} }
    

