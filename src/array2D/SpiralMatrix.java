package array2D;
import java.util.Scanner;

public class SpiralMatrix {
    public static void spiral(int[][] matrix) {
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix.length-1;

        while(rowStart <= rowEnd && colStart <= colEnd) {
            //Traverse from left to right
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(matrix[rowStart][col]+" ");
            }
            rowStart++;

            //Traverse from top to bottom
            for(int row= rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd]+" ");
            }
            colEnd--;

            if(rowStart <= rowEnd) {
                //Traverse from right to left
                for(int col=colEnd; col>=colStart; col--) {
                    System.out.print(matrix[rowEnd][col]+" ");
                }
                rowEnd--;
            }

            if(colStart <= colEnd) {
                //Traverse from bottom to top
                for(int row=rowEnd; row>=rowStart; row--) {
                    System.out.print(matrix[row][colStart]+" ");
                }
                colStart++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                             {1, 2, 3},
                             {4, 5, 6},
                             {7, 8, 9}
                         };
        spiral(matrix);
    }
}
