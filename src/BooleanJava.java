
public class BooleanJava {

	public static void main(String[] args) {			
//		
//		int a = 0;
//		
//		boolean b = a == 1;
//		System.out.println(b);
//		
//		boolean b1 = (a == 0);
//		System.out.println(b1);
		
//		if(true) {
//			System.out.println("it will be printed when only true ");
//		}
																				
		boolean passedDoor = true;
		boolean missedDoor = false;
		boolean passedAllDoors = false;
		int doorcount = 0;
		
		if(passedDoor) {
			System.out.println("we passed the first door ");
			doorcount = doorcount + 1;
		}
		if(passedDoor) {
			System.out.println("we passed the second door");
			doorcount = doorcount + 1;
		}
		if(passedDoor) {
			System.out.println("we passed the third door");
			doorcount = doorcount + 1;
		}
		if(doorcount ==3) {
			passedAllDoors = true;
		}
		
		if(passedAllDoors) {
			System.out.println("congratulations you won the programm ");
		}
	}
	
}

//boolean firstseet = true;
//boolean secondseet = false;
//int  a = 0;
//
//		
//	if(firstseet ) {
//		System.out.println("1st seat filled");
//		a = a + 1;
//	}
//
//	if(firstseet) {
//		System.out.println("2st seat filled");
//		a = a + 1;
//	}
//if(a  ==2) {
//secondseet = true;
// 
//if(secondseet) {
//	System.out.println("all seats are filled");
//}
//}
//}
//}

