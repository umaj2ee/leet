package leet;

import java.util.Scanner;

public class ConsecutiveOnes {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = 262141;//in.nextInt();
	        int cflag=0;int ccount=0;int max=0;
	      String bstr=Integer.toBinaryString(n);System.out.println(bstr);
	        for(char bit:bstr.toCharArray()){
	            if(bit=='1'){
	                if(ccount==0 || cflag==1){
	                 ccount++;
	                }
	                cflag=1;
	            }else{
	                if(max<ccount || max==0){
	                    max=ccount;
	                }cflag=0;ccount=0;
	            }
	            
	        }
	        if(cflag==1 && max<ccount)
	        	max=ccount;
	        System.out.println(max);
	    }
}
