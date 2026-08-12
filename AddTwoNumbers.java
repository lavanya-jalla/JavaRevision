import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter a value");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum: "+c);
        sc.close();

    }
    
}
