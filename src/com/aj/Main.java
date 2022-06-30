package com.aj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for n: ");
        int n = input.nextInt();

        System.out.print("Enter a number for r: ");
        int r = input.nextInt();

        System.out.println("Result in Method 1:\n" + Combination1(n, r) + "\nResult in Method 2:\n" + Combination2(n, r));
    }

    //Methods that calculate combination of C(n,r)
    private static int Combination1(int n, int r) {
        if (n == r || r == 0) return 1;
        return Combination1(n - 1, r - 1) + Combination1(n - 1, r);
    }

    private static int Combination2(int n, int r) {
        if (r == 0) return 1;
        return (n * Combination2(n - 1, r - 1)) / r;
    }
}
