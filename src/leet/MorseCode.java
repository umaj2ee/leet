
package leet;

import java.util.HashMap;
import java.util.Map;

class MorseCode {
	public static void main(String[] args) {
		MorseCode mc=new MorseCode();
		mc.uniqueMorseRepresentations(new String[] {"gin","zen", "gig", "msg"});
	}
    public int uniqueMorseRepresentations(String[] words) {
       Map<String, Integer> hm = new HashMap<String, Integer>();
        for (int i=0; i<words.length; i++){
            if(words[i]!=null){
            if(!hm.containsKey(getWordTransformation(words[i])))
                hm.put(getWordTransformation(words[i]) ,0);
              else{
                 int j= hm.get(getWordTransformation(words[i]));
                  hm.put(getWordTransformation(words[i]) ,j++);
                  j=0;
              }
            }
        }
        System.out.println( hm.size());
        return hm.size();
    }
public String getWordTransformation(String word){
StringBuffer sb=new StringBuffer();
    if(word != null){
    char[] ch=word.toCharArray();
for(int i=0;i<ch.length;i++){
sb.append(getChar(ch[i]));
}
    }
    return sb.toString();
}
public String getChar(char s){
        if( s=='A' || s=='a')
           return ".-";
        else if( s=='B' || s=='b')
           return "-...";
        else if(s=='C' || s=='c')
           return "-.-.";
        else if( s=='D' || s=='d')
           return "-..";
        else if(s=='E' || s=='e')
           return ".";
        else if(s=='F' || s=='f')
           return "..-.";
        else if(s=='G' || s=='g')
           return "--.";
        else if(s=='H' || s=='h')
           return "....";
        else if(s=='I' || s=='i')
           return "..";
        else if(s=='J' || s=='j')
           return ".---";
        else if( s=='K' || s=='k')
           return "-.-";
        else if( s=='L' || s=='l')
           return ".-..";
        else if( s=='M' || s=='m')
           return "--";
        else if( s=='N' || s=='n')
           return "-.";
        else if( s=='O' || s=='o')
           return "---";
        else if(s=='P' || s=='p')
           return ".--.";
        else if( s=='Q' || s=='q')
           return "--.-";
        else if(s=='R' || s=='r')
           return ".-.";
        else if( s=='S' || s=='s')
           return "...";
        else if(s=='T' || s=='t')
           return "-";
        else if( s=='U' || s=='u')
           return "..-";
        else if( s=='V' || s=='v')
           return "...-";
        else if( s=='W' || s=='w')
           return ".--";
        else if( s=='X' || s=='x')
           return "-..-";
        else if( s=='Y' || s=='y')
           return "-.--";
        else if( s=='Z' || s=='z')
           return "--..";
    else
        return "^";
    }
}