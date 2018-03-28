package leet;

import java.util.HashMap;
import java.util.Map;

public class NumberOfLines {
	
	    public int[] numberOfLines(int[] widths, String S) {
	       Map<Character, Integer> alpha = new HashMap<Character, Integer>();int count=0;
	        for(int j=65;j<=90;j++){
	            alpha.put((char)j,widths[count++]);
	        }
	        count=0;
	        for(int j=97;j<=122;j++){
	            alpha.put((char)j,widths[count++]);
	        }
	        count=0;
	       // Set<Map.Entry<Character, Integer>> entry = alpha.entrySet();
	       // for (Map.Entry<Character, Integer> elements : entry)
	       // {
	         //   System.out.println("Key: " + elements.getKey() + " Value : " + elements.getValue());
	       // }
	        char[] chars=S.toCharArray();int sum=0;
	        for(int i=0;i<S.toCharArray().length;i++){
	            sum=sum+alpha.get(chars[i]);
	            if(sum>100){
	                sum=0;
	                count++;
	                i--;
	            }
	            System.out.println(alpha.get(chars[i]))  ;
	        }
	        if(sum>0)
	            count++;
	            
	        return new int[]{count,sum};
	    }
	     
	   
	}

