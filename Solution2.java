import java.util.*;
import java.util.Map.Entry;


public class Solution2 {
	public int dupl(int[] b ,int p) {
		int cnt = 0;
	    for (int i = 0; i < b.length; i++) {
	        if (p == b[i]) cnt++;
	    }
	    return cnt;
	}
	
	public Map<Integer, Integer> mkMap(int[] arr) {
		Solution2 quiz = new Solution2();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int cnt= quiz.dupl(arr, arr[i]);
			map.put(arr[i], cnt);
			System.out.println("arr["+i+"] = " + map.get(arr[i]));
		}
		return map;
	}
	
	public static void main(String[] args) {
		int answer = 0;
		Solution2 quiz = new Solution2();
		int[] arr1 = {1, 1, 9, 4, 1};
		int[] arr2 = {2, 3, 3, 9, 9, 9};
		
		Map<Integer, Integer> map1 = quiz.mkMap(arr1);
		Map<Integer, Integer> map2 = quiz.mkMap(arr2);
		
		TreeMap<Integer, Integer> sortedMap1 = new TreeMap<>(new ValueComparator(map1));
		TreeMap<Integer, Integer> sortedMap2 = new TreeMap<>(new ValueComparator(map2));
		sortedMap1.putAll(map1);
		sortedMap2.putAll(map2);
		
        System.out.println("map1 values: "+map1);
        System.out.println("sortedMap1 values: "+sortedMap1 + ", " + sortedMap1.firstEntry());
        System.out.println("sortedMap1 values: "+sortedMap2 + ", " + sortedMap2.firstEntry());
        	
        	Entry<Integer, Integer> final1 = sortedMap1.firstEntry();
        	Entry<Integer, Integer> final2 = sortedMap2.firstEntry();
        
        	if (final1.getValue().equals(final2.getValue())) {
        		if (final1.getKey().equals(final2.getKey())) answer = 0;
        		else if (final1.getKey() > final2.getKey()) answer = 1;
        		else answer = 2;
        	} else if (final1. getValue() >final2.getValue()) {
        		answer = 1;
        	} else answer = 2;
        	
        	System.out.println(answer);
	}
	static class ValueComparator implements Comparator<Integer> {
		Map<Integer, Integer> base;
		public ValueComparator(Map<Integer, Integer> base) {
			this.base = base;
		}
		
		@Override
		public int compare(Integer o1, Integer o2) {
			if (base.get(o1) >= base.get(o2)) return -1;
			else return 1;
		}
	}
}
