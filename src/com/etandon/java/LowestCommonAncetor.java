/**
 * 
 */
package com.etandon.java;

import com.etandon.java.LevelOrderTraversal.Node;

/**
 * @author eshantandon
 *
 */
public class LowestCommonAncetor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node();
        root.data=4;
        root.left=new Node();
        root.left.data=2;
        root.left.left=new Node();
        root.left.left.data=1;
        root.left.right=new Node();
        root.left.right.data=3;
        root.right=new Node();
        root.right.data=7;
        root.right.left=new Node();
        root.right.left.data=6;
        lca(root,1,7);
	}
	static class Node{ 
    int data;
    Node left;
    Node right;
	}
	
	static Node lca(Node root,int v1,int v2)
    {
         if(root == null)
           {
            return null; 
           }
         Node current=root;
         while(current != null)
              {
               if(v1 > current.data && v2 > current.data)
                 {
                  current=current.right;   
                 }
               else if(v1 < current.data && v2 < current.data)
                 {
                  current=current.left; 
                 }
               else
                 {
                  //System.out.println(current.data);
                  return current; 
                 }  
              }
       return null;
    }
}
