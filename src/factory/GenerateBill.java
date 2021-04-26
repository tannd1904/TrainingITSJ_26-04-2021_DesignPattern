package factory;

public class GenerateBill {

	public static void main(String[] args) {
		GetPlanFactory planFactory = new GetPlanFactory();

		Plan plan = planFactory.getPlan("CommercialPlan");
		
		plan.getRate();
		plan.calculateBill(100);
	}

}
