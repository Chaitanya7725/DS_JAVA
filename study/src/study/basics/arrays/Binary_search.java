package study.basics.arrays;

public class Binary_search {
	static int arr[] = { 5, 12, 13, 24, 35, 36, 47, 48, 59, 70, 71, 82 };
	
	public static void main(String[] args) {

		int elementToBeSearched = 71;
		int mid = arr.length / 2;
		int l=0;
		int r=arr.length-1;
		System.out.print("The "+elementToBeSearched+" is present at index no: "+getBinaryResult(mid, elementToBeSearched,l,r));
	}

	private static int getBinaryResult(int mid, int elementToBeSearched,int l, int r) {
		while(l<r) {
			mid=(l+r)/2;
			if (elementToBeSearched==arr[mid]) {
				return mid;
			} else if(elementToBeSearched>arr[mid]){
				l=mid+1;
				getBinaryResult(mid, elementToBeSearched,l,r);
			} else if(elementToBeSearched<arr[mid]){
				r=mid-1;
				getBinaryResult(mid, elementToBeSearched,l,r);
			}	
		}
		return -1;
	}

}
