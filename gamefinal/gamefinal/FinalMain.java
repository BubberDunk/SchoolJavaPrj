package gamefinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FinalMain {
	static Scanner scnr = new Scanner(System.in);
	static User player1 = new User();
	static User ghost = new User("opponent", 10, 0, 0, 0, 0, false, false, false, false);
	

	public static void main(String[] args) throws FileNotFoundException {
		gameStart();
		doorIntro();
	}
	
	//loads or starts the game
	public static void gameStart() throws FileNotFoundException {
		System.out.println("Welcome to the game! Are you new here?");
		String userInput = scnr.nextLine();
		
		if (userInput.compareToIgnoreCase("no") == 0) {
			System.out.println("What is the name of your previous save?");
			userInput = scnr.nextLine();
			loadGame(userInput);
		}
		
		else {
			//this part is just the beginning of the game
			userIntro(); //prompts for user name
			System.out.print("Hello, " + player1.getUserName());
			HellStrings.getGameIntro(); //introduces game
			scnr.nextLine();
			HellStrings.getJokes();
			userInput = scnr.nextLine();
			player1.setUserCoins(10); //initializing moneys
			saveMenu(userInput);
			System.out.println("Great! Now let's start the game.");
			userInput = scnr.nextLine();
			saveMenu(userInput);
			
		}
	}
	
	//gets and saves name of user in User
	public static String userIntro() {
        
        System.out.println("Enter your name.");
        String userName = scnr.nextLine();
        player1.setUserName(userName);
        return userName;
    }
	
	//Introduces the options from the main room
	public static void doorIntro() throws FileNotFoundException {
		String doorChoice;
		HellStrings.doorMenu(); //allows for choice between the trivia doors
		if ((player1.getRoom1() == true) && (player1.getRoom2() == true) && (player1.getRoom3() == true) && (player1.getRoom4() == true)) {
			HellStrings.secretTunnel();
		}
		doorChoice = scnr.nextLine();
		doorLoop(doorChoice);
	}
	
	//branching menu allowing user to select a door or to fuck up and not select a door
	public static void doorLoop(String doorChoice) throws FileNotFoundException {
		if ((player1.getRoom1() == true) && (player1.getRoom2() == true) && (player1.getRoom3() == true) && (player1.getRoom4() == true)) {
			if (doorChoice.contains("5")) {
				//door5 stuff
			}
			else {
				doorChoice(doorChoice);
			}
		}
		else {
			if (doorChoice.isEmpty()) {
				badChoice(); }
			else {
				doorChoice(doorChoice);
			}
		}
	}
	
	//regular door selection loop.
	public static void doorChoice(String doorChoice) throws FileNotFoundException {
		if (doorChoice.contains("1")) {
			//door1 zone
		}
		else if (doorChoice.contains("2")) {
			DoorParty.door2Intro();
		}
		else if (doorChoice.contains("3")) {
			DoorParty.door3Intro();
		}
		else if (doorChoice.contains("4")) {
			//door4 zone
		}
		else {
			badChoice();
		}
	}
	
	//when user fucks up and does not select a door
	public static void badChoice() throws FileNotFoundException {
		System.out.println("Where do you think YOU'RE going? Please pick a door number.");
		String doorAgain = scnr.nextLine();
		doorLoop(doorAgain);
	}
	
	//tells you if you're allowed to run this trivia
	public static void roomCheck(int triviaRoom) throws FileNotFoundException {
		if (triviaRoom == 1) {
			if (player1.getRoom1() == false) {
				triviaIntro(triviaRoom);
			}
			else {
				HellStrings.bouncer();
			}
		}
		else if(triviaRoom == 2) {
			 if (player1.getRoom2() == false) {
				 triviaIntro(triviaRoom);
			 }
			 else {
				HellStrings.bouncer();
				}
		}
		else if(triviaRoom == 3) {
			if (player1.getRoom3() == false) {
				 triviaIntro(triviaRoom);
			 }
			else {
				HellStrings.bouncer();
			}
		}
		else if(triviaRoom == 4) {
			if (player1.getRoom4() == false) {
				 triviaIntro(triviaRoom);
			 }
			else {
				HellStrings.bouncer();
			}
		}
	}

	public static int triviaIntro(int triviaRoom) throws FileNotFoundException{
		Trivia.triviaMethod(triviaRoom);
		player1.closeRooms(triviaRoom);
		return triviaRoom;
	}
	
	public static void triviaScore(int triviaRoom) {
		if (triviaRoom == 1) {
			int plusMam = player1.getMam() + 1;
			player1.setUserMam(plusMam);
		}
		else if (triviaRoom == 2) {
			int plusEQ = player1.getEQ() +1;
			player1.setUserEQ(plusEQ);
		}
		else if (triviaRoom == 3) {
			int plusCat = player1.getCat() + 1;
			player1.setUserCat(plusCat);
		}
		else if (triviaRoom == 4) {
			int plusGame = player1.getGames() +1;
			player1.setUserGames(plusGame);
		}
	}
	
	//trivia machine output
	public static void postTrivia (int triviaRoom) {
		System.out.print("\nGreat work! Your final score for ");
		if (triviaRoom == 1) {
			System.out.print("mammal questions was: " + player1.getMam() + "/10.\nYou have: " + player1.getCoins() + " coins.");
		}
		else if (triviaRoom == 2) {
			System.out.print("equity questions was: " + player1.getEQ() + "/10.\nYou have: " + player1.getCoins() + " coins.");
		}
		else if (triviaRoom == 3) {
			System.out.print("equity questions was: " + player1.getCat() + "/10.\nYou have: " + player1.getCoins() + " coins.");
		}
		else if (triviaRoom == 4) {
			System.out.print("equity questions was: " + player1.getGames() + "/10.\nYou have: " + player1.getCoins() + " coins.");
		}
	}
	
	//saves, quits, restarts, or displays inventory
	public static void saveMenu(String saveChoice) throws FileNotFoundException {
		if (saveChoice.isEmpty()) {
			return;
		}
		else if (saveChoice.compareToIgnoreCase("quit") == 0) {
			System.exit(0);
		}
		else if (saveChoice.compareToIgnoreCase("save") == 0) {
			saveGame();
			System.out.println("Your game has been saved " + player1.getUserName() + "!");
		}
		else if (saveChoice.compareToIgnoreCase("inventory") == 0) {
			player1.getInventory();
		}
		else if (saveChoice.compareToIgnoreCase("restart") == 0) {
			
		}
		else if(saveChoice.compareToIgnoreCase("help") == 0) {
			System.out.println(HellStrings.HELP);
		}
		else {
			return;
		}
	}
	
	public static void saveGame() throws FileNotFoundException
	{
		// File writing objects
		String fileName = player1.getUserName().toLowerCase();
		PrintWriter outputFile = new PrintWriter (fileName + ".txt");
		
		// Write User and Ghost Data to a file
		outputFile.println(player1.getUserName());
		outputFile.println(player1.getCoins());
		outputFile.println(player1.getEQ());
		outputFile.println(player1.getMam());
		outputFile.println(player1.getCat());
		outputFile.println(player1.getGames());
		outputFile.println(player1.getRoom1());
		outputFile.println(player1.getRoom2());
		outputFile.println(player1.getRoom3());
		outputFile.println(player1.getRoom4());
		outputFile.println(ghost.getCoins());
		outputFile.println(ghost.getEQ());
		outputFile.println(ghost.getMam());
		outputFile.println(ghost.getCat());
		outputFile.println(ghost.getGames());
		outputFile.println(ghost.getRoom1());
		outputFile.println(ghost.getRoom2());
		outputFile.println(ghost.getRoom3());
		outputFile.println(ghost.getRoom4());
		
		outputFile.close();
	}
	
	//load previous save
	public static void loadGame(String userName) throws FileNotFoundException {
		File file = new File(userName.toLowerCase() + ".txt");
		Scanner inputFile = new Scanner(file);
		
		while (inputFile.hasNext()) {
			String name = inputFile.nextLine();
			player1.setUserName(name);
			int coins = inputFile.nextInt();
			player1.setUserCoins(coins);
			int equality = inputFile.nextInt();
			player1.setUserEQ(equality);
			int mammals = inputFile.nextInt();
			player1.setUserMam(mammals);
			int cats = inputFile.nextInt();
			player1.setUserCat(cats);
			int games = inputFile.nextInt();
			player1.setUserGames(games);
			boolean room1 = inputFile.nextBoolean();
			if (room1 == true) {
				player1.closeRooms(1);
			}
			boolean room2 = inputFile.nextBoolean();
			if (room2 == true) {
				player1.closeRooms(2);
			}
			boolean room3 = inputFile.nextBoolean();
			if (room3 == true) {
				player1.closeRooms(3);
			}
			boolean room4 = inputFile.nextBoolean();
			if (room4 == true) {
				player1.closeRooms(4);
			}
			String gname = inputFile.nextLine();
			ghost.setUserName(gname);
			int gcoins = inputFile.nextInt();
			ghost.setUserCoins(gcoins);
			int gequality = inputFile.nextInt();
			ghost.setUserEQ(gequality);
			int gmammals = inputFile.nextInt();
			ghost.setUserMam(gmammals);
			int gcats = inputFile.nextInt();
			ghost.setUserCat(gcats);
			int ggames = inputFile.nextInt();
			ghost.setUserGames(ggames);
			boolean groom1 = inputFile.nextBoolean();
			if (groom1 == true) {
				ghost.closeRooms(1);
			}
			boolean groom2 = inputFile.nextBoolean();
			if (groom2 == true) {
				ghost.closeRooms(2);
			}
			boolean groom3 = inputFile.nextBoolean();
			if (groom3 == true) {
				ghost.closeRooms(3);
			}
			boolean groom4 = inputFile.nextBoolean();
			if (groom4 == true) {
				ghost.closeRooms(4);
			}
			
		}
		
		inputFile.close();
	}
}
