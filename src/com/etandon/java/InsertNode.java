/**
 * 
 */
package com.etandon.java;

/**
 * @author eshantandon
 *
 */
public class InsertNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      InsertNode n=new InsertNode();
      Node out=n.SortedInsert(null, 2);
      out=n.SortedInsert(out, 1);
      out=n.SortedInsert(out, 4);
      out=n.SortedInsert(out, 3);
      System.out.println(out);
	}
	class Node {
	     int data;
	     Node next;
	     Node prev;
	  }
	Node SortedInsert(Node head,int data) {
	     if(head==null)
	        {
	         head=new Node();
	         head.data=data;
	         head.next=null;
	         head.prev=null;
	         return head;
	        }
	     if(head.data > data)
	        {
	          Node newNode=new Node();
	          newNode.data=data;
	          newNode.prev=null;
	          newNode.next=head;
	          head.prev=newNode;
	          return newNode;
	        } 
	    Node current=head;
	    while(current!=null)
	         {
	          if(current.next==null)
	            {
	             current.next=new Node();
	             current.next.data=data;
	             current.next.next=null;
	             current.next.prev=current; 
	             return head; 
	            }
	         else if((current.data < data) && (current.next.data > data))
	                {
	                 Node newNode=new Node();
	                 newNode.next=current.next;
	                 newNode.data=data;
	                 newNode.prev=current;
	                 current.next=newNode;
	                 newNode.next.prev=newNode;
	                 return head;
	                }
	           current=current.next;  
	             
	         }
	    return head;
	}

}
