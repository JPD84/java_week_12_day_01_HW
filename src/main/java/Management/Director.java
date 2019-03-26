package Management;

public class Director extends Manager {

    int budget;


    public Director(String name, String NInumber, double salary, int budget) {
        super(name, NInumber, salary);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void getPayBonus(){
        double increaseBy = (this.salary / 100) * 2;
        this.salary = salary + increaseBy;

    }
}
