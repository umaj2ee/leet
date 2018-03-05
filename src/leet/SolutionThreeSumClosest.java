package leet;

import java.util.ArrayList;
import java.util.List;

public class SolutionThreeSumClosest {
	static List<Integer> lst=new ArrayList<Integer>();
    static int target=3;
    int closest=0;
    public int threeSumClosest(int[] nums, int target) {
    	combinations2(nums,3,0,new int[3]);
      
        for(int i:lst) {
        	if(Math.abs(target-i)==0) {
                System.out.println(i);
        		return i;
        	}else {
        		if(closest == 0 ) {
        			closest= i;
        		}else {
        			if(closest>i)
        				closest=i;
        	   }
        }
        }
        System.out.println(closest);
       return closest;
    }
     static void combinations2(int[] arr, int len, int startPosition, int[] result){
        if (len == 0){
        	int sum=0;
        	for(int i : result)
        		sum=sum+i;
        	 
         	lst.add(sum);
            //System.out.println(Arrays.toString(result));
            return;
        }       
        for (int i = startPosition; i <= arr.length-len; i++){
            result[result.length - len] = arr[i];
            combinations2(arr, len-1, i+1, result);
        }
    }       
}
