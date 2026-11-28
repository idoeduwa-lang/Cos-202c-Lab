//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 6
//Task 6.2: Student. Implement the Student class of section 6.5 with a toString. Create five students and print them.


public class Student {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return "Student [Name: " + name + ", ID: " + id + ", Score: " + score + "]";
    }
}
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Edi", 124, 85);
        Student s2 = new Student("Bala", 105, 62);
        Student s3 = new Student("Praise", 117, 90);
        Student s4 = new Student("Kenny", 209, 65);
        Student s5 = new Student("Ediwa", 150, 79);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}