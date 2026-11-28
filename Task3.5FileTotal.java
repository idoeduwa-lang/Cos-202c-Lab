//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 3
//Task 3.5: File totals. Create scores.txt with ten integers. Write a program that reads them and prints the sum, the largest value and the average.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTotals {
    public static void main(String[] args) {
        // Your scores - same as what should be in scores.txt
        int[] scores = {78, 25, 95, 67, 89, 45, 76, 90, 99};

        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int count = scores.length;

        for (int score : scores) {
            sum += score;
            if (score > largest) {
                largest = score;
            }
        }

        double average = (double) sum / count;

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Largest: " + largest);
        System.out.println("Average: " + String.format("%.2f", average));
    }
}