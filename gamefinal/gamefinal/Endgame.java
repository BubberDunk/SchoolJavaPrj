package gamefinal;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Endgame {
	
	
	public static void EndScreen() throws FileNotFoundException { //print the end game
		User.getFinalAct();
		Scanner scnr = new Scanner(System.in);
		System.out.println("input 1 to restart, input 2 to get the cool ending"); //a lie, forced restart
		int userVal = scnr.nextInt();
		
		if(userVal == 1){
			System.out.println("about to save");
			FinalMain.saveMenu("save");
		
			FinalMain.saveMenu("restart");
		}
		else {
		FinalMain.saveMenu("restart");
	}
	}
	
}