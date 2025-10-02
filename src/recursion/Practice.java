package recursion;



public class Practice {
    public static void findAllOccurrences(int[] arr, int key, int idx) {
        //recursive
        if(idx == arr.length) { //base case
            return;
        }

        if(arr[idx] == key) {
            System.out.print(idx+ " ");
        }

        findAllOccurrences(arr, key, idx+1);

        // iterative
//        for(int i=0; i<arr.length; i++) { // TC: O(n), SC: O(1)
//            if(arr[i] == key) {
//                System.out.print(i+" ");
//            }
//        }
    }



    public static void main(String[] args) {
       int n = 2019;
       String[] word = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
       int idx = 0;

       for(int i=0; i<n; i++) {
           System.out.println(i);
       }
    }
}
