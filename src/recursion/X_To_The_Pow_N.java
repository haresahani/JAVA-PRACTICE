package recursion;

public class X_To_The_Pow_N {
    public static int calXN(int x, int n) {
        if(n == 0) return 1;
        return x * calXN(x, n-1);
    }
}
