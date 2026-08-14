import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
         int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        a=sc.nextInt();
        System.out.println("Enter another number: ");
        b=sc.nextInt();
       
        System.out.println("Enter another number: ");
        c=sc.nextInt();
      
        if(a<=b&&a<=c){
            System.out.println("Smaller number is: "+a);
        }
        else if(b<=a&&b<=c){
            System.out.println("The Smaller number is: "+b);
        }
        else{
            System.out.println("The Smaller number is: "+c);
        }
    }

}
