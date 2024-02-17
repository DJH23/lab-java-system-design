import java.util.Map;
public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John", 90);
        Student student2 = new Student("Jane", 80);
        Student student3 = new Student("Pedro", 70);
        Student student4 = new Student("Manu", 60);

        Student.increaseGrades(Student.students);
        for (Map.Entry<String, Student> entry : Student.students.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getGrade());
        }
    }
}
