//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 6
//Task 6.5: Counting objects. Add a static counter to Student that counts how many objects have been created. Print it at the end.

class Student {
    private String name;
    private int id;
    private double score;
    private static int count = 0;

    public Student(String name, int id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
        count++;
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

    public static int getCount() {
        return count;
    }

    public String toString() {
        return "Student [Name: " + name + ", ID: " + id + ", Score: " + score + "]";
    }
}

public class TestCount {
    public static void main(String[] args) {
        Student s1 = new Student("Edi", 115, 85);
        Student s2 = new Student("Bala", 110, 72);
        Student s3 = new Student("Ediwa", 125, 90);

        System.out.println("Total students created: " + s1.getCount());
    }
}