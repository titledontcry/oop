package lab5_lab;

public class CommissionPay extends Employees {
    private double grossSales;
    private double commissionRate;

    public CommissionPay(String first, String last, String ssn, double sales, double rate) {
        super(first, last, ssn);
        grossSales = sales;
        commissionRate = rate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("Commission employee: %s\n%s\ngross sales: $%.2f; commission rate: %.2f",
                super.toString(), grossSales, commissionRate);
    }
}
