import java.util.Scanner;
public class StringFirstProgram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter Student Name");
    String name=sc.nextLine();
    while (true) { 
       
    System.out.println("Press 1: Length of String ");
    System.out.println("Press 2: Uppercase of String ");
    System.out.println("Press 3: Lowercase of String");
    System.out.println("Press 4: Replace any Letter");
    System.out.println("Press 5: Know only some part of String ");
    System.out.println("Press 6: Exit");

     System.out.println("Enter Your Choice");
      int choice =sc.nextInt();
     switch(choice){
        case 1:
        System.out.println("Length of the String : " + name.length());
        break;
        case 2:
        System.out.println("UpperCase Strig : " + name.toUpperCase());
        break;
        case 3:
        System.out.println("LowerCase String : " + name.toLowerCase());
        break;
        case 4 :
        System.out.println("which letter you wan to replace");
          char x = sc.next().charAt(0);
         System.out.println(" what is the Letter for Replacing");
          char y = sc.next().charAt(0);
        System.out.println("New Name : " + name.replace(x,y));
        break;
        case 5:
        System.out.println("Tell what you want to check");
        String z=sc.next();
        System.out.println("Check contains : " + name.contains(z));
        break;
        case 6:
        System.out.println("Thank you for coming");
        break;
        default:
        System.out.println("Sorry, Invalid Choice");
     }
    }
   }
  }