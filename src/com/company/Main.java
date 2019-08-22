package com.company;

public class Main {

    public static void main(String a[]) {
        int[] input = new int[100];
        System.out.println("=== Program Insertion Sort ===");
        int[] arr1 = {1, 13, 3, 7, 15, 11, 25, 21};
        int temp;
        for (int i = 1; i <= input; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                    for (arr2) {
                        System.out.print(i);
                        System.out.print(", ");
                    }
                }


            }
        }
    }
}



