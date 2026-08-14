import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
    //     int n;
    //     Scanner sc=new Scanner(System.in);
    //     n=sc.nextInt();
    //     if(n%3==0 && n%5==0){
    //         System.out.println("The number is divisible by 3 and 5");
    //     }
    //     else{
    //         System.out.println("Not divisible by 3 and 5");
    //     }
    //     sc.close();
    // }

    //    int n;
    //     Scanner sc=new Scanner(System.in);
    //     n=sc.nextInt();
    //     if(n%7==0){
    //         System.out.println("The number is divisible by 7");
    //     }
    //     else{
    //         System.out.println("Not divisible by 7");
    //     }
    //     sc.close();
    // }
    int n, last,remaining,num;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        last=n%10;
        remaining=n/10;
        num = remaining - (last * 2);
     if (num % 7 == 0) {
    System.out.println("Divisible by 7");
} else {
    System.out.println("Not divisible by 7");
}
    
    }
}
