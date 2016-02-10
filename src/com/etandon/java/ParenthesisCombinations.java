/**
 * 
 */
package com.etandon.java;

/**
 * @author eshantandon
 *
 */
public class ParenthesisCombinations {

	/**
	 Given number n, print all valid combinations of corresponding number of open and closed braces
	 */
	public static void main(String[] args) {
		int n=4;
		StringBuilder output=new StringBuilder("");
		for(int i=0;i<n;i++)
		   {
			output.append("{");
		   }
		for(int j=0;j<n;j++)
		   {
			output.append("}");
		   }
        System.out.println(output);
        for(int k=0;k<output.length();k++)
           {
        	StringBuilder temp=new StringBuilder(output);
        	char pivot=temp.charAt(k);
        	//System.out.println("Pivot:"+pivot);
        	for(int l=0;l<output.length()-k-1;l++)
        	   {
        		temp=new StringBuilder(output);
        		char inner=output.charAt(k+l+1);
        		//System.out.println(" Inner:"+inner);
        		if(pivot!=inner)
        		   {
        			temp.setCharAt(k, inner);
        			temp.setCharAt(k+l+1, pivot);
        			if(validate(temp))
        			System.out.println(temp);
        		   }
        		
        	   }
        	
           }
    }
	public static boolean validate(StringBuilder input)
	{
		int openbraces=0;
		int closebraces=0;
		boolean valid=true;
		for(int i=0;i<input.length();i++)
		   {
			if(input.charAt(i)=='{')
				openbraces++;
			else
				closebraces++;
			if(closebraces>openbraces)
				return false;
		   }
		return valid;
	}

}
