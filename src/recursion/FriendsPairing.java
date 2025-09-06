package recursion;

public class FriendsPairing {
    public static int friendsPair(int n) {
        if(n == 1 || n == 2) return n;
        return friendsPair(n-1) + (n-1) * friendsPair(n-2);
    }
}
