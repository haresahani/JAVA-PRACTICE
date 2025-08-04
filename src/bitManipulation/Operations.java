package bitManipulation;

public class Operations {
    public static int ithBit(int num, int i) {
        int bitMask = num<<i;
        if((num & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(ithBit(5, 2));
    }
}
