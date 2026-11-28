//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 6
//Task 6.3: Validation. Make the setters reject negative values and print a message. Test with invalid data.


public class TestValidation {
    public static void main(String[] args) {
        Student s1 = new Student("Edi", 115, 85);
        System.out.println(s1);

        s1.setScore(-20);
        s1.setId(-10);

        System.out.println(s1);

        s1.setScore(115);
        System.out.println(s1);
    }
}

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

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        if (id < 0) {
            System.out.println("Error: ID cannot be negative!");
        } else {
            this.id = id;
        }
    }

    public void setScore(double score) {
        if (score < 0) {
            System.out.println("Error: Score cannot be negative!");
        } else {
            this.score = score;
        }
    }

    public String toString() {
        return "Student [Name: " + name + ", ID: " + id + ", Score: " + score + "]";
    }
}