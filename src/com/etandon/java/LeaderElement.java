/**
 * 
 */
package com.etandon.java;

/**
 * @author eshantandon
 *
 */
public class LeaderElement {

	/**
	   Given an Array of Integers, write a program to print all the leader elements.
	   Leader element is an element that has all the element to right less than itself
	 *
	 *
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array=new int[]{1};
        int greatest=array[array.length-1];
        System.out.println(greatest);
        for(int i=0;i<(array.length-1);i++)
           {
        	if(array[array.length-2-i]>greatest)
        	  {
        		greatest=array[array.length-2-i];
        		System.out.println(greatest);
        	  }
           }
    }

}
