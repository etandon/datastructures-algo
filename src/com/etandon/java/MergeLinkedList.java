/**
 * 
 */
package com.etandon.java;

/**
 * @author eshantandon
 *
 */
public class MergeLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node headA1=new Node();
		headA1.data=1;headA1.next=new Node();
		headA1.next.data=15;headA1.next.next=null;
		
		Node headA2=new Node();
		headA2.data=3;headA2.next=new Node();
		headA2.next.data=7;headA2.next.next=null;
		
		System.out.println(MergeLists(headA1,headA2));
	}
	
	static Node MergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method 
	     Node currentA=headA;
	     Node currentB=headB;
	     Node returnedList=null;
	     Node currentReturned=null;
	     if(currentA == null && currentB ==null)
	        {return null;}
	     if(currentA == null)
	        {return currentB;}
	     if(currentB == null)
	        {return currentA;}
	    
	     while(currentA !=null || currentB!=null)
	       {
	         if(currentReturned==null)
	           {
	        	 returnedList=new Node();
	        	 currentReturned=returnedList;
	           }
	         else
	           {
	        	 currentReturned.next=new Node();
	        	 currentReturned=currentReturned.next;
	           } 
	    	 if(currentA==null)
	    	   {
	    		  currentReturned.data=currentB.data;
	        	  currentB=currentB.next;
	        	  currentReturned.next=null;
	    	   }
	    	 else if(currentB==null)
	    	   {
	    		  currentReturned.data=currentA.data;
	        	  currentA=currentA.next;
	        	  currentReturned.next=null;
	    	   }
	    	 else
	    	   { 
	           if( currentA.data < currentB.data)
	             {
	        	  currentReturned.data=currentA.data;
	        	  currentA=currentA.next;
	        	  currentReturned.next=null;
	             } 
	           else
	             {
	        	  currentReturned.data=currentB.data;
	        	  currentB=currentB.next;
	        	  currentReturned.next=null;
	             }
	    	   }
	        }
	   return   returnedList;
	}

}
