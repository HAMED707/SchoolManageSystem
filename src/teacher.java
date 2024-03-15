
public class teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;

    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;

    }

    public void SetSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        school.setTotalSpentOnTeacher(salary);
    }

    @Override
    public String toString() {
        return " teacher name is " + name +
                " taken salary $  " + salaryEarned;
    }

}