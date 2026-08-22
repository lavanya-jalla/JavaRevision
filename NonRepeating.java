
public class NonRepeating {

    //Anagram
    // static boolean isAnagram(String a,String b){
    //     char[] s1=a.toLowerCase().toCharArray();
    //     char[] s2=b.toLowerCase().toCharArray();
    //     Arrays.sort(s1);
    //     Arrays.sort(s2);
    //     if(a.length()!=b.length()){
    //         return false;
    //     }
    //     return Arrays.equals(s1, s2);

    // }
    // public static void main(String[] args) {
    //     boolean result=isAnagram("listen", "silent");
    //     System.out.println(result);
    // }


    //remove zeroes
    // static void moveZeroes(int[] arr) {
    //     int index = 0;
        
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] != 0) {
    //             arr[index] = arr[i];
    //             index++;
    //         }
    //     }
      
    //     while (index < arr.length) {
    //         arr[index] = 0;
    //         index++;
    //     }
      
    //     System.out.println(Arrays.toString(arr));
    // }
    
    // public static void main(String[] args) {
       
    //     moveZeroes(new int[]{10, 0, 30, 0, 40, 50});
    // }



    
//    string conatins another

// public static void main(String[] args) {
//     String text="I Love India";
//     String containString="India";
//     boolean result=text.contains(containString);
// System.out.println(result);
// }




//odd digits  sum
    static int oddDigitsSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){

             if(i%2!=0){
                sum=sum+arr[i];

            }
        }
       
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(oddDigitsSum(new int[]{1,4,3,6,7}));
    }


}
