package bitManipulation;

import java.util.Scanner;

public class OddEven {
    public static void oddEven(int nums) {
        if((nums & 1) == 0) {
            System.out.println(nums+ " is Even number");
        } else {
            System.out.println(nums+" is Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();

        oddEven(nums);
    }
}
