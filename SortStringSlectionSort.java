import java.util.Scanner;
public class SortStringSlectionSort
 {
    public static void main(String[] args)
    {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter no. of String ");
        int n=Sc.nextInt();
              Sc.nextLine();//important line he bhai
        String[] str=new String[n];
        System.out.println("enter " + n + " the string ");
         for(int i=0;i<n;i++)
         {
            str[i]=Sc.nextLine();
         }
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(str[j].toLowerCase().compareTo(str[min].toLowerCase())<0)
                    min=j;
            }
        
               if(min!=i)
                {
               String temp = str[min];
               str[min]=str[i];
               str[i]=temp;
               }
        }
        
     System.out.print("Sorted String :");
     for(String s:str)
       System.out.print(s + " ");
    
   }
 }

    

