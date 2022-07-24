package employeewageproblem;

public class EmployeeWageProblem {

	public static void main(String[] args) {
		final int partTime = 1;
		final int fullTime = 2;
		final int wagePerHour = 20;
		final int maxWorkingDays = 20;
		final int maxWorkingHours = 100;

		int totalWage = 0;
		int workingHrs = 0;
		System.out.printf("%5s %10s %6s %20s\n", "Day", "Working Hours", "Wage", "Total Working Hours");
		for (int day = 1, totalWorkingHrs = 0; day <= maxWorkingDays
				&& totalWorkingHrs < maxWorkingHours; day++, totalWorkingHrs += workingHrs) {

			int empType = (int) (Math.random() * 100) % 3;
			switch (empType) {
			case fullTime:
				workingHrs = 8;
				break;
			case partTime:
				workingHrs = 4;
				break;
			default:
				workingHrs = 0;
				break;
			}
			int wage = workingHrs * wagePerHour;
			totalWage += wage;
			System.out.printf("%4d %7d %12d %8d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);

		}
		System.out.println("Total wage for a month is " + totalWage + ".");
	}
}
