/**
 * 
 */
package com.etandon.java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author eshantandon
 *
 */
public class DynamicArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        Integer N=in.nextInt();
        Integer Q=in.nextInt();
        Long[][] query=new Long[Q][3];
        ArrayList<ArrayList<Long>> outputArray=new ArrayList<>();
        long lastAnswer=0;
        for(int i=0;i<Q;i++)
           {
        	for(int j=0;j<3;j++)
        	   {
        		query[i][j]=in.nextLong();
        	   }
           }
        for(int i=0;i<Q;i++)
           {
        	long x=query[i][1];
    		long y=query[i][2];
        	if(query[i][0]==1)
        	   {
        		//System.out.println("Type 1"+x+y);
        		long sequenceNum=((x^lastAnswer)%N);
        		ArrayList<Long> currentNode;
        		if(sequenceNum<outputArray.size())
        		   {
        			currentNode=outputArray.get((int) sequenceNum);
        		    currentNode.add(y);
        		    outputArray.set((int) sequenceNum,currentNode);
        		   }
        		else
        		   {
        			currentNode=new ArrayList<Long>();
        			currentNode.add(y);
        		    outputArray.add(currentNode);
        		   }
        	   }
        	else if(query[i][0]==2)
        	   {
        		//System.out.println("Type 2"+x+y);
        		long sequenceNum=((x^lastAnswer)%N);
        		ArrayList<Long> currentNode=outputArray.get((int) sequenceNum);
        		long fetchedIndex=(y%currentNode.size());
        		lastAnswer=currentNode.get((int) fetchedIndex);
        		System.out.println(lastAnswer);
        	   }
        	}
        //System.out.println(outputArray);
	}

}
