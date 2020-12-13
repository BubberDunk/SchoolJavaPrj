package gamefinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FinalMain {
	static Scanner scnr = new Scanner(System.in);
	static User player1 = new User();
	

	public static void main(String[] args) throws FileNotFoundException {
		theGame();
	}
	
	//'title screen'
	public static void theGame() throws FileNotFoundException {
		gameStart();
		doorIntro();
	}
	
	//loads or starts the game
	public static void gameStart() throws FileNotFoundException {
		System.out.println("Welcome to the game! Please enter a command:");
		System.out.print("\n|New|  ");
		System.out.print("|Load|  ");
		System.out.println("|Quit|");
		String userInput = scnr.nextLine();
		userInput.toLowerCase();
		
		if (userInput.contains("load")) {
			System.out.println("What is your name?");
			userInput = scnr.nextLine();
			loadGame(userInput);
		}
		
		else if (userInput.contains("quit")) {
			System.exit(0);
		}
		
		else if (userInput.contains("new")){
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
		
		else {
			System.out.println("\nYou can't do that yet! Try something else.");
			gameStart();
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
		saveMenu(doorChoice);
		doorLoop(doorChoice);
	}
	
	//branching menu allowing user to select a door or to fuck up and not select a door
	public static void doorLoop(String doorChoice) throws FileNotFoundException {
		if ((player1.getRoom1() == true) && (player1.getRoom2() == true) && (player1.getRoom3() == true) && (player1.getRoom4() == true)) {
			if (doorChoice.contains("5")) {
				Endgame.EndScreen();
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
			DoorParty.door1Intro();
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
			System.out.println("Game saved!");
		}
		else if (saveChoice.compareToIgnoreCase("inventory") == 0) {
			player1.getInventory();
		}
		else if (saveChoice.compareToIgnoreCase("restart") == 0) {
			System.out.println("\nAre you SURE? This is permanent...");
			String userInput = scnr.nextLine();
			userInput = userInput.toLowerCase();
			if (userInput.contains("yes")) {
				System.out.println("\nOkay... see you on the flip side.\n");
				player1.setUserName("null");
				player1.setUserCoins(10);
				player1.setUserCat(0);
				player1.setUserEQ(0);
				player1.setUserGames(0);
				player1.setUserMam(0);
				player1.openRooms();
				theGame();
			}
			else {
				System.out.println("\nHaha, close call! Don't be so reckless next time.");
			}
			
		}
		else if(saveChoice.compareToIgnoreCase("help") == 0) {
			System.out.println(HellStrings.HELP);
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
		}
		
		inputFile.close();
	}
}
