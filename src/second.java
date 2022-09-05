import java.util.Scanner;

public class second {

	public static void main(String[] args) {
	
		Scanner type = new Scanner(System.in);
	
	System.out.println(" \"here the cricket players list\" ");
	System.out.println("for this\t you enter name here \\ \\ \\  ");
		
	System.out.println("Enter player 1:");
	String player1 = type.nextLine();
	
	System.out.println("Enter player 2:");
	String player2 = type.nextLine();
	System.out.println("Enter player 3:");
	String player3 = type.nextLine();
	System.out.println("Enter player 4:");
	String player4 = type.nextLine();
	System.out.println("Enter player 5:");
	String player5 = type.nextLine();
	
	System.out.println("list of players");
	System.out.println(player1);
	System.out.println(player2);
	System.out.println(player3);
	System.out.println(player4);
	System.out.println(player5);
	}
}