package week1.day2;

import java.util.Arrays;

public class LearnIntersection {
	public static void main(String[] args) {
		int[] Arr1={3,2,11,4,6,7};
		int[] Arr2={1,2,8,4,9,7};
		int c;
		
		 Arrays.sort(Arr1);
		 Arrays.sort(Arr2);
		 
		for (int i = 0; i < Arr1.length; i++) {
			
			for (int j = 0; j < Arr2.length; j++) {
				
				if (Arr1[i]==Arr2[j])
				{
				 System.out.print(Arr1[i]);
				 
					
				}
			}
		}
		
	}

}
