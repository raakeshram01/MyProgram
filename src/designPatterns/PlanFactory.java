package designPatterns;

public class PlanFactory {
	
	
	public Plan getPlan(String planType) {
		
		if(planType.equals("DomesticPlan")) {
			
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("commercialPlan")){
			
			
			return new CommercialPlan();
		}
		
		else if (planType.equals("institutionalPlan")) {
			
			return new InstitutionalPlan();
			
		}
		
		
		
		
		
		
		return null;
		
		
	}

	

	

}
