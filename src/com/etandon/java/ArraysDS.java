/**
 * 
 */
package com.etandon.java;

import java.util.Scanner;

/**
 * @author eshantandon
 *
 */
public class ArraysDS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int x=0;x<arr.length;x++)
            {
             System.out.print(arr[arr.length-1-x]+" ");
            }
	}

}
