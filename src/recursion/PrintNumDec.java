package recursion;

public class PrintNumDec {
    public static void printN(int n) {
        //base case
        if(n == 1) {
            System.out.print(n);
            return;
        }

        System.out.print(n+" ");
        printN(n-1);
    }
}
