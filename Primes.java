import java.util.Scanner;
public class Primes {
    public static void main(String[] args) {
        //  int n;
        // Scanner sc=new Scanner(System.in);
        //  System.out.println("Enter a number");
        // n=sc.nextInt();
        //        System.out.println("Print prime numbers: from 1 to N");
        //        for (int i = 2; i <= n; i++) { 
        //         int count=0; 
        //     for (int j = 1; j <= i; j++) { 
        //         if (i % j == 0) { 
        //             count++; 
        //         } 
        //     } 
        //          if (count == 2) { 
        //         System.out.print(i + " "); 
        //     } 
        // } 
        
        // sc.close();





    //     int x,count=0;
    //     Scanner sc=new Scanner(System.in);
    //   System.out.println("enter number: ");
    //     x=sc.nextInt();
    //     for(int i=2;i<=x;i++){
    //         if(x%i==0)
    //         {
    //             count++;
    //         }
    //     }
    //         if(count==1){
    //             System.out.println("Prime number");
    //         }
    //         else{
    //             System.out.println("not a prime number");
    //         }
    //         sc.close();






    //  int n,count=0;
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter number: ");
    //     n=sc.nextInt();
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0)
    //         {
    //             count++;
    //         }
    //     }
        
    //     System.out.println("The nof the factors are " +count );
    //     sc.close();





    
     int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0)
            {
                System.out.print(i+" " );
                
            }
        }
        
        sc.close();



    
   
        }
    }
