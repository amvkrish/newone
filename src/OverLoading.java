
public class OverLoading {

	public int  sum( int a, int b) {
		
	return( a + b );
	}
	
	public double sum (double a, double b) {
		
		return( a + b );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoading o =  new OverLoading();
		
		System.out.println(o.sum(21, 14));
		System.out.println(o.sum(11, 16));
		System.out.println(o.sum(50, 14));
	}

}
