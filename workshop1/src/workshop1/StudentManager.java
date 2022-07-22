package workshop1;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	List<Student> students;

	public StudentManager() {
		students = new ArrayList<>();
	}

	public void add(Student student) {
		students.add(student);
	}

	public void delete(Student student) {
		students.remove(student);
		
	}
	
	public List<Student> getAll() {
		return students;
	}
}
