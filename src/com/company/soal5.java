package com.company;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        countNumber(input);
    }

    private static void countNumber(String input) {
        List<String> data = Arrays.asList(input.split(","));
        int counter = 0;

        for (int i = 0; i < data.size(); i++) {
            boolean status = isNumeric(data.get(i));
            if (status) {
                counter++;
            }
        }

        System.out.println("Output: " + counter);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
