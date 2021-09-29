package staff;

public abstract class Employee {
//    a name, NI number and salary.
    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, Integer salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void raiseSalary(double value) {
        if (value >= 0) {
            this.salary += value;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
