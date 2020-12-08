package gamefinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FinalMain {

	static Scanner scnr = new Scanner(System.in);
	

	public static void main(String[] args) throws FileNotFoundException {
		gameStart();
		doorIntro();
	}
	
	//loads or starts the game
	public static void gameStart() throws FileNotFoundException {
		System.out.println("Welcome to the game! Are you new here?");
		String userInput = scnr.nextLine();
		
		if (userInput.compareToIgnoreCase("no") == 0) {
			System.out.println("What is your name?");
			userInput = scnr.nextLine();
			loadGame(userInput);
		}
		
		else {
			//this part is just the beginning of the game
			userIntro(); //prompts for user name
			HellStrings.getGameIntro(); //introduces game
			scnr.nextLine();
			HellStrings.getJokes();
			userInput = scnr.nextLine();
			User.setUserCoins(10); 
			Ghost.setGhostCoins(10);//initializing moneys
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
        User.setUserName(userName);
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
			//door2 trivia zone
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
		}
		else if (saveChoice.compareToIgnoreCase("inventory") == 0) {
			User.getInventory();
		}
		else if (saveChoice.compareToIgnoreCase("restart") == 0) {
			
		}
		else {
			return;
		}
	}
	
	public static void saveGame() throws FileNotFoundException
	{
		// File writing objects
		String fileName = User.getUserName().toLowerCase();
		PrintWriter outputFile = new PrintWriter (fileName + ".txt");
		
		// Write User and Ghost Data to a file
		outputFile.println(User.getUserName());
		outputFile.println(User.getCoins());
		outputFile.println(User.getEQ());
		outputFile.println(User.getMam());
		outputFile.println(User.getCat());
		outputFile.println(Ghost.getGhostCoins());
		outputFile.println(Ghost.getGhostEQ());
		outputFile.println(Ghost.getGhostMam());
		outputFile.println(Ghost.getGhostCat());
		
		outputFile.close();
	}
	
	public static void loadGame(String userName) throws FileNotFoundException {
		File file = new File(userName.toLowerCase() + ".txt");
		Scanner inputFile = new Scanner(file);
		
		while (inputFile.hasNext()) {
			String name = inputFile.nextLine();
			int coins = inputFile.nextInt();
			int equality = inputFile.nextInt();
			int mammals = inputFile.nextInt();
			int cats = inputFile.nextInt();
			new User(name, coins, equality, mammals, cats);
			int gCoins = inputFile.nextInt();
			int gEquality = inputFile.nextInt();
			int gMammals = inputFile.nextInt();
			int gCats = inputFile.nextInt();
			new Ghost(gCoins, gEquality, gMammals, gCats);
			
		}
		
		inputFile.close();
	}
}
