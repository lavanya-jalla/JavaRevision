import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        a=sc.nextInt();
        System.out.println("Enter another number: ");
        b=sc.nextInt();
       
        System.out.println("Enter another number: ");
        c=sc.nextInt();
        // int greatestofTwo=Math.max(a,Math.max(b,c));
        // System.out.println("The greatest of three Numbers is: "+greatestofTwo);

        int max =(a>=b&&a>=c)?a:(b>=c)?b:c;
        System.out.println("The Max Number is : "+max);

       

    }
}