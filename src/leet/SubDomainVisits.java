package leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainVisits {

	
	    public List<String> subdomainVisits(String[] cpdomains) {
	        StringBuffer strbuf=new StringBuffer();int count=0;Map<String,Integer> map=new HashMap<String,Integer>();
	        for(String str : cpdomains){
	            String[] splitstr=str.split(" ");  
	            
	            if(splitstr[0]!= null)
	                   count=Integer.parseInt(splitstr[0]);
	            String s=splitstr[1];
	            if(map.get(s)==null)
	            map.put(s,count);
	            else
	                map.put(s,map.get(s)+count);
	            
	            String[] sarr=s.split("\\.");
	            for(int i=sarr.length-1;i >= 0;i--){
	                if(i==sarr.length-1){
	                    strbuf.append(sarr[i]);
	                }else{
	                    String tstr=strbuf.toString();
	                    strbuf.delete(0, strbuf.length());
	                    
	                    if(map.get(tstr)==null)
	                         map.put(tstr,count);
	                     else
	                        map.put(tstr,map.get(tstr)+count);
	                    if(i!=0)
	                    strbuf.append(sarr[i]+"."+tstr);
	                }
	        
	               }
	            }
	        List<String> result=new ArrayList<String>();
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            String key = entry.getKey();
	            Integer value = entry.getValue();
	             result.add(value+" "+key);
	        }

	            System.out.println(map);
	                //strbuf.delete(0, strbuf.length());
	     return result;    
	    }     
	 }


