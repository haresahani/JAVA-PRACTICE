package recursion;

public class PrintNumInc {
    public static void printN(int n) {
        if(n == 1) {
            System.out.print(n+" ");
            return;
        }

        printN(n-1);
        System.out.print(n+ " ");
    }
}
