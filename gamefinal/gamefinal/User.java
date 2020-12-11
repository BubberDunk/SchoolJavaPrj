package gamefinal;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class User {

	static Scanner scnr = new Scanner(System.in);
	private static String userName;
	private static int userCoins;
	private static int userEqScore;
	private static int userMamScore;
	private static int userCatScore;
	private static int userGameScore;
	private static boolean closeRoom1;
	private static boolean closeRoom2;
	private static boolean closeRoom3;
	private static boolean closeRoom4;
	
	
	public User() {
		userName = "No one";
		userCoins = -1;
		userEqScore = -1;
		userMamScore = -1;
		userCatScore = -1;
		userGameScore = -1;
		closeRoom1 = false;
		closeRoom2 = false;
		closeRoom3 = false;
		closeRoom4 = false;
	}
	
	public User(String name, int money, int equality, int mammals, int felines, int games, boolean room1, boolean room2, boolean room3, boolean room4) {
		userName = name;
		userCoins = money;
		userEqScore = equality;
		userMamScore = mammals;
		userCatScore = felines;
		userGameScore = games;
		closeRoom1 = room1;
		closeRoom2 = room2;
		closeRoom3 = room3;
		closeRoom4 = room4;
		
	}
	
	public void setUserName(String name) {
		userName = name;
	}
	
	public void setUserCoins(int money) {
		userCoins = money;
	}
	
	public void setUserEQ(int equality) {
		userEqScore = equality;
	}
	
	public void setUserMam(int mammals) {
		userMamScore = mammals;
	}
	
	public void setUserCat(int felines) {
		userCatScore = felines;
	}
	
	public void setUserGames(int games) {
		userGameScore = games;
	}
	
	//closes trivia rooms after trivia is done
	public void closeRooms(int triviaRoom) {
		if (triviaRoom == 1) {
			closeRoom1 = true;
		}
		else if(triviaRoom == 2) {
			closeRoom2 = true;
		}
		else if(triviaRoom == 3) {
			closeRoom3 = true;
		}
		else if(triviaRoom == 4) {
			closeRoom4 = true;
		}
	}
	
	public void getInventory() throws FileNotFoundException {
		System.out.print(userName.toUpperCase());
		System.out.println("'S INVENTORY");
		System.out.println("Monetary value: " + userCoins + " coins");
		System.out.println("Equity Questions Correct: " + userEqScore + "/10");
		System.out.println("Feline Questions Correct: " + userCatScore + "/10");
		System.out.println("Game Questions Correct: " + userGameScore + "/10");
		System.out.println("Mammal Questions Correct: " + userMamScore + "/10");
		String userInput = scnr.nextLine();
		FinalMain.saveMenu(userInput);
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getCoins() {
		//report out current number of coins in inventory
		return userCoins;
	}
	
	public int getEQ() {
		//report out correct equity answers out of total questions
		return userEqScore;
	}
	
	public int getMam() {
		//report out correct mammal answers out of total questions
		return userMamScore;
	}
	
	public int getCat() {
		//report out correct cat answers out of total questions
		return userCatScore;
	}
	
	public int getGames() {
		//report out correct cat answers out of total questions
		return userGameScore;
	}
	
	//reports status of trivia rooms being open or not
	public boolean getRoom1() {
		return closeRoom1;
	}
	public boolean getRoom2() {
		return closeRoom2;
	}
	public boolean getRoom3() {
		return closeRoom3;
	}
	public boolean getRoom4() {
		return closeRoom4;
	}

}
