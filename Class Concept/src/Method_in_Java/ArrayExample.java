package Method_in_Java;

public class ArrayExample {

    // Method that takes an integer array as a parameter
    public static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating an integer array
        int[] numbers = {1, 2, 3, 4, 5};

        // Calling the method and passing the array
        ArrayExample.printArray(numbers);
    }
}
