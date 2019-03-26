package Staff;

public abstract class Employee {

    public String name;
    public String NInumber;
    public double salary;

    public Employee(String name, String NInumber, double salary){
       this.name = name;
       this.NInumber = NInumber;
       this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNInumber() {
        return NInumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNInumber(String NInumber) {
        this.NInumber = NInumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRaiseSalary(Double increase){
        double increaseBy = (this.salary / 100) * increase;
        this.salary = salary + increaseBy;

    }

    public void getPayBonus(){
        double increaseBy = (this.salary / 100) * 1;
        this.salary = salary + increaseBy;

    }


}
