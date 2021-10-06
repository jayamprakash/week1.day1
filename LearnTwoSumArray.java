package week1.day2;

public class LearnTwoSumArray {

	public static void main(String[] args) {
		int nums[]= {1,3,5,6,7,2,1};
		int lengnth =nums.length;
		System.out.println("Array lengnth");
		System.out.println(lengnth);
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if ((nums[i]+nums[j])==4) {
		
					System.out.println(nums[i] +i);
					System.out.println(nums[j]+j);
					
					
				}
			}
		}
		

	}

}
