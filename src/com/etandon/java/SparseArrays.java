/**
 * 
 */
package com.etandon.java;

import java.util.Scanner;

/**
 * @author eshantandon
 *
 */
public class SparseArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        String[] input=new String[N];
        for(int i=0;i<N;i++)
           {
        	input[i]=in.next();
           }
        int Q=in.nextInt();
        for(int i=0;i<Q;i++)
           {
        	String query=in.next();
        	int count=0;
        	for(int j=0;j<N;j++)
        	   {
        		if(input[j].equals(query))
        		  {count++;}
        	   }
        	System.out.println(count);
           }
        //System.out.println(input);
	}

}
