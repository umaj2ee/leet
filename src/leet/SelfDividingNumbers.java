package leet;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SelfDividingNumbers {
	 public List<Integer> selfDividingNumbers(int left, int right) {
         List<Integer> result=new ArrayList<Integer>();
        if(left >= 1 && right <=10000){
           
            for(int i=left;i<=right;i++){
               String str=""+i;int resEle=0;int notvalid=0;
                char[] cs=str.toCharArray();
                Set<Character> set = new LinkedHashSet<Character>();
                
                for(Character c:cs){
                    //System.out.println(c+":"+i+"-");
                    set.add(c);
                }
                for(Character t:set){
                    int j=Integer.parseInt(""+t.charValue());
                    if(j!=0){
                       if(i%j != 0)
                           resEle=1;
                    }else{
                        notvalid=1;
                    }
                 
                }
                if(resEle==0 &&  notvalid==0)
                     result.add(i);
            }
        }
        return result;
    }
	 
	 public static void main(String[] str) {
		 SelfDividingNumbers sdn=new SelfDividingNumbers();
		 System.out.println(sdn.selfDividingNumbers(1, 22));//(left,right);
	 }
}
