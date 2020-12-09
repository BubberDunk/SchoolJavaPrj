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
	
	
	public User() {
		userName = "No one";
		userCoins = -1;
		userEqScore = -1;
		userMamScore = -1;
		userCatScore = -1;
		userGameScore = -1;
		
	}
	
	public User(String name, int money, int equality, int mammals, int felines, int games) {
		userName = name;
		userCoins = money;
		userEqScore = equality;
		userMamScore = mammals;
		userCatScore = felines;
		userGameScore = games;
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
}
