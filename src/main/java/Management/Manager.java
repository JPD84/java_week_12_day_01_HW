package Management;
import Staff.Employee;

public class Manager extends Employee {
private String deptName;

    public Manager(String name, String NInumber, double salary) {
        super(name, NInumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}


