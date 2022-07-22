package task3;

public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println("Instructor eklendi : " + instructor.getFirstName() + " " + instructor.getLastName()
				+ " Salary : " + instructor.getSalary());
	}

	public void delete(Instructor instructor) {
		System.out.println("Instructor silindi : " + instructor.getFirstName() + " " + instructor.getLastName()
				+ instructor.getLastName() + " Salary : " + instructor.getSalary());
	}

	public void update(Instructor instructor) {
		System.out.println("Instructor güncellendi : " + instructor.getFirstName() + " " + instructor.getLastName()
				+ instructor.getLastName() + " Salary : " + instructor.getSalary());
	}

	public void addMultiple(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			add(instructor);
		}
	}

	public void deleteMultiple(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			delete(instructor);
		}
	}

	public void updateMultiple(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			update(instructor);
		}
	}
}
