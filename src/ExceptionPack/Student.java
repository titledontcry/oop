package ExceptionPack;
@SuppressWarnings("serial")
class DigitException extends Exception {
	public DigitException() {
		super("DigitException :(digit is not allowed in name) can not display.");
	}
}
@SuppressWarnings("serial")
class IncompleteException extends Exception {
	public IncompleteException() {
		super("IncompleteException :(grade I is incomplete) can not display.");
	}
}
@SuppressWarnings("serial")
class SpaceException extends Exception {
	public SpaceException() {
		super("SpaceException :(space is not allowed in name) can not display.");
	}
}
@SuppressWarnings("serial")
class GradeException extends Exception {
	public GradeException() {
		super("GradeException :(grade must be A B C D E F) can not display.");
	}
}

public class Student {
	private String studentName;
	private String grade;
	private double credit;
	public Student(String studentName, String grade) {
		this.grade = grade;
		this.studentName = studentName;
		this.credit = 4.0;
	}
	public void show() throws Exception {
		double sumScore = 0;
		try {
			if(this.studentName.matches(".*\\d.*")) {
				throw new DigitException();
			}else if(this.studentName.matches(".*\\s+.*")) {
				throw new SpaceException();
			}
			for(int i=0;i<this.grade.length();i++) {
				if(this.grade.charAt(i) != 'A' && this.grade.charAt(i) != 'B' && this.grade.charAt(i) != 'C' && this.grade.charAt(i) != 'D' && this.grade.charAt(i) != 'F' && this.grade.charAt(i) != 'I') {
					throw new GradeException();
				}else if(this.grade.charAt(i) == 'I') {
					throw new IncompleteException(); 
				}else {
					sumScore += Math.max(4.0+(65.0-this.grade.charAt(i)), 0.0)*this.credit;
				}
			}
			sumScore/=(this.credit*this.grade.length());
			System.out.println(this.studentName+" registered "+this.grade.length()+" subject and got GPA is "+sumScore);
		}catch(Exception e) {
			System.err.println(e.toString());
		}
	}
}
