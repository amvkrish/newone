
public class Students_Thread {

public static void main(String[] args) {
	  // TODO Auto-generated method stub
		 
	  student1 s1 = new student1("Radha");
	  student2 s2 = new student2("Krishna");
	  
	  s1.start();
	  s2.start();
	 }
}
class student1 implements Runnable {
	
	 private Thread work;
	 private String stname;
	 
	 student1(String name) {
	  stname = name;
	 }
	 
	 public void start() {
		  System.out.println("\"project work started\"");
		  
		  if (work == null) {
			  work = new Thread(this, stname);
			  work.start();
		  }
	}
	 public void run() {
	  System.out.println("work shared by\t" + stname);
	  
	  for (int i = 0; i < 4; i++) {
	   System.out.println(i);
	   System.out.println(stname);
	   try {
		   Thread.sleep(500);
	   		} 
	   catch (Exception ie) {
		   System.out.println("work has been interrupted");
	   		}
	  }
}
	
}
	
class student2 implements Runnable {
	
		 private Thread work;
		 private String stname;
		 student2(String name) {
		  stname = name;
	}
		
		public void run() {
			
		  System.out.println("work shared by\t" + stname);
		  
		  for (int i = 0; i < 10; i++) {                     //increased to 10 
		   System.out.println(i);
		   System.out.println(stname);
		   	try {
		   		Thread.sleep(1000);								// time also increased in this thread
		   		} 	
		   	catch (Exception ie) {
		    System.out.println("work has been interrupted");
		   }
	}
}
		public void start() {
			
		  System.out.println("\"project work started\"");
		  
		  if (work == null) {
			  work = new Thread(this, stname);
			  work.start();
		  }
	 }
}
	
	
			
			
			
		

	