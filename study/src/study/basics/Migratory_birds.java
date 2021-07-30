package study.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/challenges/migratory-birds

class GetCount {
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer,Integer> check=new HashMap<>();
        Map<Integer,Integer> checkNew=new HashMap<>();
        Collections.sort(arr);
        int counter=0;
        for(int i=0;i<arr.size()-1;i++){
            counter=check.containsKey(arr.get(i)) ? check.get(arr.get(i)):0;
            counter+=1;
            check.put(arr.get(i),counter);
        }
        for (Map.Entry<Integer,Integer> entry : check.entrySet()){
            if(entry.getValue()==Collections.max(check.values())){
                counter=entry.getKey();
                checkNew.put(entry.getKey(),entry.getValue());
            }            
        }
        for (Map.Entry<Integer,Integer> entry : checkNew.entrySet()){
            counter=entry.getKey();
            break;
        }
        return counter;
    }
}

public class Migratory_birds {
	
	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<>();

		ArrayList<Integer> arrlist1 = new ArrayList<>();
		
		arrlist1.add(1);
		arrlist1.add(4);
		arrlist1.add(4);
		arrlist1.add(4);
		arrlist1.add(5);
		arrlist1.add(3);
//		??4
//		1 2 3 4 5 4 3 2 1 3 4??3

		arr.addAll(arrlist1);
		
		int total = GetCount.migratoryBirds(arrlist1);
		System.out.println(total);
		
	}

}
