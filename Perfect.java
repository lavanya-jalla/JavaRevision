import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
         int n,temp,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0)
            {
                temp=i;
                sum=sum+temp;
            }
        }
        if(sum==n)
        System.out.println("The given number is Perfect number" );
    else{
          System.out.println("The given number is not a Perfect number" );
    }
        sc.close();




//sum of all odd digits
    //  int n,sum=0;
    //     Scanner sc=new Scanner(System.in);
    //      System.out.println("Enter a number");
    //     n=sc.nextInt();
    //            System.out.println("Sum of odd numbers from 1 to N: ");
               
    //                 if(n==0){
    //         sum=0;
    //     }
    //     else{
    //     while(n>0){
    //     int l=n%10;
    //     if(n%2!=0){
    //         sum=sum+l;
    //     }
    //     n=n/10;
        
        
    //     }
    // }
    //     System.out.println("Count is : "+sum);
    //     sc.close();





    // int n,largest=0,secondLargest=0;
    //     Scanner sc=new Scanner(System.in);
    //      System.out.println("Enter a number");
    //     n=sc.nextInt();
              
               
    //     while(n>0){
    //     int l=n%10;
    //     if(l>largest){
    //         secondLargest=largest;
    //         largest=l;
            
    //     }
    //     else if(l>secondLargest&&l!=largest){
    //         secondLargest=l;
    //     }
    //     n=n/10;
    // }
    // System.out.println("Second largest is : "+secondLargest);
    // sc.close();



    // for(int i = 1; i <= 3; i++) {
    // for(int j = 1; j <= 2; j++) {
    //     System.out.print("* ");
    // }
    // System.out.println();
}
}





    
