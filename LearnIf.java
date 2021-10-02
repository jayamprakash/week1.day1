package week1.day1;

public class LearnIf {

	public static void main(String[] args) {
		int number = 22;
		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("trizz-frizz");
		} else if (number % 3 == 0) {
			System.out.println("trizz");
		} else if (number % 5 == 0) {
			System.out.println("frizz");
		}
		System.out.println("that number is not divide by 3 and 5");

	}
}
