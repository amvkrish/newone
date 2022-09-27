import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter Old ATM PIN number:");
		String a = input.nextLine();
		
		if(a == "") {
			System.out.println("INVALID \nGo back and try again");
			return;
		}
		if( a.matches("!@#$%^")) {
		
			System.out.println("SPECIAL CHARECTERS NOT ALLOWED");
			return;
		}
		System.out.println("enter new PIN number");
		int b = input.nextInt();
		
		System.out.println("confirm new PIN number");
		int c = input.nextInt();
		
		if(b == c) {
		System.out.println("ATM PIN number confirmed succcesfully");
	
		}  if(b != c) {
		System.out.println("the entered PIN number obsereved mismatch \n Please enter the same PIN number");

		}
		}}
//		
//		System.out.println("welcome to the \n~ONE DAY INTERNATIONAL~");
//		String delay1 = input.nextLine();
//		
//		System.out.println(" Enter the name of Team1:");
//		String team1 = input.nextLine();
//
//	
//		System.out.println(" Enter the name of Team2:");
//		String team2 = input.nextLine();
//		
//		System.out.println("you have slected the following teams:");
//		System.out.println(team1);
//		System.out.println(team2);
//		
//		String delay2 = input.nextLine();
//		System.out.println("Match Overs should be = 50 overs");
//		
	
		
		
		
		
//	}}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		