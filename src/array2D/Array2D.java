package array2D;

import java.util.Scanner;

public class Array2D {
    public static boolean findKey(int[][] matrix, int key) {
        for(int row=0; row < matrix.length; row++) {
            for(int col=0; col < matrix[0].length; col++) {
                if(matrix[row][col] == key) {
                    System.out.println("Found at Index " + row + ", " + col);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        //create 2d array - Input and output
//        int[][] matrix = new int[3][3];
        /* int[][] arr = { {1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9} }; */
//        Scanner sc = new Scanner(System.in);
//        for(int row=0; row<matrix.length; row++) {
//            for(int col=0; col<matrix[0].length; col++) {
//                matrix[row][col] = sc.nextInt();
//            }
//        }
//
//        //output
//        for(int row=0; row < matrix.length; row++) {
//            for(int col=0; col<matrix[0].length; col++) {
//                System.out.print(matrix[row][col] + " ");
//            }
//            System.out.println();
//        }


//        int[][] arr = new int[3][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//        arr[2][0] = 7;
//        arr[2][1] = 8;
//        arr[2][2] = 9;
//
//        for(int row=0; row<arr.length; row++) {
//            for(int col=0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }


//        int[][] arr = {{4, 7, 8}, {8, 8, 7}};

//        int count = 0;
//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr[i].length; j++) {
//                if(arr[i][j] == 7) {
//                    count++;
//                    System.out.print(arr[i][j]+", ");
//                }
//            }
//        }
//        System.out.println(" = "+count);

        int[][] nums = {{1, 4, 9},
                        {11, 4, 3},  //18
                        {2, 2, 3}};
        int sum = 0;
       for(int i=0; i<nums[1].length; i++) {
           sum += nums[1][i];
       }
       System.out.println(sum);

    }
}
