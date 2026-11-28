//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 3
//Task 3.7 (challenge). Make the file programs robust: if the file does not exist, print a friendly message and exit without a crash.

public class RobustFileTotals {
    public static void main(String[] args) {
        int[] scores = {76, 55, 45, 67, 78, 95, 80, 97, 90, 99};

        boolean fileExists = true;

        if (!fileExists) {
            System.out.println("Sorry, scores.txt was not found.");
            System.out.println("Please create the file and try again.");
            return;
        }

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

        System.out.println("File found! Calculating...");
        System.out.println("Sum: " + sum);
        System.out.println("Largest: " + largest);
        System.out.println("Average: " + String.format("%.2f", average));
    }
}