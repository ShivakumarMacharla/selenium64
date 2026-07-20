package javaBasics;

public class MoveNegativeElementsToFront {

	public static void main(String[] args) {
		int[] num = {-1,-20,30,40,50,-8};
		arrange(num);
		
	}
	
	public static void arrange(int[] nums) {
		int temp[] = new int[nums.length]; // -1 -20 0 0 0 0 
		int j=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) {
				temp[j]=nums[i];
				j++;
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				temp[j]=nums[i];
				j++;
			}
		}
		
		for(int i: temp) {
			System.out.print(i+" ");
		}
		
		
	}
	

}
