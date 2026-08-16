import java.util.Scanner;

public class ArraysProblems {
    public static void main(String[] args) {

        //duplicates of an array
//          int count=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of array");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("Enter the array values: ");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//         for(int j=i+1;j<size;j++){
//             if(arr[i]==arr[j]){
//             System.out.println("duplicate values"+arr[i]);
//             count++;
//             break;

//         }
//     }
// }
    
//     System.out.println("the count of duplicate values: "+count);






//largest
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the size of array");
// int size=sc.nextInt();
// int arr[]=new int[size];
// int largest=arr[0];
//         System.out.println("Enter the array values: ");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//         for(int j=1;j<=size;j++){
//             if(arr[i]>largest){
//                 largest=arr[i];
            
    
//         }
//     }
// }
    
//     System.out.println("the largest value: "+largest);




//Smallest
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the size of array");
// int size=sc.nextInt();
// int arr[]=new int[size];

//         System.out.println("Enter the array values: ");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         int smallest=arr[0];
//         for(int i=1;i<size;i++){
       
//             if(arr[i]<smallest){
//                 smallest=arr[i];
            
    
        
//     }
// }
    
//     System.out.println("the Smallest value: "+smallest);





//secondlargest
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the size of array");
// int size=sc.nextInt();
// int arr[]=new int[size];
// int largest=arr[0];
// int secondLargest=arr[1];
//         System.out.println("Enter the array values: ");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//         for(int j=1;j<=size;j++){
//             if(arr[i]>largest){
//                 secondLargest=largest;
//                 largest=arr[i];
            
    
//         }
//         else if(arr[i]>secondLargest&&arr[i]!=largest){
//             secondLargest=largest;
//         }
       
//     }
// }
    
//     System.out.println("the secondlargest value: "+secondLargest);





//count no of even and odd
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the size of array");
// int size=sc.nextInt();
// int arr[]=new int[size];
// int eventCount=0;
// int oddCount=0;
//         System.out.println("Enter the array values: ");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//             if(arr[i]%2==0){
//                 eventCount++;
        
//         }
//         else{
//             oddCount++;
//         }
//     }
//         System.out.println("Even count: "+eventCount);
//         System.out.println("Even count: "+oddCount);





//Reverse of an array
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the size of array");
// int size=sc.nextInt();
// int arr[]=new int[size];

//         System.out.println("Enter the array values: ");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         int left=0;
//         int right=arr.length-1;
//             while(left<right){
//                 int temp=arr[left];
//                 arr[left]=arr[right];
//                 arr[right]=temp;
//                 left=left+1;
//                 right=right-1;
        
//         }
      
    
//         System.out.println("Reverse of an array: ");
//           for(int i = 0; i < size; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
        
//         sc.close();





//search for an elemet linear search

// Scanner sc=new Scanner(System.in);
// System.out.println("enter the size of array");
// int size=sc.nextInt();
// int arr[]=new int[size];

//         System.out.println("Enter the array values: ");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         int target;
//         System.out.println("Enter target to search");
//         target=sc.nextInt();
//           boolean isFound = false;
//              for(int i=0;i<size;i++){
//             if(arr[i]==target){
//                 System.out.println("Element found at index: " + i);
//                 isFound = true;
//                 break;

//             }
//         }
//             if(!isFound){
//                 System.out.println("Not found");
//             }





//sum of even numbers
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the size of array");
// int size=sc.nextInt();
// int arr[]=new int[size];
// int sum=0;
//         System.out.println("Enter the array values: ");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//             if(arr[i]%2==0){
//                 sum=sum+arr[i];
        
//         }
        
//     }
//     System.out.println("Even sum is: "+sum);



        //first duplicate of an array
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
          System.out.println("Enter the array values: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int firstDuplicate = -1;
        boolean duplicateFound = false;
 

        for(int i = 0; i < size; i++){

            for(int j = i + 1; j < size; j++){
                if(arr[i] == arr[j]) { 
                    firstDuplicate = arr[i];
                    duplicateFound = true;
                    break; 
                }
            }
        }
    
        if(duplicateFound) {
            System.out.println("the first duplicate: " + firstDuplicate);
        } else {
            System.out.println("No duplicate elements found.");
        }
        
        sc.close();

        }
        
        }
      
    
      
        
        
       
    

    



    
    



