package bitManipulation;

public class ClearLastIthBit {
    public static int updateLastithBit(int n, int i) {
        int biMask = ~((1<<i)-1); //(~0)<<i
        return n & biMask;
    }
    public static void main(String[] args) {
        System.out.println(updateLastithBit(15, 2));
    }

}
