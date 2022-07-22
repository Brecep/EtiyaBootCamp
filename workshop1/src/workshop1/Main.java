package workshop1;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category(1, "Programlama");
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "*****", "abc@gmail.com");
		Instructor instructor2 = new Instructor(2, "Ahmet", "Çetinkaya", "*****", "123@gmail.com");
		Course course1 = new Course(1, "Java", category1, instructor1);
		Course course2 = new Course(2, "C#", category1, instructor2);

		Student student1 = new Student(1, "Recep", "Bayindir", "*****", "recep@gmail.com", course1);
		Student student2 = new Student(2, "Seher", "Yalcin", "*****", "seher@gmail.com", course1);
		Student student3 = new Student(3, "Alperen", "Ozturk", "*****", "alperen@gmail.com", course2);
		Student student4 = new Student(4, "Yeni", "Kullanici", "*****", "alperen@gmail.com", course2);

		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		studentManager.add(student4);

		List<Student> students = studentManager.getAll();

		for (Student student : students) {
			System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " "
					+ student.getPassword() + " " + student.geteMail() + " " + student.getCourse().getName());
		}

		System.out.println("----------------------------------");

		studentManager.delete(student4);// deleted student

		for (Student student : students) {
			System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " "
					+ student.getPassword() + " " + student.geteMail() + " " + student.getCourse().getName());
		}
	}

}
