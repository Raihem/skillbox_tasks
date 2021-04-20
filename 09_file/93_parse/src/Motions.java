import java.text.SimpleDateFormat;
import java.util.Date;

public class Motions
{
    private String name;
    private String salary;
    private String workStart;

    public Motions(String name, String salary, String workStart)
    {
        this.name = name;
        this.salary = salary;
        this.workStart = workStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

//    public Date getWorkStart() {        return workStart;    }
public String getWorkStart() {        return workStart;    }

    public void setWorkStart(String workStart) {
        this.workStart = workStart;
    }

    public String toString()
    {
        return name + " - " + salary + " - " +
                (new SimpleDateFormat("dd.MM.yyyy")).format(workStart);
    }
}