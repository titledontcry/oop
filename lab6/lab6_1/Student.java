package lab5_lab;

public class Student {
    private String name;
    private int id;
    private float gpa;

    public Student(int id, String name, float gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public Student(int id, float gpa) {
        this(id, "", gpa);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public float getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Student:\nID: %d\nName: %s\nGPA: %.2f", id, name, gpa);
    }
}
