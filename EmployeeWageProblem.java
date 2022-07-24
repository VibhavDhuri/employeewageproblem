package employeewageproblem;

public class EmployeeWageProblem {

	public static void main(String[] args) {
		final int partTime = 1;
		final int fullTime = 2;
		final int wagePerHour = 20;
		final int workingDays = 20;

		int totalWage = 0;
		for (int day = 1; day <= workingDays; day++) {
			int empType = (int) (Math.random() * 100) % 3;
			int workingHours = 0;
			switch (empType) {
			case fullTime:
				workingHours = 8;
				break;
			case partTime:
				workingHours = 4;
				break;
			default:
			}
			int wage = workingHours * wagePerHour;
			System.out.println("Day " + day + " wage is: " + wage);
			totalWage += wage;
		}
		System.out.println("Total wage for the month is " + totalWage + ".");
	}
}
