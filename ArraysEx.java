import java.util.Arrays;

public class ArraysEx {
    //count
//     static int countWords(String sentence){
//     if(sentence==null || sentence.isEmpty()){
//         return 0;
//     }
//      String[] words = sentence.trim().split("\\s+");
//         int wordCount = words.length;
//         return wordCount;
        
// }
// public static void main(String[] args) {
//     System.out.println(countWords("Iam  learning  Java  "));
// }




// remove spaces
//     static String removeSpaces(String sentence){
//     if(sentence==null || sentence.isEmpty()){
//         return "";
//     }
//      String words = sentence.trim().replaceAll("\\s+","");
        
//         return words;
        
// }
// public static void main(String[] args) {
//     System.out.println(removeSpaces("Iam  learning  Java  "));
// }



//remove duplicates
// static void duplicates(int[] arr){
//         int n=arr.length;
//         boolean[] isDuplicates=new boolean[n];
//         Arrays.fill(isDuplicates,false);
//         int uniqueCount=0;
//         for(int i=0;i<n;i++){
//             if(isDuplicates[i]==true){
//                 continue;
//             }
//             uniqueCount++;
 
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     isDuplicates[j]=true;
 
//                 }
 
//             }
//         }
//             int[] result=new int[uniqueCount];
//             int index=0;
//             for(int i=0;i<n;i++){
//                 if(!isDuplicates[i]){
//                     result [index++]=arr[i];
//                 }
//             }
 
//        System.out.print(Arrays.toString(result));
//         }

 
//     public static void main(String[] args) {
//         int[] arr={2,3,2,4,3,2};
//         duplicates(arr);
//     }


//first non reapeating
//     static int nonRepeating(String s){
//         for(int i=0;i<s.length();i++){
//             char current=s.charAt(i);
//         int count=0;
//                 for(int j=0;j<s.length();j++){
//                     if(current==s.charAt(j)){
//                         count++;
//                     }
//                 }
//                 if(count==1){
//                     return i;
//             }
//         }
//         return -1;
 
//     }


// public static void main(String[] args) {
//   int index = nonRepeating("swiss");
//         System.out.println("First non-repeating index: " + index);
// }




//move negative beggining then positive
static void moveNegatives(int[] arr) {
        int left= 0;
 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;

                left++;
            }
        }
 
  System.out.println(Arrays.toString(arr));
 
    }
 
    public static void main(String[] args) {
 
        moveNegatives(new int[]{-5, 90, 30, -10, 40, 50});
    }

}