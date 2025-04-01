package arrays;

public class Find2ndLargestNumberInArray {
	
	public static void findSecondLargestNum(int[] nums){
		
		if(nums.length<2) {
			System.out.println("Array must contain at least two elements.");
			return;
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i] > largest ) {
				secondLargest = largest;
				largest = nums[i];
			}
			else if(nums[i] > secondLargest && nums[i]!=largest) {
				secondLargest = nums[i];
			}			
		}
		
		if(secondLargest == Integer.MIN_VALUE)
			System.out.println("There is no second largest number");
		else 
			System.out.println("Here is Second largest number : "+ secondLargest);
		
		
		
		
	}
	
	public static void main(String[] args) {
		int[] input = {3,5,6};
		
		findSecondLargestNum(input);
	}

}
