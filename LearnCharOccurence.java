package week1.day2;

public class LearnCharOccurence {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;

		char[] strcount = str.toCharArray();
		System.out.println(strcount);
		for (int i = 0; i < strcount.length; i++) {
			
			System.out.println(strcount[i]);
			
			
			if (strcount[i] == 'e') {

				count = count + 1;

			}

		}

		System.out.println(count);

	}
}
