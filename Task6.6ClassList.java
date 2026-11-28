//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 6
//Task 6.6: Class list. Store ten students in an array. Print the student with the highest score and the average score of the class.

class Student {
    private String name;
    private int id;
    private double score;

    public Student(String name, int id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public String toString() {
        return "Student [Name: " + name + ", ID: " + id + ", Score: " + score + "]";
    }
}

public class ClassList {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Idi", 115, 75);
        students[1] = new Student("Bala", 132, 72);
        students[2] = new Student("Praise", 103, 90);
        students[3] = new Student("Kenny", 127, 65);
        students[4] = new Student("Abbas", 105, 78);
        students[5] = new Student("Tonny", 124, 98);
        students[6] = new Student("Naomi", 107, 95);
        students[7] = new Student("Faith", 118, 60);
        students[8] = new Student("Ngozi", 132, 82);
        students[9] = new Student("Ediwa", 120, 75);

        Student top = students[0];
        double sum = 0;

        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
            if (students[i].getScore() > top.getScore()) {
                top = students[i];
            }
        }

        double average = sum / students.length;

        System.out.println("Highest score: " + top);
        System.out.println("Class average: " + average);
    }
}