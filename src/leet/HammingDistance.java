package leet;

public class HammingDistance {
	int count =0;
	public int hammingDistance(int x, int y) {
		     if( (x >= 0 && x<= (int) Math.pow(2,31)) && (y >= 0 && y<= (int) Math.pow(2,31)) ){
	          int no = Math.abs(x ^ y);
            while(no!=0){
	            int d = no%2;
	            if(d==1)
	                count++;
	            no = no/2;
	        }
	       }
	        System.out.println(count);
	        return count;
		
	}
	public static void main(String[] args) {
		HammingDistance h=new HammingDistance();
		h.hammingDistance(0, 2147483647);
	
	}
}
