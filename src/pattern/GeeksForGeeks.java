package pattern;
import java.util.Scanner;

import static java.lang.System.out;

public class GeeksForGeeks {
    public static void hollowHalfNum(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i == 1 || j == 1 || j == i || i == n) {
                    out.print(j+" ");
                } else {
                    out.print("  ");
                }
            }
            out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter Number between 4 to 10: ");
       int n = sc.nextInt();
       hollowHalfNum(n);
    }
}
