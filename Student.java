import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int grade;
    public static Map<String, Student> students = new HashMap<>();

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        students.put(name, this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static Map<String, Student> increaseGrades(Map<String, Student> students) {
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            Student student = entry.getValue();
            int increaseGrade = (int) Math.round(student.getGrade() * 1.1);
            student.setGrade(increaseGrade);
        }
        return students;
    }
}
