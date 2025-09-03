package recursion;

public class Main {
    public static void main(String[] args) {
        int n = 5;
//        printNumDec p1 = new printNumDec();
//        System.out.println("Decreasing Order Number: ");
//        p1.printN(n);

//        PrintNumInc p2 = new PrintNumInc();
//        System.out.println("Increasing Order Number: ");
//        p2.printN(n);

        Fact f = new Fact();
        System.out.println(f.factOf(n));
    }
}
