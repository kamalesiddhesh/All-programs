package arrays;

public class DescendingOrderArray {
	
	public static void descendingOrder(int arr[]) {
		int index =0;
		for(int i=0;i<arr.length;i++) {
			index = i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[index]) { // for ascending order - (arr[j]<arr[index])
					index = j;
				}
			}
			
			int largest = arr[index];
			arr[index] = arr[i];
			arr[i] = largest;
		}
		
		
		System.out.println("Here is descending ordered array : ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] input = {3,4,10,7,16};
		
		descendingOrder(input);
	}

}
