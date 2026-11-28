//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB  8 
// Task 8.5: Binary search. Sort an array and search it with binary search.  Print the number of comparisons made.


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearchWithCount(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int comparisons = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            comparisons++;

            if (arr[mid] == target) {
                System.out.println("Target " + target + " found at index " + mid + ".");
                return comparisons;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Target " + target + " not found.");
        return comparisons;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {75, 42, 89, 27, 64, 56, 91, 38, 60};

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();

        int comparisons = binarySearchWithCount(numbers, target);
        System.out.println("Total comparisons made: " + comparisons);

        scanner.close();
    }
}
