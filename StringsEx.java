import java.util.Arrays;

public class StringsEx {
    
//remove duplicates characters
    // static void duplicates(String S){
    //     char[] arr=S.toCharArray();
    //     int n=arr.length;
    //     boolean[] isDuplicates=new boolean[n];
    //     Arrays.fill(isDuplicates,false);
    //     int uniqueCount=0;
    //     for(int i=0;i<n;i++){
    //         if(isDuplicates[i]==true){
    //             continue;
    //         }
    //         uniqueCount++;
 
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]==arr[j]){
    //                 isDuplicates[j]=true;
 
    //             }
 
    //         }
    //     }
    //         char[] result=new char[uniqueCount];
    //         int index=0;
    //         for(int i=0;i<n;i++){
    //             if(!isDuplicates[i]){
    //                 result [index++]=arr[i];
    //             }
    //         }
 
    //    System.out.print(new String(result));
    //     }

 
    // public static void main(String[] args) {
    //     duplicates("Programming");
    // }

    

    //count manually
    // static int count(String S){
    //     if(S==null|| S.trim().isEmpty()){
    //         return 0;
    //     }
    //     String[] words=S.trim().split(" ");
    //     return words.length;
    // }
    // public static void main(String[] args) {
    //     System.out.println(count("I Love India"));
    // }



    //each word reverse in a sentenfe
//     static String count(String S){
//         if(S==null|| S.trim().isEmpty()){
//             return "";
//         }
//         String[] words=S.trim().split("\\s+");
//         String result="";
//         for(int i=0;i<words.length;i++){
//             String word=words[i];
//             String revWord="";
//         for(int j=0;j<word.length();j++){
//             revWord=word.charAt(j)+revWord;
//         }
//        result=result+revWord+" ";


//     }
//     return result.trim();
// }
//     public static void main(String[] args) {
//         System.out.println(count("I Love India"));
//     }


//miising number in an array
// static int missingArray(int[] arr){
//     int sum=0;
   
//     for(int i=0;i<arr.length;i++){
//         sum=sum+arr[i];
//     }
//     int n = arr.length +1 ;
//    int  naturalSum=n*(n+1)/2;
//    int result=naturalSum-sum;
//    return result;

// }
// public static void main(String[] args) {
// System.out.println(missingArray(new int[]{1,2,3,4,5,6,8}));
// }


//arrays equal or not
// static String checkArrays(int[] arr1,int[] arr2){
//     if(arr1.length!=arr2.length){
//         return "Arrays not equal";
//     }
//     Arrays.sort(arr1);
//     Arrays.sort(arr2);
//     for(int i=0;i<arr1.length;i++){
//             if(arr1[i]!=arr2[i]){
//                 return "Arrays not equal";
            
//         }
    
//     }
//         return "Arrays are equal";
    
// }
// public static void main(String[] args) {
//     System.out.println(checkArrays(new int[]{1,2,3}, new int[]{1,2,3}));
//       System.out.println(checkArrays(new int[]{1,2,3}, new int[]{3,2,1}));
// }




//recursion sum of n numbers
// static int sumNumbers(int n){
//     if(n==1){
//         return 1;
//     }
//  return n+sumNumbers (n-1);

// }
// public static void main(String[] args) {
//     System.out.println(sumNumbers(4));
// }



//Find the first repeating character
static char firstNonrepeat(String S){
    
    for(int i=0;i<S.length();i++){
        char current=S.charAt(i);
       
        for(int j=0;j<i;j++){    
    if(current==S.charAt(j)){
        return current;
    }

}
    }
return ' ';
}
public static void main(String[] args) {
    System.out.println(firstNonrepeat("abbace"));//output b
        System.out.println(firstNonrepeat("abab"));//output a
}


//Find the first non repeating character
// static char firstNonrepeat(String S){
    
//     for(int i=0;i<S.length();i++){
//         char current=S.charAt(i);
//         int count=0;
//         for(int j=0;j<S.length();j++){    
//     if(current==S.charAt(j)){
//         count++;
//     }

// }
// if(count==1){
//     return current;
// }
// }
// return ' ';
// }
// public static void main(String[] args) {
//     System.out.println(firstNonrepeat("abbace"));
//         System.out.println(firstNonrepeat("abba"));
// }



//Move positive numbers to the beginning and negative numbers to the end
// static void movePostives(int[] arr) {
//         int left= 0;
 
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > 0) {
//                 int temp=arr[i];
//                 arr[i]=arr[left];
//                 arr[left]=temp;

//                 left++;
//             }
//         }
 
//   System.out.println(Arrays.toString(arr));
 
//     }
 
//     public static void main(String[] args) {
 
//         movePostives(new int[]{-5, 90, 30, -10, 40, 50});
//     }


}
