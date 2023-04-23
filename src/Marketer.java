public class Marketer extends Employee{
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }

    public String advertise() {
        return "Act now, while supplies last!";
    }
}
