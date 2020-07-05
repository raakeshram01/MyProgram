package myProgs;

public class ClsMe {
int x;
	int empNum;
	String empName;
	double salary;
	ClsMe(){
		System.out.println("i am in constructor");
	}
	
	ClsMe(int empNum,String empName,int salary){
		super();
		this.empNum=empNum;
		this.empName= empName;
		this.salary=salary;
	}
	
	
	
	void display() {
//		System.out.println("employee number:"+empNum);
//		System.out.println("employee name:"+empName);
//		System.out.println("Employee salary:"+salary);

		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
//		ClsMe mrc = new ClsMe(561,"ram",10000);
	ClsMe mrc1 = new ClsMe();
ClsMe mrc2 = new ClsMe();		
	//mrc.display();
		
		int y[] =new int[3];
		

		System.out.println(mrc1.x);
		System.out.println(y);
		System.out.println(mrc1);
		System.out.println(mrc2);
	}

}
