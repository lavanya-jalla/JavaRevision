import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        
    
   //finding miss number in array arr={1,2,3,5} missing 4
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array values: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
     
        int n = size + 1; 
        
        int expectedSum = n * (n + 1) / 2;
   
        int actualSum = 0;
        for (int i = 0; i < size; i++) {
            actualSum += arr[i];
        }
     
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("Missing number is: " + missingNumber);
        sc.close();

    
    }
}
