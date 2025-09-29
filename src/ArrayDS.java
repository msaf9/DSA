
import java.util.Arrays;
import java.util.Scanner;

class ArrayDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize;
        System.out.print("Provide array size: ");
        arraySize = sc.nextInt();

        int integerArray[] = new int[arraySize];
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print("Enter your number " + i + " element: ");
            integerArray[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(integerArray));
        sc.close();
    }

}