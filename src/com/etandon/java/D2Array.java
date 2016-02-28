/**
 * 
 */
package com.etandon.java;

import java.util.Scanner;

/**
 * @author eshantandon
 *
 */
public class D2Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int largestsum=-900;
        for(int x=0;x<=3;x++)
           {
        	for(int y=0;y<4;y++)
        	   {
        		//Logic to find the sum of hour glass 
        		int currentblocksum=0;
        		for(int k=0;k<3;k++)
        		    {
        			currentblocksum=currentblocksum+arr[y][x+k];
        		    }
        		for(int k=1;k<2;k++)
        		    {
        			currentblocksum=currentblocksum+arr[y+1][x+k];
        		    }
        		for(int k=0;k<3;k++)
        		    {
        			currentblocksum=currentblocksum+arr[y+2][x+k];
        		    }
        	   System.out.println("Current Sum:"+currentblocksum);
        	   if(currentblocksum>largestsum)
        	     {
        		   largestsum=currentblocksum;
        	     }
        	   }
        	}
        System.out.println(largestsum);
        
        
	}

}
