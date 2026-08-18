import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //printing characters
        // String name;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a string : ");
        // name=sc.nextLine();
        // for(int i=0;i<name.length();i++){
        //     System.out.println(name.charAt(i));
        // }
        // sc.close();



        // count characters
        // String name;
        // int count=0;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a string : ");
        // name=sc.nextLine();
        // for(int i=0;i<name.length();i++){
        //     count++;
        // }
        // System.out.println("The total no of characters in the given string: "+count);
        // sc.close();



         // count characters
        // String name="Programming";
        // char character='g';
        // int count=0;
    
        // for(int i=0;i<name.length();i++){
        //     if(name.charAt(i) == character){

        //         count++;
        //     }
        // }
        // System.out.println("The total no of characters in the given charcter in string: "+count);
      



        //count vowels
        // String name;
        // int count=0;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a string : ");
        // name=sc.nextLine();
        // String lowerName=name.toLowerCase();
          
        // for(int i=0;i<lowerName.length();i++){
        //     char ch = lowerName.charAt(i); 
        //     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

        //         count++;
        //     }
        // }
        // System.out.println("The total no of vowels in the given string: "+count);
        // sc.close();

//count vowels
//  String name="Programming";
//         int count=0;
       
//         String lowerName=name.toLowerCase();
          
//         for(int i=0;i<lowerName.length();i++){
//             char ch = lowerName.charAt(i); 
//             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

//                 count++;
//             }
//         }
//         System.out.println("The total no of vowels in the given string: "+count); 



        //Reverse of a string
        // String name;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a string : ");
        // name=sc.nextLine();
        // char[] characters=name.toCharArray();
        // int left=0;
        // int right=characters.length-1;
     
        // while(left<right){
        //     char temp=characters[left];
        //     characters[left]=characters[right];
        //     characters[right]=temp;
        //     left++;
        //     right--;
            
        // }
        // String reveString=new String(characters);
        // System.out.println("Reverse of the given string: "+reveString);
    
        // sc.close();


          //Reverse of a string
        // String name="Lavanya";
        // char[] characters=name.toCharArray();
        // int left=0;
        // int right=characters.length-1;
     
        // while(left<right){
        //     char temp=characters[left];
        //     characters[left]=characters[right];
        //     characters[right]=temp;
        //     left++;
        //     right--;
            
        // }
        // String reveString=new String(characters);
        // System.out.println("Reverse of the given string: "+reveString);
    
      




         //palindrome or not

        // String name;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a string : ");
        // name=sc.nextLine();
        // char[] characters=name.toCharArray();
        // int left=0;
        // int right=characters.length-1;
     
        // while(left<right){
        //     char temp=characters[left];
        //     characters[left]=characters[right];
        //     characters[right]=temp;
        //     left++;
        //     right--;
            
        // }
        // String reveString=new String(characters);
        // if(reveString.equals(name)){

        //     System.out.println("Given String is palindrome");
        // }
        // else{
        //     System.out.println("Not a palindrome");
        // }
    
        // sc.close();



         //linear search
        // String name;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a string : ");
        // name=sc.nextLine();
        
        // char target;
        // System.out.println("Enter a character to find: ");
        // target=sc.next().charAt(0);
        // for(int i=0;i<name.length();i++){
        //     if(name.charAt(i)==target){
        //         System.out.println(i);
        //     }
        // }
     
    
        // sc.close();



        



        //array search
        //   Scanner sc=new Scanner(System.in);
        // System.out.println("enter the size of array");
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        //   System.out.println("Enter the array values: ");
        // for(int i = 0; i < size; i++){
        //     arr[i] = sc.nextInt();
        // }
        // int target;
        // System.out.println("Enter a number to find: ");
        // target=sc.nextInt();
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target){
        //         System.out.println(i);
        //     }
        
        // }
    
        // sc.close();





        
        //array search
          
        // int arr[]={10,20,30,40,50};
        // int target=40;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target){
        //         System.out.println("element found at index: "+i+" ");
        //     }
        
        // }
    
       


        //sorting=bubble sort
        //   Scanner sc=new Scanner(System.in);
        // System.out.println("enter the size of array");
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        //   System.out.println("Enter the array values: ");
        // for(int i = 0; i < size; i++){
        //     arr[i] = sc.nextInt();
        // }
       
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;

        //         }
        //     }
            
        //     }
        //     System.out.println("The sorted array: ");
        //     for(int i=0;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        
            
        //         sc.close();






        //sorting=bubble sort
      
        int arr[]={5,2,8,1,3};
       
       
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
            
            }
            System.out.println("The sorted array: ");
            for(int i=0;i<arr.length;i++){
                System.out.print(" "+ arr[i]);
            }
        
            
                
        }


    
    }
    



    
    

