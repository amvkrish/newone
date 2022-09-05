import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the grade:");
		int n = scan.nextInt();							//instead of "string n = scan.nextLine();" we r taking int to write number 
		
		System.out.println(n);
		
		if( n >= 90 && n <=100) {
			System.out.println("A");
			}
		else if( n >= 80 && n < 90) {
			System.out.println("B");
			}
		else if( n >= 70 && n < 80) {
			System.out.println("C");
			}
		else if( n >= 65 && n < 70) {
			System.out.println("D");
			}
		else if( n >= 0 && n < 65) {
			System.out.println("F");
			
		}else {
			System.out.println("the no u entered is not in the range");
		}
	}
}
		