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
	
	
	public User() {
		userName = "No one";
		userCoins = -1;
		userEqScore = -1;
		userMamScore = -1;
		userCatScore = -1;
		
	}
	
	public User(String name, int money, int equality, int mammals, int felines) {
		userName = name;
		userCoins = money;
		userEqScore = equality;
		userMamScore = mammals;
		userCatScore = felines;
	}
	
	public static void setUserName(String name) {
		userName = name;
	}
	
	public static void setUserCoins(int money) {
		userCoins = money;
	}
	
	public static void setUserEQ(int equality) {
		userEqScore = equality;
	}
	
	public static void setUserMam(int mammals) {
		userMamScore = mammals;
	}
	
	public static void setUserCat(int felines) {
		userCatScore = felines;
	}
	
	public static void getInventory() throws FileNotFoundException {
		System.out.print(userName.toUpperCase());
		System.out.println("'S INVENTORY\n");
		System.out.println("Monetary value: " + userCoins + " coins");
		System.out.println("Feline Questions Correct: " + userCatScore + "/10");
		System.out.println("Equity Questions Correct: " + userEqScore + "/10");
		System.out.println("Mammal Questions Correct: " + userMamScore + "/10");
		String userInput = scnr.nextLine();
		FinalMain.saveMenu(userInput);
	}
	
	public static String getUserName() {
		return userName;
	}
	
	public static int getCoins() {
		//report out current number of coins in inventory
		return userCoins;
	}
	
	public static int getEQ() {
		//report out correct equity answers out of total questions
		return userEqScore;
	}
	
	public static int getMam() {
		//report out correct mammal answers out of total questions
		return userMamScore;
	}
	
	public static int getCat() {
		//report out correct cat answers out of total questions
		return userCatScore;
	}
}
