package task3;

public class Student extends User {
	private double courseScore;

	public Student() {
		super();		
	}

	public Student(int id, String firstName, String lastName, String emailAdress, String nationalIdentity,
			double courseScore) {
		super(id, firstName, lastName, emailAdress, nationalIdentity);
		this.courseScore = courseScore;
	}

	public double getCourseScore() {
		return courseScore;
	}

	public void setCourseScore(double courseScore) {
		this.courseScore = courseScore;
	}
	

}
