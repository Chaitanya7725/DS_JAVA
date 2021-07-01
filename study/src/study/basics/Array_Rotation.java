package study.basics;

public class Array_Rotation {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int d = 2;
		int n =7;
		int rotated_Array[] = new int[7];

//		Type 1
		for (int i = d; i < n; i++) {
			rotated_Array[i - d] = arr[i];
		}
		for (int i = 0; i < arr[d - 1]; i++) {
			rotated_Array[n - d + i] = arr[i];
		}
		for (int i : rotated_Array) {
			System.out.println(i);
		}

	}

}
