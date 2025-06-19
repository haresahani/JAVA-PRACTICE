package array;

public class Array {
    //largest element
    public static int largestEle(int[] arr) {
        int large = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > large) {
               large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
//        int[] arr = {1, 2, 12, 4, 5, 67};
//        System.out.println(largestEle(arr));

        //Syntax of array
        //declare-> int[] a; -> can't declare size in declartion
        //create-> a = new Datatype[size]
        //initialization -> int[] arr = {2, 4, 5,};
        // in array you can initialize same type of datatype value - > arr[] a = {3, 5, "hare", false, 5.5} X, int[] arr = {3, 4, 5, 6}


        //int[] ros; // declaration of array. ros is getting defined in the stack
        //ros = new int[5]; -> initialization: actually here object is beging created in the memory(heap)
        //dataType[] variable_Name = new dataType[sixe]
        /*int[] arr1 = new int[5]; //create new arr1 in heap memory
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        for(int num : arr1) {
            System.out.print(num+", ");
        }
        for(int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }*/

        /*int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(arr1[4]);
        try {
            for(int i=0; i<=arr1.length; i++) {
                System.out.println(arr1[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array index");
        } catch(Exception e) {
            System.out.println("GEneral exception");
        }*/

       /* String[] arr1 = {"Hare", "Krishna", " Kumar", " Sahani"};
        System.out.println(arr1[0]);

        for(String name : arr1) {
            System.out.print(name);
        }
*/   /*int j=0;

        int[] arr1 = {1, 2, 12, 4, 5,67};
        int[] arr2=new int[arr1.length];
        for(int i =arr1.length-1; i>=0; i--) {
         arr2[j]=arr1[i];
           j++;

        }
        System.out.println(Arrays.toString(arr1));
        System.out.print(Arrays.toString(arr2));*/

        /*int[] arr = {1, 2, 12, 4, 5, 67};
        int largestEle = arr[0];
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > largestEle){
                largestEle = arr[i];
            }

        }
        System.out.println(largestEle);*/

        /*int[] arr = {1, 2, 12, 4, 5, 67};
        int smallestEle = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < smallestEle) {
                smallestEle = arr[i];
            }
        }
        System.out.println(smallestEle);*/

        /*int[] arr = {1, 2, 12, 4, 5, 67};
        int target = 14;
        for(int i=0; i< arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]+arr[j] == target) {
                    System.out.print(target +" first number"+arr[i]+" second number "+arr[j] +"index of first number "+i  +"sejfkhfjkghjk  "   +  (j+1));

                }
            }
        }*/

    }
}
