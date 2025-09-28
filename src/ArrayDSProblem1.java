
/**
 * Problem 1: Reverse an Array
    Write a Java program that takes an integer array and reverses it in place (without using an extra array).
        - Example Input: {1, 2, 3, 4, 5}
        - Example Output: {5, 4, 3, 2, 1}
*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDSProblem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize;
        System.out.print("Enter array size: ");
        arraySize = sc.nextInt();

        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter your element number " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Before:: " + Arrays.toString(array));
        int front = 0;
        int back = arraySize - 1;
        int buffer;

        while (front < back) {
            buffer = array[back];
            array[back] = array[front];
            array[front] = buffer;

            front++;
            back--;
        }

        System.out.println("After:: " + Arrays.toString(array));

        sc.close();
    }

}
