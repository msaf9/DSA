import java.util.Arrays;
import java.util.Scanner;

public class ArrayDSProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize;
        System.out.print("Enter your array size: ");
        arraySize = sc.nextInt();

        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter your element number " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element != largest && element > secondLargest) {
                secondLargest = element;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found!");
        } else {
            System.out.println("Second largest element in the array is " + secondLargest);
        }

        sc.close();
    }

}
