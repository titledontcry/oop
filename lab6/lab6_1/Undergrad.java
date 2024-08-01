package lab5_lab;

public class Undergrad extends Student {
    private String year;

    public Undergrad(int id, String name, float gpa, String year) {
        super(id, name, gpa);
        this.year = year;
    }
    
    public String getYear() {
    	return year;
    }
    public void setYear(String year) {
    	this.year = year;
    }
    @Override
    public String toString() {
    	return String.format("Undergraduate Student:\nID:%d\nName:%s\nGPA:%.2f\nYear:%s",getId(),getName(),getGpa(),year);
    }
}
