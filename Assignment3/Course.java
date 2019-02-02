package Assignment3;

public class Course {

	private String courseName;
	private int numberOfStudents;
	private Student[] students;

	public Course(String courseName, Student[] students) {
		this.courseName = courseName;
		this.students = students;

	}

	public String getCourseName() {
		return courseName;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Student[] getStudents() {
		return students;
	}

	public boolean isfull(Student[] students) {
		if (numberOfStudents < 10) {
			return false;
		}
		return true;

	}

	public void registerStudent(Student student) {

		if (!isfull(students)) {
			students[numberOfStudents] = student;
			numberOfStudents++;
		}
	}
}
