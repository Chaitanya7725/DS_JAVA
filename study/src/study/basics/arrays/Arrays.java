package study.basics.arrays;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author SONY
 *
 */
public class Arrays {
	/**
	 * @param args
	 */
//	static int arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
//	int x = 3; 
//	int k = 3;
//	static int arr[] = { 5, 8, 7, 12, 14, 3, 9};
//	int x = 3; 
//	int k = 3;
	private static boolean status;
	static int arr[] = {21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25};
//	int x = 3; 
//	int k = 3;
	public static void main(String[] args) {
//		b=5;
//		System.out.println(b);
		
//		int [] arr0= {1,2,3,4};
//		int arr[]= {1,2,3};

		
//		System.out.println(arr0.getClass().get);
//		for (int i : arr) {
//			System.out.println("Is this working?"+arr[i-1]);			
//		}
		
//		int z[]= {3,4,5,6,7};
//		System.out.println(z[3]);
//	---------------------------------------	
//		int z[]=new int[20];
//		for(int i=0;i<21;i++) {
//			z[i]=i;
//			System.out.println(z[i]);
//		}
//		System.out.println(z.length);
//		---------------------------------------
//		int a[]=new int[] {1,2,3,4,5,6,7,8};
//		System.out.println(a.length);
//		---------------------------------------
//		int[] intArray = { 1,2,3,4,5,6,7,8,9,10 }; 
//		for (int i = 0; i < intArray.length; i++) {
//			System.out.println(intArray[i]);
//		}
//		---------------------------------------
//		Quiz [] quiz=new Quiz[5];
//		quiz[0]=new Quiz(1,"SBI");
//		quiz[1]=new Quiz(2,"RBI");
//		quiz[2]=new Quiz(3,"ICICI");
//		quiz[3]=new Quiz(4,"BOM");
//		quiz[4]=new Quiz(5,"HDFC");
//		
//		for(int i=0;i<5;i++) {
//			System.out.println("This quiz is "+quiz[i].id+" "+quiz[i].name);
//		}
//		---------------------------------------
//		int arr[][]= {{0,3,5},{1,4,5},{1,8,5}};
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
//		-----------------------------------------
		
		int checkPoint = 23; 
		int slots = 5;
		int newSlots=slots;
		int counter=0;
		int verifyCounter=0;

		for (int i = 0; i < arr.length; i++) {
			int c=0;
			int d=0;
			for (int j = i; j < slots; j++) {
				c+=1;
				System.out.print(arr[j]+" ");
				if(arr[j]==checkPoint) {
					counter+=1;
					d+=1;
					break;
				}
			}
			System.out.println(c+" "+d);
			if(c-d==c) {
				System.out.println("NO");
				status=true;
				break;
			}

			System.out.println();
			i+=(newSlots-1);
			slots+=reduce(newSlots);
			verifyCounter+=1;
			System.out.println(counter+" "+verifyCounter);
		}
		if(!status) {
			if(verifyCounter==counter) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}			
		}

		
	}

	private static int reduce(int newSlots) {
		if(newSlots>arr.length) {
			return newSlots - reduce(newSlots-1);
		}
		return newSlots;
		
	}

}
