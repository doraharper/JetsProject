package jetsproject;

import java.util.Scanner;

public class JetsApplication {
	// User story #1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AirField af = new AirField();

		int choice;

		String menuArray[] = { "1. List Fleet", "2. Fly all jets", "3. View fastest jet",
				"4. View jet with longest range", "5. Load all Cargo Jets", "6. Dogfight!", "7. Add a jet to Fleet",
				"8. Quit" };
	//	System.out.println("Choose from the following: \n");
		
		
		do {
			System.out.println("Choose from the following: \n");

			for (int i = 0; i < menuArray.length; i++) {
				System.out.println(menuArray[i]);
		} 
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				af.listJets();
				break;
			case 2:
				af.makeJetsFly();
				break;
			case 3:
				af.getFastest();
				break;
			case 4:
				af.getLongestRange();
				break;
			case 5:
				System.out.println();
				break;
			case 6:
				System.out.println();
				break;
			case 7:
				af.addJet();
				break;
			case 8:
				break;
			}
		
		} while (choice != 8);
		System.out.println("Bye!!");
	}

}
