package ProgramsForInterviews;

public class FindMaxNumber {

	int i;
	double[] arrayOfNum = { 2.0, 4, 8, 5.2, 210.0, 150, 67.38 };

	void findmax() {
		double maxnum = arrayOfNum[0];

		for (i = 0; i < arrayOfNum.length; i++) {

			if (!(arrayOfNum[i] < maxnum)) {
				maxnum = arrayOfNum[i];

			}

		}
		System.out.println("Maximum number is: " + maxnum);
	}
}