package myProgs;


class Student1 {

	int rollNum;
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;
	
	
	public Student1(int rollNum,String studName,int mark1,int mark2,int mark3) {
		this.rollNum=rollNum;
		this.studName=studName;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
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

public class StudentDemoCon {

	public static void main(String[] args) {
		Student1 mrc = new Student1(561,"raj",99,98,100);
		mrc.calculateTotal();
		mrc.displayStudDetails();
	}

}
