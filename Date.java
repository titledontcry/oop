package lab1_practice;

public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }
    
    public int getYear() {
        return year + 543;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
}
