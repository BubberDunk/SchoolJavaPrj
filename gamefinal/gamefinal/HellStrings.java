package gamefinal;

import java.util.Scanner;

public class HellStrings {
	static Scanner scnr = new Scanner(System.in);
	final static String GAMEINTRO1 = "! This is a trivia-based adventure game. "
			+ "There are four rooms available, each with trivia on a different topic.\n"
			+ "You have to answer all the questions before you can get to the final room.\n";
	final static String GAMEINTRO2 = "Each question will allow you to bet some of your hard-earned COINS on the answer.\n"
			+ "[INSERT EXPLANATION OF HOW THAT WORKS]. You have 10 coins in your pocket right now.\n"
			+ "What, where did you get them?\nHow should I know! You have a job, don't you?\n";
	final static String JOKESONYOU = "I'm kidding, I don't care.\n";
	final static String HOWTOPLAY = "At any time you're prompted to give input, you can SAVE your game, QUIT your game, RESTART your game, or see your INVENTORY.\n"
			+ "Those commands are, respectively, 'save', 'quit', 'restart', and 'inventory'. Why don't you try opening your inventory?\n";
	final static String WHERETONOW = "There are four doors in front of you.\n"
			+ "Door 1:\n"
			+ "Door 2:\n"
			+ "Door 3: This door is painted pink, with little rainbow slashes all over it. "
			+ "From a certain angle, it looks kind of like a Pop-tart.\n"
			+ "The handle is a silver curl, like an unwinding ball of yarn, and extends half the door's width. "
			+ "Weird.\n"
			+ "Door 4:\n"; //EVERYONE DESCRIBE YOUR DOORS
			
			
	public static void getGameIntro() {
		System.out.print("Hello, " + User.getUserName() + GAMEINTRO1);
		scnr.nextLine();
		System.out.print(GAMEINTRO2);
	}
	
	public static void getJokes() {
		System.out.print(JOKESONYOU);
		scnr.nextLine();
		System.out.print(HOWTOPLAY);
	}
	
	public static void doorMenu() {
		System.out.print(WHERETONOW);
		scnr.nextLine();
		System.out.println("Which number would you like to enter?");
	}
	
	
	
	public HellStrings() {
		//initialized just to have it, this is only a storage space
	}

}
