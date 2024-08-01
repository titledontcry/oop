package lab5_lab;

public class Graduate extends Student {
    private String thesisTitle;

    public Graduate(int id, String name, float gpa, String thesisTitle) {
        super(id, name, gpa);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public String toString() {
        return String.format("Graduate Student:\nID: %d\nName: %s\nGPA: %.2f\nThesis: %s", getId(), getName(), getGpa(), thesisTitle);
    }
}
