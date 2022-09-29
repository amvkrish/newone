
public class RunPoly2 extends RunPoly1 {
	
	void run() {
		
		System.out.println("with a speed of 100km per hour");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunPoly1 r = new RunPoly1();                   
		r.run();
		
		RunPoly1 n = new RunPoly2();                    //UPCASTING 
		n.run();
		
	}

}
