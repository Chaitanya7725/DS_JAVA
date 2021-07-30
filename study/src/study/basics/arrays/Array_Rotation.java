package study.basics.arrays;

import java.util.Iterator;

public class Array_Rotation {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		int n = arr.length;

//		Type 1: Using Temporary array
		/*
		 * int rotated_Array[] = new int[n];
		 * 
		 * for (int i = d; i < n; i++) { rotated_Array[i - d] = arr[i]; } for (int i =
		 * 0; i < arr[d - 1]; i++) { rotated_Array[n - d + i] = arr[i]; } for (int i :
		 * rotated_Array) { System.out.print(i); }
		 */

//		Type 2: Using Temporary variable

		
		/*
		 * int temp; int i = 0; while (i < d) { temp = arr[0]; for (int j = 1; j < n;
		 * j++) { arr[j - 1] = arr[j];
		 * 
		 * } arr[n - 1] = temp; i++; // n--; } for (int a : arr) { System.out.print(a);
		 * }
		 */
		 
		 

//		Type 3: Reversal Method
//		System.out.println(n-d);

		int i = 0;
		reverse(i, d - 1, arr);
		System.out.println("----------------------");
		i = 2;
		reverse(i, 6, arr);
		System.out.println("----------------------");
		i = 0;
		reverse(i, 6, arr);
		print(arr); 

	}

	private static void print(int[] arr) {
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();
	}

	private static void reverse(int i, int d, int[] arr) {
		int temp;
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println();
		int c = 0;
		while (c <= d) {
			System.out.println(i + " " + arr[i] + " " + d + " " + arr[d]);
			temp = arr[i];
			System.out.println("temp " + temp);
			for (int j = i; j < d; j++) {
				arr[j] = arr[j + 1];
				System.out.println("	arr[j] " + arr[j]);
			}
			arr[d] = temp;
			System.out.println("d " + d);
			System.out.println("arr[d] " + arr[d]);

			System.out.println("d " + d);
			c++;
			d--;
			print(arr);
		}

	}

}
