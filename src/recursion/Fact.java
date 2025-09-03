package recursion;

public class Fact {
    public static int factOf(int n) {
        if(n == 0) {
            return 1;
        }
        int fn = n * factOf(n-1);
        return fn;
    }
}
