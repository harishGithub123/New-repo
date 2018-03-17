import java.util.Scanner;

public class Edureka_Compare_Numbers_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int michaelNum;
		int bruceNum;

		Scanner user_scanner = new Scanner(System.in);

		System.out.println("Enter the Numbers for Comparision");
		System.out.println("Michael enter your Number:");
		michaelNum = user_scanner.nextInt();
		System.out.println("Bruce enter your Number:");
		bruceNum = user_scanner.nextInt();

		System.out.println("The Numbers that were entered are :");
		System.out.println("Number 1 = " + michaelNum + " Number 2 = "
				+ bruceNum);

		if (michaelNum > bruceNum) {
			System.out.println("The First number is greater than the Second. Michael Wins !");
		} else if (michaelNum == bruceNum) {
			System.out.println("Both Numbers are Equal. No one Wins !");
		} else {
			System.out.println("The Second number is greater than the First. Bruce Wins !");
		}
	}

}
