public class FunctionsPractice {
    
    //factorial
    // static int factorial(int n){
    //     int fact=1;
    //         for(int i=1;i<=n;i++){
    //             fact=fact*i;
    //         }
        
    //     return fact;
    //     }
    // public static void main(String[] args) {
    //     System.out.println(factorial(5));
    // }

// //prime
//     static boolean isPrime(int n){
//           int count=0;
//         if(n<=1){
//             return false;
//         }
     
//             for(int i=1;i<=n;i++){
//                 if(n%i==0){
//                     count++;
//                 }
//             }
        
        
//         if(count==2){
//             return true;

//         }
//         else{
//             return false;
//         }
       
//     }

//     public static void main(String[] args) {
//         System.out.println(isPrime(7));
//         System.out.println(isPrime(10));
//         System.out.println(isPrime(0));
//     }
    


//count digits
// static int countDigits(int n){
//     int count=0;
//     while(n>0){
//         int l=n%10;
//         count++;
//         n=n/10;
//     }
//     return count;
// } 
// public static void main(String[] args) {
//     System.out.println(countDigits(45892));
// }
    

//Array Sum
// static int arraySum(int[] arr){
//     int sum=0;
//     for(int i=0;i<arr.length;i++){
//         sum=sum+arr[i];

//     }
//     return sum;
// }
// public static void main(String[] args) {
//     System.out.println(arraySum(new int[]{10,20,30,40,50}));
// }


//second largest
// static int SecondLargest(int[] arr){
//     int largest=arr[0];
//     int secondLargest=arr[1];
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]>largest){
//             secondLargest=largest;
//             largest=arr[i];
//         }
//         else if(arr[i]>secondLargest && arr[i]!=largest){
//             secondLargest=arr[i];
//         }

//     }
//     return secondLargest;
// }
// public static void main(String[] args) {
//     System.out.println(SecondLargest(new int[]{10,25,7,40,30}));
// }


//count words
// static int countWords(String sentence){
//     if(sentence==null || sentence.isEmpty()){
//         return 0;
//     }
//     String[] words=sentence.split(" ");
//     return words.length;
// }
// public static void main(String[] args) {
//     System.out.println(countWords("Iam learning Java"));
// }


//remove spaces 
// static String removeSpaces(String sentence){
//     if(sentence==null){
//         return "";
//     }
//     return sentence.replace(" ", "");
    
// }
// public static void main(String[] args) {
//     System.out.println(removeSpaces("Iam learning Java"));
// }


 //count vowels of each
    static void vowels(String S){
        String lower=S.toLowerCase();
 
        int acount=0,ecount=0,icount=0,ocount=0,ucount=0;
        for(int i=0;i<lower.length();i++){
             char ch=lower.charAt(i);
              if (ch == 'a') {
                acount++;
            } else if (ch == 'e') {
                ecount++;
            } else if (ch == 'i') {
                icount++;
            } else if (ch == 'o') {
                ocount++;
            } else if (ch == 'u') {
                ucount++;
            }
        }
        
        System.out.println("a = " + acount);
        System.out.println("e = " + ecount);
        System.out.println("i = " + icount);
        System.out.println("o = " + ocount);
        System.out.println("u = " + ucount);
    }
      public static void main(String[] args) {
        vowels("Java is beautiful");
    }

}

