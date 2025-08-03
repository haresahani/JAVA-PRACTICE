package bitManipulation;

public class BasicOfBitManipulation {
    public static void main(String[] args) {
        int and = 11 & 13;
        System.out.println("Binary &:> 11 & 13 = " + and); //binary &

        int or = 11 | 13;
        System.out.println("Binary OR:> 11 | 13 = " + or); //binary |

        int xor = 11 ^ 13;
        System.out.println("Binary XOR:> 11 ^ 13 = " + xor);

        int not = ~5;
        System.out.println("Binary ~:> ~5 = " + not);
    }
}
