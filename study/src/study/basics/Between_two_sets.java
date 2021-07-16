package study.basics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=false

class Result {

	public static int getTotalX(List<Integer> a, List<Integer> b) {

		List<Integer> alist = new ArrayList<>();
		int counter = 0;
		int finalCounter = 0;
		for (int i = 0; i < a.size(); i++) {
			int lcm = a.get(0);
			int gcd = a.get(0);
			for (int z = 1; z < a.size(); z++) {
				gcd = findGCD(a.get(z), lcm);
				lcm = (lcm * a.get(z)) / gcd;
			}
			if (a.size() == 1) {
				for (int c = 0; c < Collections.min(b) / lcm; c++) {
					int addElement = a.get(0) * (c + 1);
					if (!alist.contains(addElement) && addElement <= Collections.min(b)) {
						alist.add(addElement);
					}
				}
			} else if (a.size() > 1) {
				int addElement = 0;
				for (int c = 0; c < Collections.min(b) / lcm; c++) {
					addElement = lcm * (c + 1);
					if (!alist.contains(addElement) && addElement <= Collections.min(b)) {
						alist.add(addElement);
					}
				}
			}
		}
		for (int m = 0; m < alist.size(); m++) {
			counter = 0;
			for (int j = 0; j < b.size(); j++) {
				System.out.println(b.get(j) + " " + alist.get(m) + " " + b.get(j) % alist.get(m));
				if ((b.get(j) % alist.get(m)) == 0) {
					counter += 1;
				}
			}

			if (counter == b.size()) {
				finalCounter += 1;
			}
		}
		return finalCounter;
	}

	private static int findGCD(Integer a, int b) {
		if (b == 0)
			return a;

		return findGCD(b, a % b);
	}

}

public class Between_two_sets {

	public static void main(String[] args) throws IOException {

		List<Integer> arr = new ArrayList<>();
		List<Integer> brr = new ArrayList<>();

		ArrayList<Integer> arrlist1 = new ArrayList<>();
		ArrayList<Integer> arrlist2 = new ArrayList<>();

//		Test Case no 1
//		Expected Output : 3
//		arrlist1.add(2);
//		arrlist1.add(4);
//		arrlist2.add(16);
//		arrlist2.add(32);		
//		arrlist2.add(96);		

//		Test Case no 2
//		Expected Output : 2
//		arrlist1.add(3);
//		arrlist1.add(4);
//		arrlist2.add(24);
//		arrlist2.add(48);

//		Test Case no 3
//		Expected Output : 1
//		arrlist1.add(2);
//		arrlist2.add(20);
//		arrlist2.add(30);
//		arrlist2.add(12);

//		Test Case no 4
//		Expected Output : 2
//		arrlist1.add(3);
//		arrlist1.add(9);
//		arrlist1.add(6);
//		arrlist2.add(36);
//		arrlist2.add(72);

//		Test Case no 5
//		Expected Output : 8
		arrlist1.add(1);
		arrlist2.add(72);
		arrlist2.add(48);

		arr.addAll(arrlist1);
		brr.addAll(arrlist2);

		int total = Result.getTotalX(arr, brr);
		System.out.println(total);

	}

}
