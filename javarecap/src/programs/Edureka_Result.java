import java.util.Scanner;

public class Edureka_Result {

	public static void main(String[] args) {

		int Mathematics, English, Science, Social_Science;
		int Total;
		int Percentage;

		Scanner user_scanner = new Scanner(System.in);

		System.out.println("Enter the marks between 0 to 100");
		System.out.println("Mathematics : ");
		Mathematics = user_scanner.nextInt();

		System.out.println("English : ");
		English = user_scanner.nextInt();	

		System.out.println("Science : ");
		Science = user_scanner.nextInt();

		System.out.println("Social Science : ");
		Social_Science = user_scanner.nextInt();

		if (Mathematics > 100 || Mathematics < 0 || English > 100
				|| English < 0 || Science > 100
				|| Science < 0 || Social_Science > 100 || Social_Science < 0) {
			Mathematics = 0;
			English = 0;			
			Science = 0;
			Social_Science = 0;

			System.out.println("The entered Score was Invalid!");

		}

		else {

			Total = Mathematics + English + Science + Social_Science;

			Percentage = Total / 4;

			if (Percentage < 40) {
				System.out.println("Sorry! You Failed. Your Score : "
						+ Percentage + "%");
			} else if (Percentage >= 40 && Percentage < 60) {
				System.out
						.println("Congratulations! You were Average. Your Score : "
								+ Percentage + "%");
			} else if (Percentage >= 60 && Percentage < 80) {
				System.out
						.println("Congratulations! You were Good. Your Score : "
								+ Percentage + "%");
			} else if (Percentage >= 80 && Percentage < 90) {
				System.out
						.println("Congratulations! You were Very Good. Your Score : "
								+ Percentage + "%");
			} else {
				System.out
						.println("Congratulations! You were Excellent. Your Score : "
								+ Percentage + "%");
			}
		}
	}

}
