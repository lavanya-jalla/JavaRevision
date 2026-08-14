import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
      
    //     System.out.println("Enter a number : ");
    //     int n=sc.nextInt();
    //     if(n%2==0){
    //         System.out.println("Even");
    //     }
    //     else{
    //         System.out.println("Odd");
    //     }
    //     sc.close();


    // }
      int m;
      Scanner sc=new Scanner(System.in);
        System.err.println("enter m value");
        m=sc.nextInt();
        if(m<0){
            System.out.println("Not Postive");
        }if(m>0){
           if(m%2==0){
             System.out.println("Postive Even");
      }
         else{
             System.out.println("Positive Odd");
         }
         sc.close();

        }
    }
    
}
