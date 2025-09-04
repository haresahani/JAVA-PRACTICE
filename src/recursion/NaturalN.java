package recursion;

public class NaturalN {
    public static int naturalN(int n) {
        if(n == 1) {
            return 1;
        }
        int sumOf = n + naturalN(n-1);
        return sumOf;
    }
}
