import java.util.Scanner;

public class inputfromuser {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	/*we r gonna get input from the user with this called scanner (LHS)
	 * & we r gonna get the input frm user with console so that here system.in means (RHS)
	 * and scanner is underlined because we need to tell java hey wer gonna be getting the inp frm user with the scanner 
	 * so wer kind of set up like import.java.util.scanner;
	 * so lets ask user or ourselves 
	 * we ll tell user to enter something & we ll enter Pokemon party
	 */
												//and store it into variable called pokemon 1, so thats gonna be a string
		System.out.println("Enter pokemon 1:");		
		String pokemon1 = scan.nextLine();
		
		System.out.println("Enter pokemon 2:");		
		String pokemon2 = scan.nextLine();
		System.out.println("Enter pokemon 3:");		
		String pokemon3 = scan.nextLine();
		System.out.println("Enter pokemon 4:");		
		String pokemon4 = scan.nextLine();
		System.out.println("Enter pokemon 5:");		
		String pokemon5 = scan.nextLine();
		System.out.println("Enter pokemon 6:");		
		String pokemon6 = scan.nextLine();
		
		System.out.println("here are ur pokemon:");
		System.out.println(pokemon1);
		System.out.println(pokemon2);
		System.out.println(pokemon3);
		System.out.println(pokemon4);
		System.out.println(pokemon5);
		System.out.println(pokemon6);
	} 

}
