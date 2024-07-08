package com.company;

public class soal2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            boolean status = false;
            if (i % 3 == 0){
                System.out.print("Fizz");
                status = true;
            }

            if (i % 5 == 0) {
                System.out.print("Buzz");
                status = true;
            }

            if (!status) {
                System.out.print(i);
            }

            if (i < 100) {
                System.out.print(", ");
            }
        }
    }
}
