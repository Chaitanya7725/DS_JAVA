package study.basics;

public class Linear_Search {

	public static void main(String[] args) {
		int integer_to_find=5;

		int [] arr= {1,2,3,4,5,6,7,8};
		int index=0;
		boolean status=false;
		for (int i : arr) {
//			i===integer_to_find  ? status = true & index = i: status & index=0;
			if(arr[i-1]==integer_to_find) {
				 status = true;
				 index = arr[i];
				 System.out.println(status+" "+index);
			}
			
		}
	}

}
