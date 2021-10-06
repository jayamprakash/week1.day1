package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
       int [] arr = {100,49,398,34,1,267};
       int lengnth= arr.length;
       
       System.out.println("Array lengnth:" +lengnth);
	   
       for (int i = 0; i < arr.length; i++) {
    	   
    	   Arrays.sort(arr);
    	   
    	   
		System.out.println("sorting list:"+ arr[i]);
       }
       System.out.println("smallest number:"+arr[0]);
    	 
    	   
	System.out.println("largest number:"+arr[lengnth-1]);
       }   
		
	}
       
	


