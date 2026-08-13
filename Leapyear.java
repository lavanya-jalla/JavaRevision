import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        System.out.println("Enter a valid year: ");
        if(year%400==0|| (year%4==0 && year%100!=0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a year");
        }
    }
    
}
