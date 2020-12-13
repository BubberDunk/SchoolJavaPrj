package gamefinal;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DoorParty {
	static Scanner scnr = new Scanner(System.in);
	static String userInput;
	final static String DOOR4PARTY = ""; //fill these in in the template of door3
	final static String DOOR4ITEMS = "";
	final static String DOOR2PARTY = "\nYou appreciate the craftsmanship which went into this door as you slide it open. Comfortable chairs around a circular table fill most of the room.\n"
			+ "There are a variety of posters tacked onto the walls, three of which are a pleasant cream color, one of which has clearly been painted by many artists.\n"
			+ "One corner of the room has been set up in a manner appropriate for children, with a changing station and toys spread across a small mat.\n";
	final static String DOOR2ITEMS = "The table in the center of the room has a STICK on it, with a tassel hanging off the end.\n"
			+ "There's a large FLAG dominating one wall, brightly colored and pleasant to look at.\n"
			+ "Spread out in a display case set beside a bookshelf is what looks like a MAP. You can't see what of from here.\n"
			+ "And, of course, there's the TRIVIA machine.";
	final static String DOOR3PARTY = "\nYou press down on the absurd door handle and enter the room. The interior is... well, I don't know what you expected.\n"
			+ "You're the one who picked the Pop-tart room. The walls are a diabetic shade of pink; the floor is bubblegum shag carpet.\n"
			+ "Every square inch of the space is covered in cat paraphernalia. Cat posters on the walls, cat plushies on the floor, etc.\n"
			+ "You look around, but are relieved to see no actual cats. Those would make a mess.\n";
	final static String DOOR3ITEMS = "On the far wall, the tail of a cat CLOCK swings back and forth, its eyes flicking with the trajectory.\n"
			+ "In the center of the room, there's a round, blue kiddy POOL full of cat-shaped beanbags.\n"
			+ "To your right, there's a HOLE disappearing into the shag carpet. The interior of the hole also appears to be carpeted.\n"
			+ "And, of course, there's the TRIVIA machine."; 
	final static String DOOR1PARTY = "Like the door, nothing is right in this room. there are 3 bowls on the floor, seemingly randomly placed.c\n"
			+ "you sink to the floor in horror when you wonder what could be in each bowl.\n"
			+ "after several hours, you crawl toward the unholy arrangement"; //fill these in in the template of door3
	final static String DOOR1ITEMS = "In the first bowl is a GIRAFFE, the second contains a COUPON for taco bell, and the third contained a smaller BOWL. "
			+ "\nthere was nothing inside the second bowl."
			+ "\nthere is also this TRIVIA machine in the corner covered in rare and collectable strip club bumber stickers from across the country.";
	final static String ITEMPROMPT = "\nSeveral items catch your attention:\n";
	final static String ITEMINTERACT = "\nDo you want to look at anything? Type help to pull up a list of things you can do.\n";
	
	//Introduce Room 2
	public static void door2Intro() throws FileNotFoundException {
			System.out.print(DOOR2PARTY);
			scnr.nextLine();
			door2Cycle();
	}
	
	//Allows for door2 items to be run multiple times without running the intro
	public static void door2Cycle() throws FileNotFoundException {
			System.out.print(ITEMPROMPT);
			System.out.print(DOOR2ITEMS);
			scnr.nextLine();
			System.out.print(ITEMINTERACT);
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			door2Interact(userInput);
	}
	
	//Room 2 exploration ability
	public static void door2Interact(String investigate) throws FileNotFoundException {
		String userInput;

		if (investigate.contains("stick")) {
			System.out.println("\nYou weave between the chairs and pick up the stick. The tassel swings as you do, brushing against your hand.\n"
					+ "On the side of the stick you can see the words 'talking stick', and then a bunch of things you can't read.\n"
					+ "The same thing in other languages, you assume. That's cool.");
			System.out.println(ITEMINTERACT);
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			door2Interact(userInput);
		}
		else if (investigate.contains("flag")) {
			System.out.println("\nYou go to the wall and look at the flag. It's a rainbow, but there are a black and brown lines on top of it.\n"
					+ "Inset on the left is a triangle in pink, blue, and white. You're glad everyone is being included.");
			System.out.println(ITEMINTERACT);
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			door2Interact(userInput);
		}
		else if (investigate.contains("map")) {
			System.out.println("\nYou notice a light beside the display case and flick it on. It illuminates a map of the Pacific Northwest.\n"
					+ "Instead of states, the map shows indigenous territory from before the American continents were colonized.\n"
					+ "You spend some time appreciating the history of the people and land.");
			System.out.println(ITEMINTERACT);
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			door2Interact(userInput);
		}
		else if (investigate.contains("trivia")) {//someone who is better at writing feel encouraged to make this sound better lol
			System.out.println("You look up at the enormous machine before you. You go to touch it but before you get the chance to a large screen lights up with the words:"
			+"\n'I'm trivia machine: wanna play? Y/N' displayed." );
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			userInput.toLowerCase();
			if(userInput.contains("y")){ 
				FinalMain.roomCheck(2);
				System.out.println("\nYou take a step back and survey the room.");
				userInput = scnr.nextLine();
				FinalMain.saveMenu(userInput);
				door2Interact(userInput);
			}else if(userInput.contains("n")){
				System.out.println("You type N and the machine shuts off");
				userInput = scnr.nextLine();
				FinalMain.saveMenu(userInput);
				door2Interact(userInput);
			}else{
				System.out.println("You type '" + userInput + "' the machine makes a loud noise and the word ERROR is output to the screen"); 
				door2Interact(investigate);
			}

		}
		else if (investigate.contains("exit")) {
			System.out.println("\nYou leave the room.\n");
			FinalMain.doorIntro();
		}
		else if (investigate.contains("room")) {
			System.out.println("\nHuh? Do you need me to describe the room AGAIN??");
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			
			if (userInput.charAt(0) == 'y') {
				System.out.println("\nOkay... be sure to listen this time.");
				door2Cycle();
			}
			else{
				System.out.println("\nWell, well. SOMEbody is indecisive today aren't they...\n");
				userInput = scnr.nextLine();
				door2Interact(userInput);	
			}
		}
		else if (investigate.contains("help") || investigate.contains("inventory") || investigate.contains("save") || investigate.contains("restart") || investigate.contains("quit")) {
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			door2Interact(userInput);
		}
		else {
			System.out.println("\nI didn't understand that (remember enter 'help' to bring up a list of things you can do)");
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			door2Interact(userInput);
			}
	}
	
	//Introduce Room 3
	public static void door3Intro() throws FileNotFoundException {
		System.out.print(DOOR3PARTY);
		scnr.nextLine();
		door3Cycle();
	}
	
	//Room 3 exploration ability
	public static void door3Interact(String investigate) throws FileNotFoundException {
		String userInput;

		if (investigate.contains("clock")) {
			System.out.println("\nYou approach the cat clock. It's avoiding your gaze. You watch for a while, and, despite the motion of the second hand, the time doesn't change.\n"
					+ "10:15 pm. If you say so. You turn back to the rest of the room.");
			System.out.println(ITEMINTERACT);
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			door3Interact(userInput);
		}
		else if (investigate.contains("pool")) {
			System.out.println("\nYou lower yourself down into the pool. Ooh! Fuzzy! Squishy! The kitties are so cute!\n"
					+ "You spend a few minutes rolling around. You get out feeling refreshed and glad no one is watching.");
			System.out.println(ITEMINTERACT);
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			door3Interact(userInput);
		}
		else if (investigate.contains("hole")) {
			System.out.println("\nYou look into the hole. Your face blocks the light. You see nothing.\n"
					+ "You put your ear to the hole. You think you hear faint, distant meowing. Ominous.\n"
					+ "You stand back up.");
			System.out.println(ITEMINTERACT);
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			door3Interact(userInput);
		}
		else if (investigate.contains("trivia")) {
			System.out.println("You look up at the enormous machine before you. You go to touch it but before you get the chance to a large screen lights up with the words:"
				+"\n'I'm trivia machine: wanna play? Y/N' displayed." );
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			userInput.toLowerCase();
			if(userInput.contains("y")){ 
				FinalMain.roomCheck(3);
				System.out.println("\nYou take a step back and survey the room.");
				userInput = scnr.nextLine();
				FinalMain.saveMenu(userInput);
				door3Interact(userInput);
			}else if(userInput.contains("n")){
				System.out.println("You type N and the machine shuts off");
				userInput = scnr.nextLine();
				FinalMain.saveMenu(userInput);
				door3Interact(userInput);
			}else{
				System.out.println("You type '" + userInput + "' the machine makes a loud noise and the word ERROR is output to the screen"); 
				door3Interact(investigate);
			}
		}

		else if (investigate.contains("exit")) {
			System.out.println("\nYou leave the room.\n");
			FinalMain.doorIntro();
		}
		else if (investigate.contains("room")) {
			System.out.println("\nHuh? Do you need me to describe the room AGAIN??");
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			
			if (userInput.charAt(0) == 'y') {
				System.out.println("\nOkay... be sure to listen this time");
				door3Cycle();
			}
			else{
				System.out.println("\nWell well SOMEbody is indecisive today aren't they..\n");
				door3Interact(userInput);	
			}
		}
		else if (investigate.contains("help") || investigate.contains("inventory") || investigate.contains("save") || investigate.contains("restart") || investigate.contains("quit")) {
			userInput = scnr.nextLine();
			door3Interact(userInput);
			FinalMain.saveMenu(userInput);
		}
		else {
			System.out.println("\nI didn't understand that (remember enter 'help' to bring up a list of things you can do)");
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			door3Interact(userInput);
			}
		}
	
	//Allows for door3 items to be run multiple times without running the intro
	public static void door3Cycle() throws FileNotFoundException {
		System.out.print(ITEMPROMPT);
		System.out.print(DOOR3ITEMS);
		scnr.nextLine();
		System.out.print(ITEMINTERACT);
		userInput = scnr.nextLine();
		FinalMain.saveMenu(userInput);
		door3Interact(userInput);
	}
	
	public static void door1Intro() throws FileNotFoundException {
		System.out.print(DOOR1PARTY);
		scnr.nextLine();
		door1Cycle();
}

//Allows for door1 items to be run multiple times without running the intro
public static void door1Cycle() throws FileNotFoundException {
		System.out.print(ITEMPROMPT);
		System.out.print(DOOR1ITEMS);
		scnr.nextLine();
		System.out.print(ITEMINTERACT);
		userInput = scnr.nextLine();
		FinalMain.saveMenu(userInput);
		door1Interact(userInput);
}

//Room 1 exploration ability
public static void door1Interact(String investigate) throws FileNotFoundException {
	String userInput;

	if (investigate.contains("giraffe")) {
		System.out.println("the giraffe asks you for your name.\n"
				+ "you say nothing, stunned");
		System.out.println(ITEMINTERACT);
		userInput = scnr.nextLine();
		FinalMain.saveMenu(userInput);
		door1Interact(userInput);
	}
	else if (investigate.contains("coupon")) {
		System.out.println("you grab the coupon and turn, only to see a large sentient taco brandishing a whip. \n"
				+ "you drop the coupon and the menacing taco disappears instantly");
		System.out.println(ITEMINTERACT);
		userInput = scnr.nextLine();
		FinalMain.saveMenu(userInput);
		door1Interact(userInput);
	}
	else if (investigate.contains("bowl")) {
		System.out.println("The bowl speaks to you when you pick it up"
				+ "you find that life finally makes sense.");
		System.out.println(ITEMINTERACT);
		userInput = scnr.nextLine();
		FinalMain.saveMenu(userInput);
		door1Interact(userInput);
	}
	else if (investigate.contains("trivia")) {//someone who is better at writing feel encouraged to make this sound better lol
		System.out.println("You look up at the glitter-covered machine before you. You go to touch it but before you get the chance to a large screen lights up with the words:"
		+"\n'I'm trivia machine: wanna play? Y/N' displayed." );
		userInput = scnr.nextLine();
		FinalMain.saveMenu(userInput);
		userInput.toLowerCase();
		if(userInput.contains("y")){ 
			FinalMain.roomCheck(1);
			System.out.println("\nYou take a step back and survey the room.");
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			door1Interact(userInput);
		}else if(userInput.contains("n")){
			System.out.println("You type N and the machine shuts off");
			userInput = scnr.nextLine();
			FinalMain.saveMenu(userInput);
			door1Interact(userInput);
		}else{
			System.out.println("You type '" + userInput + "' the machine makes a loud noise and the word ERROR is output to the screen"); 
			door1Interact(investigate);
		}

	}
	else if (investigate.contains("exit")) {
		System.out.println("\nYou leave the room.\n");
		FinalMain.doorIntro();
	}
	else if (investigate.contains("room")) {
		System.out.println("\nHuh? Do you need me to describe the room AGAIN??");
		userInput = scnr.nextLine();
		FinalMain.saveMenu(userInput);
		
		if (userInput.charAt(0) == 'y') {
			System.out.println("\nOkay... be sure to listen this time.");
			door1Cycle();
		}
		else{
			System.out.println("\nWell, well. SOMEbody is indecisive today aren't they...\n");
			userInput = scnr.nextLine();
			door1Interact(userInput);	
		}
	}
	else if (investigate.contains("help") || investigate.contains("inventory") || investigate.contains("save") || investigate.contains("restart") || investigate.contains("quit") || investigate.contains("save") || investigate.contains("restart") || investigate.contains("quit")) {
		userInput = scnr.nextLine();
		FinalMain.saveMenu(userInput);
		door1Interact(userInput);
	}
	else {
		System.out.println("\nI didn't understand that (remember enter 'help' to bring up a list of things you can do)");
		userInput = scnr.nextLine();
		FinalMain.saveMenu(userInput);
		door1Interact(userInput);
		}
}
	
	public DoorParty() {
	//doorparty initialized
	}

}