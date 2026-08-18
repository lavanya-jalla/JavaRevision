public class FunctionsProblms {
    //Square of a number
    // static int square(int n){
    //     return n*n;

    // }
    // public static void main(String[] args) {
    //     System.out.println(square(5));
    // }



    //boolean even true or false
    // static boolean isEven(int n){
    //     if(n%2==0){
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println(isEven(2));
    //      System.out.println(isEven(3));
    // }



    //largest of three
    // static int largest(int a,int b,int c){
       
    //     if(a>b&&a>c){
    //         return a;
    //     }
    //     else if(b>a&&c>a){
    //         return b;
    //     }
    //     else{
    //         return c;
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println(largest(10,25,15));
    // }



    //reverse of number
    // static int reverse(int n){
    //     int rev=0;
    //     while(n>0){
    //         int l=n%10;
    //         rev=rev*10+l;
    //         n=n/10;
    //     }
    //     return rev;
    // }
    // public static void main(String[] args) {
    //     System.out.println(reverse(1234));
    // }


    // //palindrome
    // static boolean reverse(int n){
    //     int rev=0;
    //     int original=n;
    //     while(n>0){
    //         int l=n%10;
    //         rev=rev*10+l;
    //         n=n/10;
    //     }
    //    if(rev==original){
    //     return true;
    //    }
    //    else{
    //     return false;
    //    }
    // }
    // public static void main(String[] args) {
    //     System.out.println(reverse(121));
    //      System.out.println(reverse(123));
    // }


    //count vowels
    // static int vowels(String S){
    //     String lower=S.toLowerCase();
       
    //     int count=0;
    //     for(int i=0;i<lower.length();i++){
    //          char ch=lower.charAt(i);
    //          if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
    //           count++;
    //          }
    //     }
    //     return count;
    // }
    // public static void main(String[] args) {
    //     System.out.println(vowels("Programming"));
    // }


    //econdlargest
    // static int SecondLargest(int[] arr){
    //             if (arr == null || arr.length < 2) {
    //         return -1; 
    //     }
    //     int largest=arr[0];
    //     int scndLargest=arr[1];
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>largest){
          
    //             scndLargest=largest;
    //             largest=arr[i];
    //         }
    //         else if(arr[i]>scndLargest&&arr[i]!=largest){
    //             scndLargest=arr[i];
    //         }
    //     }
    //     return scndLargest;

    // }
    // public static void main(String[] args) {
    //     System.out.println(SecondLargest(new int[]{10,22,8,40,30}));
    // }

    


    //sumofDigits
    // static int sumOfDigits(int number){
    //     int sum=0;
    //     while(number>0){

    //         int l=number%10;
    //         sum=sum+l;
    //         number=number/10;
    //     }

    //     return sum;
    // }
    // public static void main(String[] args) {
    //     System.out.println(sumOfDigits(456));
    // }



    //even digits
    // static int evenDigitsSum(int number){
    //     int count=0;
    //     while(number>0){
    //         int l=number%10;
    //         if(l%2==0){
    //             count++;

    //         }
    //         number=number/10;
    //     }
    //     return count;
    // }
    // public static void main(String[] args) {
    //     System.out.println(evenDigitsSum(24831));
    // }




    //smallest element in an array
    // static int smallestOfArray(int[] arr){
    //     int smallest=arr[0];
    //     for(int i=0;i<arr.length;i++){

        
    //     if(arr[i]<smallest){
    //         smallest=arr[i];
    //     }
    // }
    //     return smallest;
    // }
    // public static void main(String[] args) {
    //     System.out.println(smallestOfArray(new int[]{20,10,5,30}));
    // }



    //duplicates

    static int duplicates(int[] arr){
      int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            count++;
        }
    }
}
return count;
    }
    public static void main(String[] args) {
        System.out.println(duplicates(new int[]{20,20,30,40,40,30,50}));
    }
    


    
}
