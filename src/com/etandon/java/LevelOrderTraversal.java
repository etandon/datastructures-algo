/**
 * 
 */
package com.etandon.java;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author eshantandon
 *
 */
public class LevelOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node root=new Node();
        root.data=3;
        root.left=new Node();
        root.left.data=5;
        root.left.left=new Node();
        root.left.left.data=1;
        root.left.right=new Node();
        root.left.right.data=4;
        root.right=new Node();
        root.right.data=2;
        root.right.left=new Node();
        root.right.
        LevelOrder(root);
        
	}
static class Node
     { 
       int data;
       Node left;
       Node right;
     }

static void LevelOrder(Node root)
{
  if(root != null)
    {
      ArrayBlockingQueue<Node> q=new ArrayBlockingQueue<Node>(100);
	  q.offer(root);
      while(q.size() != 0)
           {
    	     Node current=q.poll();
    	     System.out.print(current.data+ " ");
    	     if(current.left != null)
    	       {
    	    	q.offer(current.left); 
    	       }
    	     if(current.right != null )
    	       {
    	    	 q.offer(current.right);
    	       } 
           }
    } 
  
}

}
