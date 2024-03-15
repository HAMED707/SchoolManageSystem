
public class student {
    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feestotal;

    public student(int id, int grade, String name) {
        feespaid = 0;
        feestotal = 3000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setFeasPaid(int fees) {
        feespaid += fees;
        school.setTotalEarned(feespaid);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeespaid() {
        return feespaid;
    }

    public int getFeestotal() {
        return feestotal;
    }
}
