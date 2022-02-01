package problems;

public class Bubblesort {
	 public static void main(String[] args) {
			
	 int [] nums = {17,4,2,3,6,5,15,7,10};
	 
	 for(int i=0;i<nums.length-2;i++) {
		 for(int j=0;j<(nums.length-2)-i;j++) {
			 
			 
			 if(nums[j]>nums[j+1]) {
			 int temp = nums[j+1];
			 nums[j+1] = nums[j];
			 nums[j] = temp;
			 }
			 
		 }
		 
		 System.out.print(nums[i]);
	 }
	
	 }
	 

}
