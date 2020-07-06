package designPatterns;

public class FactoryMain {

	public static void main(String[] args) {

		PlanFactory mrc = new PlanFactory();

		Plan p = mrc.getPlan("DomesticPlan");
		p.getRate();
		p.calculateBill(800);

	}

}
