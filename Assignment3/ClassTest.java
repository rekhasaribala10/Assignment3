package Assignment3;

public class ClassTest {

	public static void main(String[] args) {

		Student s = new Student("Rekha", 1352855);
		s.getName();
		s.getId();
		System.out.println("Student name is " + s.getName());
		System.out.println("Student ID is " + s.getId());

		Student[] students = new Student[10];
		Course c = new Course("MSIS", students);
		c.getCourseName();
		c.getStudents();
		System.out.println("The course is " + c.getCourseName());

		c.registerStudent(s);

		System.out.println(c.getNumberOfStudents());
		System.out.println(c.getStudents()[0].getId());

	}

}
