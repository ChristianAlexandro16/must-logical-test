package com.company;

import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = sc.nextLine();
        String output = processText(input);

        System.out.println("Hasil text = " + output);
    }

    private static String processText(String input) {
        String temp = "";
        String result = "";

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i)!=' '){
                temp = temp + input.charAt(i);
            }

            if (input.charAt(i)==' ') {
                String restore = "";
                for (int j = temp.length()-1; j >= 0 ; j--){
                    restore = restore + temp.charAt(j);
                }
                result = result + restore + " ";
                temp = "";
            }

            if (i == input.length()-1){
                String restore = "";
                for (int j = temp.length()-1; j >= 0 ; j--){
                    restore = restore + temp.charAt(j);
                }
                result = result + restore;
            }
        }

        return result;
    }
}
