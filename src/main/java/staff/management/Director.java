package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String niNumber, Integer salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

}
