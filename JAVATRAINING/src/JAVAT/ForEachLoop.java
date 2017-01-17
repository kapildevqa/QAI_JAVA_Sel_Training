package JAVAT;

/*ForEachLoop
public class ForEachLoop {

	public static void main(String[] args) {  
	   int array[]={12,23,44,56,78};  
	    for(int i:array){  
	       System.out.println(i);  
	  }  
	}  
	}*/ 

//For Labeled Loop
	/*public class ForEachLoop {  
		public static void main(String[] args) {  
		    aa:  
		        for(int i=1;i<=4;i++){  
		            bb:  
		                for(int j=1;j<=4;j++){  
		                   		                     		                     
		                    System.out.println(i+" "+j);  
		                }  
		        }  
		}  
		}*/

// while loop in Java
/*public class ForEachLoop {  
public static void main(String[] args) {  
    int i=1;  
    while(i<=10){  
        System.out.println(i);  
    i++;  
    }  
}  
}*/
//Do while loop
/*public class ForEachLoop {  
public static void main(String[] args) {  
    int i=9;  
    do{  
        System.out.println(i);  
    i--;  
    }while(i>=5);  
}  
} */

//

/*public class ForEachLoop {  
public static void main(String[] args) {  
            for(int i=1;i<=3;i++){    
                    for(int j=1;j<=3;j++){    
                        if(i==1&&j==1){    
                            break;    
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }    
}  
} */


class ForEachLoop{  
	 int id = 35;//data member (also instance variable)  
	 String name = "kapil";//data member(also instance variable)  
	  
	 public static void main(String args[]){  
	  ForEachLoop s1=new ForEachLoop();//creating an object of Student  
	  System.out.println(s1.id);  
	  System.out.println(s1.name);  
	 }  
	}