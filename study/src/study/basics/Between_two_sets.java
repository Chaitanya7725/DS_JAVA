package study.basics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=false

class Result {

	public static int getTotalX(List<Integer> a, List<Integer> b) {

		List<Integer> alist = new ArrayList<>();
		int counter = 0;
		int finalCounter = 0;
		for (int i = 0; i < a.size(); i++) {
			if (i != 0) {
				if ((a.get(i) % a.get(i - 1)) == 0) {
					for (int c = 1; c <= 4; c++) {
						int addingElement = a.get(i) * c;
						if (!alist.contains(addingElement) && addingElement <= b.get(0)) {
							alist.add(a.get(i) * c);
						}
					}
				} else {
					for (int c = 1; c <= 4; c++) {
						int addElement = a.get(i) * a.get(i - 1) * c;
						if (!alist.contains(addElement) && addElement <= b.get(0)) {
							alist.add(addElement);
						}
						// else if(!alist.isEmpty()){
						// alist.add(a.get(i-1)*c);
						// }
					}
				}
			}
		}
		// for(int m=0;m<alist.size();m++){
		// System.out.println(alist);
		// }
		for (int m = 0; m < alist.size(); m++) {
//			System.out.println(alist.get(m));
			counter = 0;
			for (int j = 0; j < b.size(); j++) {
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

}

public class Between_two_sets {

	public static void main(String[] args) throws IOException {
        
        List<Integer> arr=new ArrayList<>();
        List<Integer> brr=new ArrayList<>();

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
		arrlist1.add(3);
		arrlist1.add(4);
		arrlist2.add(24);
		arrlist2.add(48);
		
        
		arr.addAll(arrlist1);
		brr.addAll(arrlist2);
		
		
        int total = Result.getTotalX(arr, brr);
        System.out.println(total);
        
    }

}
