package leet;

import java.util.ArrayList;
import java.util.List;

public class StringProblems {
	
	public String reverseString(String s) {
        StringBuffer stbuf=new StringBuffer();
        char[] c=s.toCharArray();
    for(int i=s.length()-1;i>=0;i--){
        stbuf.append(c[i]);
    }
        return stbuf.toString();
    }
	
	public String reverseWords(String s) {
        StringBuffer stbuf=new StringBuffer();
        char[] c=s.toCharArray();
    for(int i=s.length()-1;i>=0;i--){
        stbuf.append(c[i]);
    }
       
        String[] str=stbuf.toString().split(" ");
        stbuf.setLength(0);
        for(int i=str.length-1;i>=0;i--){
            if(stbuf.length()==0)
            stbuf.append(str[i]);
            else
               stbuf.append(" "+str[i]); 
        }
        return stbuf.toString();
    }
	/*
	  Given a List of words, return the words that can be typed using letters of alphabet 
	on only one row's of American keyboard like the image below.
	 Input: ["Hello", "Alaska", "Dad", "Peace"]
	Output: ["Alaska", "Dad"]
	You may use one character in the keyboard more than once.
     You may assume the input string will only contain letters of alphabet.

	
	 * */
	
	public String[] findWords(String[] words) {
        List<String> str=new ArrayList<String>();
        for(String word:words){
            //System.out.println(word);
         if(word.matches("[qwertyuiopQWERTYUIOP]*") ||
         word.matches("[asdfghjklASDFGHJKL]*") ||
         word.matches("[zxcvbnmZXCVBNM]*")){
             str.add(word);
         }
      
        }
        String[] myArray = new String[str.size()];

        
        return str.toArray(myArray);    
    }
}
	
	
	

