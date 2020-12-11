package gamefinal;

import java.util.Scanner;

public class HellStrings {
	static Scanner scnr = new Scanner(System.in);
	final static String GAMEINTRO1 = "! This is a trivia-based adventure game. "
			+ "There are four rooms available, each with trivia on a different topic.\n"
			+ "You have to answer all the questions before you can get to the final room. (Press enter to continue)\n";
	final static String GAMEINTRO2 = "Each question will allow you to bet some of your hard-earned COINS on the answer.\n"
			+ "[INSERT EXPLANATION OF HOW THAT WORKS]. You have 10 coins in your pocket right now.\n"
			+ "What, where did you get them?\nHow should I know! You have a job, don't you?\n";
	final static String JOKESONYOU = "I'm kidding, I don't care.\n";
	final static String HOWTOPLAY = "At any time you're prompted to give input, you can SAVE your game, QUIT your game, RESTART your game, see your INVENTORY or get HELP\n"
			+ "Those commands are, respectively, 'save', 'quit', 'restart', 'inventory' and 'help'. Why don't you try opening your inventory?\n";
	final static String WHERETONOW = "There are four doors in front of you.\n"
			+ "Door 1:\n"
			+ "Door 2: This door is made of deep red cedar, with inset panals hand-carved into it.\n"
			+ "There's no door knob; the door is instead hung on a rolling track with an inset metal disk where the handle would be.\n"
			+ "When you bend down to take a look, you find that it is ornately worked copper in a Missisipean design.\n";
	final static String WHERETONOW2 = "Door 3: This door is painted pink, with little rainbow slashes all over it. "
			+ "From a certain angle, it looks kind of like a Pop-tart.\n"
			+ "The handle is a silver curl, like an unwinding ball of yarn, and extends half the door's width. Weird.\n"
			+ "Door 4:This door appears to be made out of...cardboard? Yes it looks like the top of a cardboard box, with two flaps taped together, sealing the enterance\n"; //EVERYONE DESCRIBE YOUR DOORS
			+ "\nWhich Door would you like to enter? [1-4]\n";
	final static String BOUNCER = "The screen fills with an enormous red 'X', an unpleasant blare sounding. Words flash overtop the X:"
			+ "\nNO REPEATS";
	final static String SECRETTUNNEL = "Wait, what's this? As you survey the other doors, trying to decide which one to return to (and presumably wait to die, you haven't noticed an exit),"
			+ "\nyou realize there's a fifth door, set into a different wall than the other four. How did you fail to see that before? You could swear you looked all around this place."
			+ "\nThis door is shimmering faintly, and there is a ring of stars inset at the top. Might as well try DOOR 5.";
	final static String HELP = "\nHere are some things you can do:\nsave\nquit\nrestart\ninventory\nif you want to examine something, try typing it's name. "; 
								//^make sure this is ubiquitious for all situations
			
	
	//introduce the game through a series of repeatable blocks
	public static void getGameIntro() {
		System.out.print(GAMEINTRO1);
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
		System.out.print(WHERETONOW2);
	}
	
	public static void bouncer() {
		System.out.print(BOUNCER);
	}
	
	public static void secretTunnel() {
		System.out.print(SECRETTUNNEL);
	}
	
	
	public HellStrings() {
		//initialized just to have it, this is only a storage space
	}

}
