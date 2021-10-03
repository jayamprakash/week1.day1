package week1.day1;

public class LearnFibonacciSeries {

	public static void main(String[] args) {

	    int number1 = 0;
        int number2 = 1;
        int fact;
     

        System.out.print(number1);

        for(int i=1;i<=8;i++){
          
          fact = number1 + number2;
          System.out.print(", " + number2);
          number1 = number2;
          number2= fact; 

		}

	}

}
