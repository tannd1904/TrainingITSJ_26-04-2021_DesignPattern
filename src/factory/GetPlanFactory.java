package factory;

public class GetPlanFactory {
	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DomesticPlan")) {
			return new DomesticPlan();
		} 
		else if (planType.equalsIgnoreCase("CommercialPlan")) {
			return new CommercialPlan();
		}
		else if (planType.equalsIgnoreCase("InstitutionPlan")) {
			return new InstitutionPlan();
		}
		return null;
	}
}	
