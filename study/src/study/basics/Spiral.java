package study.basics;

public class Spiral {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int r=3;
		int c=3;
		
		int i=0;
		int k=0;
		int l=0;
		
		int last_row=r-1;
		int last_column=c-1;
		
		for (int z = 0; z < arr.length; z++) {
			for (int j = 0; j < arr[z].length; j++)
				System.out.print(arr[z][j]);
			System.out.println();
		}
		System.out.println();	
		while(k <= last_row && l <= last_column) {
			
			for(i=l;i<=last_column;i++) {
				System.out.print(arr[k][i]);
			}
			k++;
			
			for (i=k;i<=last_row;i++) {
				System.out.print(arr[i][last_column]);
			}
			last_column--;
			if(k<=last_row) {
				for(i=last_column;i>=l;i--) {
					System.out.print(arr[last_row][i]);
				}
				last_row--;
			}
			if(l<=last_column) {
				for(i=last_row;i>=k;i--) {
					System.out.print(arr[i][l]);
				}
				l++;
			}
		}
		
	}

}
