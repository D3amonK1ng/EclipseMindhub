package school;

public class Class {
	private int grade;
	private char letter;
	
	public Class(int grade, char letter) {
		this.grade = grade;
		this.letter = letter;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public char getLetter() {
		return letter;
	}
	
	@Override
	public String toString() {
		return "" + grade + letter;
	}
}
