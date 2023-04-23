public class HarvardLawyer extends Employee{
    public double getSalary() {
        return super.getSalary() * 0.20 + super.getSalary();
    }

    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }

    public String getVacationForm() {
        return "pinkpinkpinkpink";
    }
}
