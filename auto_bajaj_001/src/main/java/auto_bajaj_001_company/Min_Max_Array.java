package auto_bajaj_001_company;

public class Min_Max_Array {

	public static void main(String[] args) {
		
		int[] arr = {10,76,74,9,1};
		
		int smallest = arr[0];
		int largest = arr[0];
		
		for(int i=0; i<arr.length;i++) {
			
			if (arr[i]<smallest) {
				smallest = arr[i];
			}
			
			if (arr[i]>largest) {
				largest = arr[i];
			}
			
		}
		System.out.println("Smallest number in array is "+smallest);
		System.out.println("Largest number in array is "+largest);
		

	}

}
