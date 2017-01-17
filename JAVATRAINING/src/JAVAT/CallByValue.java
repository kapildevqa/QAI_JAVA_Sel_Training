package JAVAT;

public class CallByValue {
		 int data=50;  
		  
		 void change(int data){  
		 data=data+100;//changes will be in the local variable only  
		 }  
		     
		 public static void main(String args[]){  
		   CallByValue op=new CallByValue();  
		  
		   System.out.println("before change "+op.data);  
		   op.change(500);  
		   System.out.println("after change "+op.data);  
		  
		 }  
		} 

//Call by object reference

class Operation2{  
	 int data=50;  
	  
	 void change(Operation2 op){  
	 op.data=op.data+100;//changes will be in the instance variable  
	 }  
	     
	    
	 public static void main(String args[]){  
	   Operation2 op=new Operation2();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(op);//passing object  
	   System.out.println("after change "+op.data);  
	  
	 }  
	}
