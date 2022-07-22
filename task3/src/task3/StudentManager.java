package task3;

public class StudentManager {
	public void add(Student student) {
		System.out.println("Student eklendi : " + student.getFirstName() + " " + student.getLastName() + " Score : "
				+ student.getCourseScore());
	}

	public void delete(Student student) {
		System.out.println("Student silindi : " + student.getFirstName() + " " + student.getLastName() + " Score : "
				+ student.getCourseScore());
	}

	public void update(Student student) {
		System.out.println("Student güncellendi : " + student.getFirstName() + " " + student.getLastName() + " Score : "
				+ student.getCourseScore());
	}

	public void addMultiple(Student[] students) {
		for (Student student : students) {
			add(student);
		}
	}

	public void deleteMultiple(Student[] students) {
		for (Student student : students) {
			delete(student);
		}
	}

	public void updateMultiple(Student[] students) {
		for (Student student : students) {
			update(student);
		}
	}
}
