package pattern;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
public class Striver {
    public static void pattern1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num+" ");
            }
            num++;
            System.out.println();
        }
    }
    public static void pattern5 (int n) {
        for(int i=1; i<=n; i++) {
            for(int j=n; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for(int i=1; i<=n; i++) {
            int num =1;
            for(int j=n; j>=i; j--) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=n; j>i; j--) {
                System.out.print("  ");
            }
            //Stars
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            //2-stars
            for(int j=1; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
public static void pattern8(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<i; j++) {
                System.out.print("  ");
            }
            //stars
            for(int j=n; j>i; j--) {
                System.out.print("* ");
            }
            //2-stars
            for(int j=n; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
}

public static void pattern9(int n) {
        //1st half
        for(int i=1; i<n; i++) {
            //spacces
            for(int j=n; j>i; j--) {
                System.out.print("  ");
            }
            //1-stars
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            //2-stars
            for(int j=1; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd half
    for(int i=1; i<=n; i++) {
        //spaces
        for(int j=1; j<i; j++) {
            System.out.print("  ");
        }
        //1-stars
        for(int j=n; j>=i; j--) {
            System.out.print("* ");
        }
        //2- stars
        for(int j=n; j>i; j--) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
    public static void pattern10(int n) {
        //1st-half
        for(int i=1; i<n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd- half
        for(int i=1; i<=n; i++) {
            for(int j=n; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                int sum = i+j;
                if(sum%2==0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {

        for(int i=1; i<=n; i++) {
            //nums
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            //spaces
            for(int j=n; j>i; j--) {
                System.out.print("  ");
            }
            //2-spaces
            for(int j=i; j<n; j++) {
                System.out.print("  ");
            }
            //2-nums
            for(int j=i; j>=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern13(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {

            for(int j=1; j<=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for(int i=1; i<=n; i++) {
            char ch = 'A';
            for(int j=1; j<=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for(int i=1; i<=n; i++) {
            char ch = 'A';
            for(int j=i; j<=n; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        char ch = 'A';
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=i; j<n; j++) {
                System.out.print(" ");
            }
//            //1-character
            char ch = 'A';
            for(int j=1; j<i; j++) {
                System.out.print(ch);
                ch++;
            }
            //2-character
            for(int j=1; j<=i; j++) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) { // -> not solved
//                E
//                D E
//                C D E
//                B C D E
//                A B C D E
    }


    public static void pattern19(int n) {
        //1st half
        for(int i=1; i<=n; i++) {
            //1-stars
            for(int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            //1-space
            for(int j=1; j<i; j++) {
                System.out.print("  ");
            }
            //2-spacce
            for(int j=1; j<i; j++) {
                System.out.print("  ");
            }
            //2-stars
            for(int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //2nd half
        for(int i=1; i<=n; i++) {
            //1-stars
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            //1-space
            for(int j=i; j<n; j++) {
                System.out.print("  ");
            }
            //2-spacce
            for(int j=i; j<n; j++) {
                System.out.print("  ");
            }
            //2-stars
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n) {
        //1st-half
        for(int i=1; i<n; i++) {
            //1-stars
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            //1-spaces
            for(int j=i; j<n; j++) {
                System.out.print("  ");
            }
            //2-spaces
            for(int j=i; j<n; j++) {
                System.out.print("  ");
            }
            //2-stars
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd-half
        for(int i=1; i<=n; i++) {
            //1-stars
            for(int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            //1-spaces
            for(int j=1; j<i; j++) {
                System.out.print("  ");
            }
            //2-spaces
            for(int j=1; j<i; j++) {
                System.out.print("  ");
            }
            //2-stars
            for(int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern21(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i==1 || j==1 || j == n || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern22(int n) { // NOT SOLVED
        int size = 2 * n -1;
        for(int i = 0; i<size; i++) {
            for(int j=0; j<size; j++) {
                int top = i;
                int left = j;
                int right = (2*n-2) - j;
                int bottom = (2*n-2) -i;
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n-min)+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
        int n = 4;
//        pattern1(n);
//        pattern2(n);
//pattern3(n);
//pattern4(n);
//pattern5(n);
//pattern6(n);
//pattern7(n);
//        pattern8(n);
//pattern9(n);
//pattern10(n);
//        pattern11(n);
//        pattern12(n);
//pattern13(n);
//pattern14(n);
//pattern15(n);

//        pattern16(n);
//        pattern17(n);
//pattern18(n);
//pattern19(n);
//        pattern20(n);
//pattern21(n);
        pattern22(n);
    }
}
