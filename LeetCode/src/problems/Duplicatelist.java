package problems;

import java.util.LinkedList;

public class Duplicatelist {
	
	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		
	    if(haystack.contains(needle)){
            for(int i=0;i<haystack.length();i++){
            	char ss=  haystack.charAt(i);
            	char sa = needle.charAt(0);
            	if(ss == sa){
                    System.out.print(i);
                }
            }
            
        }
    
		
		
	}

}
