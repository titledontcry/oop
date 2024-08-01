package lab5_lab;

public class HourlySalary extends Employees {
    private double wage; // ค่าแรงต่อชั่วโมง
    private double hours; // ชั่วโมงที่ทำงาน

    public HourlySalary(String first, String last, String ssn, double wage, double hours) {
        super(first, last, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return String.format("Hourly employee: %s\n%s\nhourly pay: $%.2f; hours worked: %.2f",
                super.toString(), wage, hours);
    }
}
