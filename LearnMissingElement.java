package week1.day2;

import java.util.Arrays;

public class LearnMissingElement {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,7,6,8};
		int j=0;
	
		
      int lengnth =arr.length;
      System.out.println(lengnth);
      Arrays.sort(arr);
      
    System.out.println();
      
      
      for (int i = 0; i < arr.length; i++) {
   	   
   	   
   	   
   	   
		//System.out.println("sorting list:"+ arr[i]);
     
		
		if (arr[i]!=i+1) {
			
			j=i+1;
			
			
			System.out.println(j);
			break;
			
		}
		
		
      
      }
	

}
}
