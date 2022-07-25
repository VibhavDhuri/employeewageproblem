package employeewageproblem;

public class EmployeeWageProblem {
	// class constants
	static final int PART_TIME = 1;
	static final int FULL_TIME = 2;
	String COMPANY_NAME = "null";
	int WAGE_PER_HR = 0;
	int MAX_WORKING_DAYS = 0;
	int MAX_WORKING_HRS = 0;
	// instance variable
	int totalWage;

	EmployeeWageProblem(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
		COMPANY_NAME = companyName;
		WAGE_PER_HR = wagePerHr;
		MAX_WORKING_DAYS = maxWorkingDays;
		MAX_WORKING_HRS = maxWorkingHrs;
		totalWage = 0;
	}

	int generateEmployeeType() {
		return (int) (Math.random() * 100) % 3;
	}

	int getWorkingHrs(int empType) {
		switch (empType) {
		case FULL_TIME:
			return 8;
		case PART_TIME:
			return 4;
		default:
			return 0;
		}
	}

	void calculateTotalWage() {
		System.out.println("Computation of total wage of " + COMPANY_NAME + " employee");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
		int workingHrs;
		for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
				&& totalWorkingHrs < MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {
			int empType = generateEmployeeType();
			workingHrs = getWorkingHrs(empType);
			int wage = workingHrs * WAGE_PER_HR;
			totalWage += wage;
			System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
		}

	}

	public String toString() {
		System.out.println("Details of " + COMPANY_NAME + " employee");
		System.out.println("-----------------------------------------------------");
		System.err.println("Wage per hour:" + WAGE_PER_HR);
		System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
		System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
		return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalWage + "\n";
	}

	public static void main(String args[]) {
		EmployeeWageProblem google = new EmployeeWageProblem("Google", 8, 24, 100);
		EmployeeWageProblem microsoft = new EmployeeWageProblem("Microsoft", 6, 20, 150);

		google.calculateTotalWage();
		System.out.println(google);

		microsoft.calculateTotalWage();
		System.out.println(microsoft);
	}
}
