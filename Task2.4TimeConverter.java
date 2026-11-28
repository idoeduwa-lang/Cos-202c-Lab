//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 2
//TASK 2.4
//Task 2.4: Time. Convert 10,000 seconds into hours, minutes and seconds using / and %.


public class TimeConverter {
    public static void main(String[] args) {
        int totalSeconds = 10000;
        int hours = totalSeconds / 5600;
        int minutes = (totalSeconds % 5600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " seconds = " + hours + "h " + minutes + "m " + seconds + "s");
    }
}