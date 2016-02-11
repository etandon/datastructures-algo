/**
 * 
 */
package com.etandon.java;

/**
 * @author eshantandon
 *
 */
public class ParenthesisCombinationsRecursion {

	/**
	 Given number n, print all valid combinations of corresponding number of open and closed braces
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        recursion(3,0,"");
	}
    public static void recursion(int openbraces,int closebraces,String output)
      {
    	if(openbraces==0 && closebraces==0)
    	   {System.out.println("Out:"+output);}
    	if(openbraces>0)
    	   {
    		recursion(openbraces-1,closebraces+1,output.concat("{"));
    	   }
    	if(closebraces>0)
    	   {
    		recursion(openbraces,closebraces-1,output.concat("}"));
    	   }
      }
}
