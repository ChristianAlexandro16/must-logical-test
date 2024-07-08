package com.company;

public class soal3 {
    public static void main(String[] args) {
        int prev1 = 1, prev2 = 0;

        for (int i = 0; i < 10; i++) {

            if (i > 1) {
                int now = prev1 + prev2;
                System.out.print(now);
                prev2 = prev1;
                prev1 = now;
            } else {
                System.out.print(i);
            }

            System.out.print(", ");
        }
    }
}
