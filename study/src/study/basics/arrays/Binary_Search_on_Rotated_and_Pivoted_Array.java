package study.basics.arrays;

public class Binary_Search_on_Rotated_and_Pivoted_Array {

	static int arr[] = { 3, 4, 5, 1, 2};
	
	public static void main(String[] args) {

		int elementToBeSearched = 10;
		int l=0;
		int r=arr.length-1;
		int pivot=findPivot(l,r);
		if(arr[pivot]>elementToBeSearched) {
			l=pivot+1;
			r=arr.length-1;
		}else {
			r=pivot;
		}
		System.out.print(getBinaryResult(elementToBeSearched,l,r));
	}

	private static int getBinaryResult(int elementToBeSearched,int l, int r) {
		while(l<r) {
			int mid=(l+r)/2;
			if (elementToBeSearched==arr[mid]) {
				return arr[mid];
			} else if(elementToBeSearched>arr[mid]){
				l=mid+1;
				getBinaryResult(elementToBeSearched,l,r);
			} else if(elementToBeSearched<arr[mid]){
				r=mid-1;
				getBinaryResult(elementToBeSearched,l,r);
			}	
		}
		return -1;
	}

	private static int findPivot(int l, int r) {
		for(int i=0;i<r;i++) {
			if(arr[i]>arr[i+1]) {
				return i;
			}
		}
		return -1;
	}

}
