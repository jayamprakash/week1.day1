package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		String strtest="Prakash Sekar12345";
		
		//to find length of string
		int prakash= strtest.length();
		System.out.println(prakash);
		
		//index of value
		System.out.println("index of value");
		int  prakash1= strtest.indexOf('e');
		System.out.println(prakash1);
		
		// last index of value
		int  prakash2= strtest.lastIndexOf('a');
		System.out.println("last index of a");
		System.out.println(prakash2);
		
		//covert to string to char
		char[]prakash3= strtest.toCharArray();
		System.out.println(prakash3);
		
		//convert string to word
		String [] prakash4=strtest.split("");
		System.out.println(prakash4);
		
		//Get the part of string
		String prakash5= strtest.substring(2);
		System.out.println(prakash5);
		
		
		//Get the wanted string
		String prakash6 = strtest.substring(3,6);
		System.out.println(prakash6);
		
		
		//Replace string / char
		String prakash7 = strtest.replace('r','R');
		System.out.println(prakash7);
		
		//Replace non int vale -- D(Non -int) d(int)
		String prakash8= strtest.replaceAll("[\\D]","a");
		System.out.println(prakash8);
		
		
		String prakash9= strtest.replaceAll("[\\d]","a");
		System.out.println(prakash9);
		
		//Lowercase
		String prakash10= strtest.toLowerCase();
		System.out.println(prakash10);
		
		//Uppercase
		String prakash11= strtest.toUpperCase();
		System.out.println(prakash11);
		
		
		
		
		
	}
	

}
