package data;

public class Grade {
	
	public String name;
	public double grade1, grade2, grade3;
	public double finalGrade;
	public double approval = (30 + 35 + 35) * 0.6;
	
	public String score() {
		this.finalGrade = grade1 + grade2 + grade3;
		return "FINAL GRADE = " + String.format("%.2f", finalGrade);
	}
	
	public double missing() {
		return approval - finalGrade;
	}
}
