/**
 * 
 */
package com.etandon.java;

/**
 * @author eshantandon
 *
 */
public class CompareLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node headA1=new Node();
		headA1.data=4;headA1.next=new Node();
		headA1.next.data=15;headA1.next.next=null;
		
		Node headA2=new Node();
		headA2.data=15;headA2.next=new Node();
		headA2.next.data=4;headA2.next.next=null;
		
		System.out.println(CompareLists(headA1,headA2));
	}
	
	static int CompareLists(Node headA, Node headB) {
	    // This is a "method-only" submission. 
	    // You only need to complete this method 
	    Node currentA=headA;
	    Node currentB=headB;
	    int output=1;
	    while(currentA!=null || currentB!=null)
	      {
	       if(currentA.data != currentB.data)
	           {output=0;}
	       currentA=currentA.next;
	       currentB=currentB.next;
	       if(currentA==null && currentB !=null)
	           {output=0;}
	       if(currentA!=null && currentB ==null)
	           {output=0;}
	      }
	    return output;
	}

}
