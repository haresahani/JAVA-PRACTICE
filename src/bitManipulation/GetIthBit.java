package bitManipulation;

public class GetIthBit {
    public static int ithBit(int n, int i) {
        if((n&(1<<i)) != 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(ithBit(22, 2));
    }

}
