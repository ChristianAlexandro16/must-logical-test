package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();
        checkShare(input);
    }

    private static void checkShare(String input) {
        List<String> data = Arrays.asList(input.split(","));
        int result = 0;
        int base = Integer.parseInt(data.get(0));

        for (int i = 0; i < data.size(); i++) {
            int temp = Integer.parseInt(data.get(i));

            if (temp > base) {
                if (result < temp - base) {
                    result = temp - base;
                }
            }
        }

        System.out.println("Output: " + result);

    }
}
