package myProgs;

import java.util.Scanner;

public class EmpSalary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee Number:");
		int empNum = scanner.nextInt();
		System.out.println("Enter employee Name:");
		String empName = scanner.next();
		System.out.println("Enter employee BasicSalary:");
		double basicSalary = scanner.nextDouble();

		double da = basicSalary * 0.15;
		double hra = basicSalary * 0.22;
		double ta = basicSalary * 0.12;
		double pf = basicSalary * 0.12;

		double grossSalary = basicSalary + da + hra + ta;
		System.out.println("Gross salary:" + grossSalary);

		double incomeTax = grossSalary * 0.25;
		double deductions = pf + incomeTax;
		System.out.println("Deductions:" + deductions);
		double netSalary = grossSalary - (pf + incomeTax);
		System.out.println("Netsalary of employee:" + netSalary);
		scanner.close();

	}

}
