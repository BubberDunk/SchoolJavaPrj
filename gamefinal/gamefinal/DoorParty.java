package gamefinal;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DoorParty {
	static Scanner scnr = new Scanner(System.in);
	static String userInput;
	final static String DOOR1PARTY = ""; //fill these in in the template of door3
	final static String DOOR1ITEMS = "";
	final static String DOOR2PARTY = ""; //fill these in in the template of door3
	final static String DOOR2ITEMS = "";
	final static String DOOR3PARTY = "You press down on the absurd door handle and enter the room. The interior is... well, I don't know what you expected.\n"
			+ "You're the one who picked the Pop-tart room. The walls are a diabetic shade of pink; the floor is bubblegum shag carpet.\n"
			+ "Every square inch of the space is covered in cat paraphernalia. Cat posters on the walls, cat plushies on the floor, etc.\n"
			+ "You look around, but are relieved to see no actual cats. Those would make a mess.\n";
	final static String DOOR3ITEMS = "On the far wall, the tail of a cat clock swings back and forth, its eyes flicking with the trajectory.\n"
			+ "In the center of the room, there's a round, blue kiddy pool full of cat-shaped beanbags.\n"
			+ "To your right, there's a hole disappearing into the shag carpet. The interior of the hole also appears to be carpeted.\n"
			+ "And, of course, there's the trivia machine.\n";
	final static String DOOR4PARTY = ""; //fill these in in the template of door3
	final static String DOOR4ITEMS = "";
	final static String ITEMPROMPT = "Several items catch your attention:\n";
	final static String ITEMINTERACT = "Do you want to look at any of them? Type 'exit' to exit.\n";
	
	
	public static void door3Intro() throws FileNotFoundException {
		System.out.print(DOOR3PARTY);
		scnr.nextLine();
		door3Cycle();
	}
	
	public static void door3Interact(String investigate) throws FileNotFoundException {
		String userInput;
		
		if (investigate.contains("clock")) {
			System.out.println("You approach the cat clock. It's avoiding your gaze. You watch for a while, and, despite the motion of the second hand, the time doesn't change.\n"
					+ "10:15 pm. If you say so. You turn back to the rest of the room.\n");
			userInput = scnr.nextLine();
			door3Interact(userInput);
		}
		
		else if (investigate.contains("pool")) {
			System.out.println("You lower yourself down into the pool. Ooh! Fuzzy! Squishy! The kitties are so cute!\n"
					+ "You spend a few minutes rolling around. You get out feeling refreshed and glad no one is watching.\n");
			userInput = scnr.nextLine();
			door3Interact(userInput);
		}
		
		else if (investigate.contains("hole")) {
			System.out.println("You look into the hole. Your face blocks the light. You see nothing.\n"
					+ "You put your ear to the hole. You think you hear faint, distant meowing. Ominous.\n"
					+ "You stand back up.\n");
			userInput = scnr.nextLine();
			door3Interact(userInput);
		}
		
		else if (investigate.contains("trivia")) {
			//CALL TRIVIA STUFF IN TRIVIA CLASS
		}
		
		else if (investigate.contains("exit")) {
			System.out.println("You leave the room.\n");
			FinalMain.doorIntro();
		}
		
		else {
			System.out.println("Huh? Do you want a reminder of your options?");
			userInput = scnr.nextLine();
			
			if (userInput.charAt(0) == 'y') {
				door3Cycle();
			}
			
			else {
				System.out.println();
				userInput = scnr.nextLine();
				door3Interact(userInput);
			}
		}
	}
	
	public static void door3Cycle() throws FileNotFoundException {
		System.out.print(ITEMPROMPT);
		System.out.print(DOOR3ITEMS);
		scnr.nextLine();
		System.out.print(ITEMINTERACT);
		userInput = scnr.nextLine();
		FinalMain.saveMenu(userInput);
		door3Interact(userInput);
	}
	
	public DoorParty() {
	//doorparty initialized
	}

}