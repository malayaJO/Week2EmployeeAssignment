public class Janitor extends Employee{
    public int getHours() {
        return 2 * super.getHours();
    }

    public double getSalary() {
        return super.getSalary() - 10000.0;
    }

    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }

    public String clean() {
        return "Workin' for the man.";
    }
}
