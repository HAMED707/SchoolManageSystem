
import java.util.List;

public class school {

    private List<teacher> Teachers;
    private List<student> Student;
    private static int totalEarned;
    private static int totalSpent;

    public school(List<teacher> teachers, List<student> students) {
        this.Teachers = teachers;
        this.Student = students;
        totalEarned = 10500;
        totalSpent = 500;
    }

    public List<teacher> getTeachers() {
        return Teachers;
    }

    public void addTeachers(teacher teachers) {
        Teachers.add(teachers);
    }

    public List<student> getStudent() {
        return Student;
    }

    public void addStudent(student students) {
        Student.add(students);
    }

    public int getTotalEarned() {
        return totalEarned;
    }

    public static void setTotalEarned(int Earned) {
        totalEarned += Earned;

    }

    public int getTotalSpent() {
        return totalSpent;
    }

    public static void setTotalSpentOnTeacher(int Spent) {
        totalEarned -= Spent;

    }
}
