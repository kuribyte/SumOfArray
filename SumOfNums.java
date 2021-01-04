// Title: Sum Of Array
// Description: A program that calculates the sum of user entered numbers placed into an array of length 4.
// Date: 01/04/21
// Created By: Kuri

import java.util.Scanner;

public class SumOfNums {

    // Read the array and get sum of the numbers
    public int readNumbers(int[] arr) {
        int max_value = 0;
        for (int value = 0; value < arr.length; value++) {
            max_value += arr[value];

        }

        return max_value;
    }

    // Set numbers from user input to become array numbers
    public int[] writeNumbers(int[] arr) {
        System.out.println("Please enter four numbers: ");
        Scanner userInput = new Scanner(System.in);

        // Input numbers into array
        for (int value = 0; value < arr.length; value++){
            int input = userInput.nextInt();
            arr[value] = input;

        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = new int[4];
        RightTriangle content = new RightTriangle();
        content.writeNumbers(arr);
        System.out.println("The sum of the numbers in the array is " + content.readNumbers(arr));
    }

}
