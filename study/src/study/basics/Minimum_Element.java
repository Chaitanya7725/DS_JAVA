package study.basics;

public class Minimum_Element {

	public static void main(String[] args) {

		int[] arr= {1, 2, 3, 4};
		
		int element=arr[0];
		
		for (int i : arr) {
			element=element > i ?  i : element;
		}
		
		System.out.println(element);
	}
	
}
