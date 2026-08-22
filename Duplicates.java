import java.util.Arrays;
public class Duplicates {
    // frequency count of numbers of each
    // static void frequency(int[] arr){
    //     int n=arr.length;
    //     boolean[] visited=new boolean[n];
    //     Arrays.fill(visited,false);
    //     for(int i=0;i<n;i++){
    //         if(visited[i]==true){
    //             continue;
    //         }

    //         int count=1;
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]==arr[j]){
    //                 visited[j]=true;
    //                 count++;
    //             }
                
    //         }
    //         System.out.println(arr[i]+" "+count+" "+"times");

    //     }

    // }
    // public static void main(String[] args) {
    //     int[] arr={2,3,2,4,3,2};
    //     frequency(arr);
    // }


    //Remove Duplicates
    //  static void duplicates(int[] arr){
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
    //         int[] result=new int[uniqueCount];
    //         int index=0;
    //         for(int i=0;i<n;i++){
    //             if(!isDuplicates[i]){
    //                 result [index++]=arr[i];
    //             }
    //         }
  
    //    System.out.print(Arrays.toString(result));
    //     }

    
    // public static void main(String[] args) {
    //     int[] arr={2,3,2,4,3,2};
    //     duplicates(arr);
    // }



    //second largest
//     static int SecondLargest(int[] arr){
//         if (arr == null || arr.length < 2) {
//             return -1;
//         }
//     int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]>largest){
//             secondLargest=largest;
//             largest=arr[i];
//         }
//         else if(arr[i]>secondLargest && arr[i]!=largest){
//             secondLargest=arr[i];
//         }

//     }
//     return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    
// }
// public static void main(String[] args) {
//     System.out.println(SecondLargest(new int[]{10,25,7,40,30}));
//      System.out.println(SecondLargest(new int[]{40,40,30,20}));
//       System.out.println(SecondLargest(new int[]{10,40,30,40,20}));
//            System.out.println(SecondLargest(new int[]{40,40}));
// }




 //frequency count of numbers of each strings
    // static void frequency(String str){
    //     char[] arr=str.toCharArray();
    //     int n=arr.length;
    //     boolean[] visited=new boolean[n];
    //     Arrays.fill(visited,false);
    //     for(int i=0;i<n;i++){
    //         if(visited[i]==true){
    //             continue;
    //         }

    //         int count=1;
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]==arr[j]){
    //                 visited[j]=true;
    //                 count++;
    //             }
                
    //         }
    //         System.out.println(arr[i]+" "+count+" "+"times");

    //     }

    // }
    // public static void main(String[] args) {
    //     frequency("programming");
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


    //first Duplicate to print
    //  static void duplicates(int[] arr){
    //     int n=arr.length;
    //        for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]==arr[j]){
    //                 System.out.println("First Duplicate: "+arr[i]);
    //                 return;
                    
    //             }
                
    //         }
    //     }
        
    //    System.out.println("No duplicate found");
    //     } 
    // public static void main(String[] args) {
    //     int[] arr={3,2,4,3,2};
    //     duplicates(arr);
    // }


   // non reptiative Remove Duplicates
       static void printFirstNonRepeated(String str) {
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            char current = str.charAt(i);
            boolean foundDuplicate = false;
            

            for (int j = 0; j < n; j++) {
                if (i != j && current == str.charAt(j)) {
                    foundDuplicate = true;
                    break; 
                }
            }

            if (!foundDuplicate) {
                System.out.println("First non-repeated character: " + current);
                return; 
            }
        }
        
        System.out.println("No non-repeated character found.");
    }

    public static void main(String[] args) {
        printFirstNonRepeated("swiss"); 
    }


    
}
