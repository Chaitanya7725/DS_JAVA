package study.basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
	
		int number=sc.nextInt();
		System.out.println(Factorial.find(number));
	}

	private static int find(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*find(n-1);			
		}
	}

}
