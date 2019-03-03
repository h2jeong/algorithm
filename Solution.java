import java.util.ArrayList;

import java.util.List;

public class Solution {
	public static void main(String[] args) {
        int[] answer = {};
        //int[] arr = {1,1,3,3,3,0,1,1};
        int[] arr = {4,4,4,3,3};
        //int[] arr = {1,2,3,4};
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (temp == arr[i]) {
                list.add(temp);
                System.out.println("1. temp : " + temp);
            }
            temp = arr[i];
        }
        	
        	if (list.size() == 0) {
        		return;
        	}
        temp = list.get(0);
        for (int i = 1; i < list.size(); i++) {
    	   if (temp != list.get(i)) {
    		   list2.add(temp);
    	   }
    	   temp = list.get(i);
        }
        	list2.add(temp);
       
        answer = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            answer[i] = list2.get(i);
            System.out.println("anwer : " + answer[i]);
        }
    }
}
