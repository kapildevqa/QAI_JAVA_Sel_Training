package JAVAT;

class Student{  
	 int rollno = 111;  
	 String name = "kapil";
	 
	  
	void insertRecord(int r, String n, String f){  //method  
	  rollno=r;  
	  name=n; 
	  fname=f;
	 } 
	  
	 void displayInformation(){System.out.println(rollno+" "+name);}//method  
	  
	 public static void main(String args[]){  
	 Student s1=new Student();  
	 Student s2=new Student();  
	  
	 System.out.println(s1.rollno);
	 System.out.println(s2.name);
	  System.out.println(rollno);
	  System.out.println(name);
	  
	  //s1.insertRecord(111,"Karan","Sap");  
	  //s2.insertRecord(222,"Aryan","Sapc");  
	  
	  //s1.displayInformation();  
	  //s2.displayInformation();  
	  
	 }  
	}