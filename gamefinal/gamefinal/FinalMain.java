package gamefinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FinalMain {
	static Scanner scnr = new Scanner(System.in);
	static User player1 = new User();
	static User ghost = new User("opponent", 10, 0, 0, 0, 0);
	

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
		doorChoice = scnr.nextLine();
		doorLoop(doorChoice);
	}
	
	//branching menu allowing user to select a door or to fuck up and not select a door
	public static void doorLoop(String doorChoice) throws FileNotFoundException {
		if (doorChoice.isEmpty()) {
			badChoice(); }
		else {
			char doorChar = doorChoice.charAt(0);
			if (doorChar == '1') {
			//door1 trivia zone
			}
			else if (doorChar == '2') {
				DoorParty.door2Intro();
			}
			else if (doorChar == '3')
				try {
					{	
						//door3 trivia zone
						DoorParty.door3Intro();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else if (doorChar == '4') {
			//door4 trivia zone
			}
			else {
				badChoice();
			}
		}
	}
	
	//when user fucks up and does not select a door
	public static void badChoice() throws FileNotFoundException {
		System.out.println("Where do you think YOU'RE going? Please pick a door number.");
		String doorAgain = scnr.nextLine();
		doorLoop(doorAgain);
	}

	public static int triviaIntro(int triviaRoom) throws FileNotFoundException{
		Trivia.triviaMethod(triviaRoom);
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
		outputFile.println(ghost.getCoins());
		outputFile.println(ghost.getEQ());
		outputFile.println(ghost.getMam());
		outputFile.println(ghost.getCat());
		outputFile.println(ghost.getGames());
		
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
			
		}
		
		inputFile.close();
	}
}
