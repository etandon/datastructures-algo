/**
 * 
 */
package com.etandon.java;

/**
 * @author eshantandon
 *
 */
public class PrintLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node head=null;
        head=PrintLinkedList.InsertNth(head, 1, 0);
        head=PrintLinkedList.InsertNth(head, 2, 1);
        head=PrintLinkedList.InsertNth(head, 10, 2);
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
	}
	
	static Node InsertNth(Node head, int data, int position) {
	   // This is a "method-only" submission. 
	    // You only need to complete this method.
	    if(head==null)
	      {
	       if(position==0)
	         {
	          head=new Node();
	          head.data=data;
	          head.next=null;
	         }
	      }
	    else
	      {
	        Node current=head; 
	        for(int i=1;i<position;i++)
	           {
	            current=current.next;
	           }
	        Node tempNode=new Node();
	        tempNode.next=current.next;
	        current.next=new Node();
	        current.next.data=data;
	        current.next.next=tempNode.next;
	        //return head;
	      }
	    return head;
	}

}
class Node {
    int data;
    Node next;
 }
