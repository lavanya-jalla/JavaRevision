import java.util.Scanner;

public class PostiveorNegative {
    public static void main(String[] args) {
        // int n;
        Scanner sc=new Scanner(System.in);
        // System.err.println("enter n value");
        // n=sc.nextInt();
        // if(n==0){
        //     System.out.println("Zero");
        // }
        // else if(n>0){
        //     System.out.println("Positive");
        // }
        // else{
        //     System.out.println("Negative");
        // }
        int m;
        System.err.println("enter m value");
        m=sc.nextInt();
         if(Math.abs(m)<=9){
            System.out.println("Single digit number");
         }
         else if(Math.abs(m)>=10 && Math.abs(m)<=99){
            System.out.println("Two digit number");
         }
         else{
            System.out.println("bigger");
         }
         sc.close();

    }
    
}
