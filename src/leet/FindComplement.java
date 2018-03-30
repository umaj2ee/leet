package leet;

public class FindComplement {
	 public int findComplement(int num) {
	        String binval1=Integer.toBinaryString(num);
	        String binval=Integer.toBinaryString(~num);
	        char[] binchars=binval.toCharArray();int k=1;int num2=0;
	        for(int i=(binval.length()-1);i>(binval.length()-binval1.length());i--){
	            if(num2==0){
	              num2=Character.getNumericValue( binchars[i])*k;
	            }else{
	               
	              num2=num2+Character.getNumericValue(binchars[i])*k;
	            }
	            k=k*2;
	        }
	            return num2;
	    }
	
	
}
