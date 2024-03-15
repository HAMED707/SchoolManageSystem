
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        teacher Max = new teacher(1, "Max", 1000);
        teacher Ali = new teacher(2, "Ali", 1000);
        teacher May = new teacher(3, "May", 1000);
        List<teacher> teacherList = new ArrayList<>();
        teacherList.add(May);
        teacherList.add(Ali);
        teacherList.add(Max);

        student Laila = new student(1, 3, "Laila");
        student Moaz = new student(1, 4, "Moaz");
        student Shahd = new student(1, 6, "Shahd");
        List<student> studentList = new ArrayList<>();
        studentList.add(Shahd);
        studentList.add(Laila);
        studentList.add(Moaz);

        school EELU = new school(teacherList, studentList);
        System.out.println("TOTAL MONEY EARNED $" + EELU.getTotalEarned());
        System.out.println("TOTAL MONEY SPEND $" + EELU.getTotalSpent());

        Laila.setFeasPaid(100);
        System.out.println("TOTAL MONEY EARNED $" + EELU.getTotalEarned());

        System.out.println("EELU Pay salary");

        Max.receiveSalary(Max.getSalary());
        System.out.println(Max.getName() + " received a salary " + Max.getSalary() +
                " now EELU has earned " + EELU.getTotalEarned());

        System.out.println(Max);
    }

}
