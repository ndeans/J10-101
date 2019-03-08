package us.deans.javastudy.operations;

public class Palindrome {
	
	public void start() {
		System.out.println(isPalindrome("Deleveled"));
	}
	
    public boolean isPalindrome(String word) {
        
    	String reverse = new StringBuffer(word).reverse().toString();
    	
    	if (word.equalsIgnoreCase(reverse)) 
    		return true;
    	else 
    		return false;

    }

}
