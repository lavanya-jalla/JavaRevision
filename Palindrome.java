import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
       //n numbers printing
        // int n;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a number");
        // n=sc.nextInt();
        // System.out.println("Printing Natural Numbers: ");
        // for(int i=1;i<=n;i++){
        //     System.out.println(i);

        // }
        // sc.close();

        // int n;
        // Scanner sc=new Scanner(System.in);
        //  System.out.println("Enter a number");
        // n=sc.nextInt();
        //        System.out.println("Print even numbers: from 1 to N");
        //        for(int i=2;i<=n;i++){
        //         if(i%2==0){
        //             System.out.println(i);
        //         }
        //        }
        //        sc.close();


        //  int n,sum=0;
        // Scanner sc=new Scanner(System.in);
        //  System.out.println("Enter a number");
        // n=sc.nextInt();
        //        System.out.println("Sum of numbers from 1 to N: ");
        //        for(int i=1;i<=n;i++){
        //         sum=sum+i;
                    
        //         }
        //         System.out.println(sum);
        //         sc.close();




    //        int n,count=0;
    //     Scanner sc=new Scanner(System.in);
    //      System.out.println("Enter a number");
    //     n=sc.nextInt();
    //     if(n==0){
    //         count=1;
    //     }
    //     else{
    //     while(n>0){
    //     int l=n%10;
    //     n=n/10;
    //     count++;
        
    //     }
    // }
    //     System.out.println("Count is : "+count);
    //     sc.close();




    //  int n,sum=0;
    //     Scanner sc=new Scanner(System.in);
    //      System.out.println("Enter a number");
    //     n=sc.nextInt();
    //     if(n==0){
    //         sum=0;
    //     }
    //     else{
    //     while(n>0){
    //     int l=n%10;
    //     n=n/10;
    //     sum=sum+l;
        
    //     }
    // }
    //     System.out.println("Count is : "+sum);
    //     sc.close();





    //  int n,rev=0;
    //     Scanner sc=new Scanner(System.in);
    //      System.out.println("Enter a number");
    //     n=sc.nextInt();
    //     if(n==0){
    //         rev=0;
    //     }
    //     else{
    //     while(n>0){
    //     int l=n%10;
    //     rev=(rev*10)+l;
    //     n=n/10;
        
        
    //     }
    // }
    //     System.out.println("Reverse is : "+rev);
    //     sc.close();





     int n,rev=0,original;
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
        n=sc.nextInt();
      original=n;
        while(n>0){
        int l=n%10;
        rev=(rev*10)+l;
        n=n/10;
          
    }
    if(original==rev){
        System.out.println("Reverse is : " +rev+ " It is a Palindrome");
    }
    else{
        System.out.println("Not a palindrome");
    }
        sc.close();




    //   int n,fact=1;
    //     Scanner sc=new Scanner(System.in);
    //      System.out.println("Enter a number");
    //     n=sc.nextInt();
    //     for(int i=1;i<=n;i++){
    //         fact=fact*i;


    //     }
    //     System.out.println("The factorial of a number is: "+fact);
    //     sc.close();



    //    int n,largest=0;
    //     Scanner sc=new Scanner(System.in);
    //      System.out.println("Enter a number");
    //     n=sc.nextInt();
    //     if(n==0){
    //         largest=0;
    //     }
    //     else{
    //     while(n>0){
    //     int last=n%10;
    //     if(last>largest){
    //         largest=last;
    //     }
    //     n=n/10;
        
        
    // }
    // System.out.println("largest digit is : "+largest);
    // }
    //     sc.close();





    int n,count=0;
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
        n=sc.nextInt();
        if(n==0){
            count=0;
        }
        else{
        while(n>0){
        int last=n%10;
        if(last%2==0){
            count++;
        }
        n=n/10;
        
        
    }
    System.out.println("Even  digit  count  : "+count);
    }
        sc.close();




               }
            
    
    
}
