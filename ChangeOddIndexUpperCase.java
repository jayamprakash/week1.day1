package week1.day2;

public class ChangeOddIndexUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		String S1;
		
     char[] Test1 = test.toCharArray();
     for (int i = 0; i < Test1.length; i++) {
    	 
    	if (Test1[i]%2!=0) {
    		
    		S1=test.toUpperCase();
    		System.out.println(S1);
			
		} else {

		}
    
	}
	

	}

}
