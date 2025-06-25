package array2D;

public class SearchInSortedMatrix {
    public static boolean searchInSorted(int[][] matrix, int key) {
        /* Brute force approach-
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println(i + ", " + j);
                    return true;
                }
            }
        }
        return false;
        */


        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println("key found at index: " + row + ", " + col);
                return true;
            } else if(key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;  //O(n+m)
    }
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 33;
        System.out.println(searchInSorted(matrix, key));
    }
}
