package pattern;

public class Patterns {
    public static void starPattern(int n) {
        for(int i = 0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //print INVERTED-STAR pattern
    public static void invertedStar(int n) {
        //lines
        for(int i=0; i<n; i++) {
            for(int j=n; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //print HALF-PYRAMID pattern
    public static void halfPyramid(int n) {

        for(int i=0; i<3; i++) {
            int num = 1;
            for(int j=0; j<=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    //print Character pattern
    public static void character(int n) {
        char ch = 'A';
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    //Hollow Rectangle pattern
    public static void hollowRectangle(int n) {
        int row = 4;
        int col = 5;
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=col; j++) {
                if(j == 1 ||i == 1 || col == j || row == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //inverted & rotated half-pyramid pattern
    public static void invRotHalfPyra(int n) {
        for(int i=1; i<=n; i++) {
            //spaces - decreasing
            for(int j=i; j<=n; j++) {
                System.out.print("  ");
            }

            //stars - increasing
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //inverted half-pyramid with numbers pattern
    public static void halfPyramidNums(int n) {
        for(int i=1; i<=n; i++) {
            int num = 1;
            for(int j=i; j<=n; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    //FLOYD'S Triangle pattern
    public static void floydTriangle(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    //0-1 triangle pattern
    public static void zeroOne(int n) {

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

    //Butterfly - pattern
    public static void butterFly(int n) {
        //1st half
        for(int i=1; i<=n; i++) {
            //1-stars
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            //1-spaces
            for(int j=i; j<n; j++ ) {
                System.out.print("  ");
            }

            //2-spaces
            for(int j=i; j<n; j++ ) {
                System.out.print("  ");
            }

            //2-stars
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd half
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

    //solid Rhombus pattern
    public static void rhombus(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=i; j<n; j++) {
                System.out.print(" ");
            }

            //Stars
            for(int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //hollow rhombus pattern
    public static void hollowRhombus(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=i; j<n; j++) {
                System.out.print("  ");
            }
            //Hollow rhombus
            for(int j=1; j<=n; j++) {
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    //Diamond pattern
    public static void diamond(int n) {
        for(int i=1; i<=n; i++) {
            // 1st-half
            //spaces
            for(int j=i; j<n; j++) {
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
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<i; j++) {
                System.out.print("  ");
            }
            //stars
            for(int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            //2-stars
            for(int j=i; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    //Number Pyramid pattern
    public static void numPyramid(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=i; j<n; j++) {
                System.out.print(" ");
            }
            //number
            for(int j=1; j<=i; j++) {
                System.out.print(num+" ");

            }
            num++;
            System.out.println();
        }
    }

    //palidromic pattern with numbers patter
    public static void palindromic(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=i; j<n; j++) {
                System.out.print("  ");
            }
            //num
            int num = 1;
            //left nums
            for(int j=i; j>1; j--) {
                System.out.print(j+" ");
            }
            //right nums
            for(int j=0; j<i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
//        starPattern(n);
//        invertedStar(n);
//        halfPyramid(n);
//        character(n);
//        hollowRectangle(n);
//        invRotHalfPyra(n);
//        halfPyramidNums(n);
//floydTriangle(n);
//butterFly(n);
//        rhombus(n);
//diamond(n);

//        numPyramid(n);
//palindromic(n);
//        zeroOne(n);
//hollowRhombus(n);
        palindromic(n);


















    }
}
