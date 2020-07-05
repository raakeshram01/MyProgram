package myProgs;

public class StudentDemo {
	public static void main(String[] args) {

		Student mrc = new Student();
		mrc.setStudDetails();
		mrc.calculateTotal();
		mrc.displayStudDetails();
		
	}
}

class Student {

	int rollNum;
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;

	public void setStudDetails() {

		rollNum = 564;
		studName = "ram";
		mark1 = 90;
		mark2 = 92;
		mark3 = 85;
	}

	public void calculateTotal() {

		totalMarks = mark1 + mark2 + mark3;
	}

	public void displayStudDetails() {

		System.out.println("roll number:" + rollNum);
		System.out.println("Student name:" + studName);
		System.out.println("Total marks:" + totalMarks);
	}

}
