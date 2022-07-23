package task3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog", "engin@aaaa.com", "11111111111", 12500);
		Instructor instructor2 = new Instructor(2, "Recep", "Bayindir", "recep@aaaa.com", "22222222222", 11599);

		Student student1 = new Student(3, "Alperen", "Ozturk", "alperen@aaaa.com", "33333333333", 95);
		Student student2 = new Student(4, "Seher", "Yalcin", "seher@aaaa.com", "44444444444", 99);

		User[] users = { instructor1, instructor2, student1, student2 };

		UserManager userManager = new UserManager();
		userManager.addMultiple(users);

		System.out.println("--------------------------");

		userManager.deleteMultiple(users);
		System.out.println("--------------------------");

		userManager.updateMultiple(users);
		System.out.println("--------------------------");

		Student[] students = { student1, student2 };

		StudentManager studentManager = new StudentManager();
		studentManager.addMultiple(students);
		System.out.println("--------------------------");

		Instructor[] instructors = { instructor1, instructor2 };

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addMultiple(instructors);

		studentManager.getCourseScoreState(student1);
		instructorManager.getSalaryAmount(instructor1);
	}

}
