package gamefinal;

public class Ghost {
	private static String ghostName;
	private static int ghostCoins;
	private static int ghostEqScore;
	private static int ghostMamScore;
	private static int ghostCatScore;
	

	public Ghost(int coins, int equality, int mammals, int felines) {
        ghostName = "badass villain name";
        ghostCoins = coins;
        ghostEqScore = equality;
        ghostMamScore = mammals;
        ghostCatScore = felines;
    }    
	
	public static void setGhostCoins(int coins) {
        ghostCoins = coins;
    }
    
    public static void setGhostEQ(int equality) {
        ghostEqScore = equality;
    }
    
    public static void setGhostMam(int mammals) {
        ghostMamScore = mammals;
    }
    
    public static void setGhostCat(int felines) {
        ghostCatScore = felines;
    }
    
    public static void getGhostInventory() {
        System.out.print(ghostName.toUpperCase());
        System.out.println("'S INVENTORY\n");
        System.out.println("Monetary value: " + ghostCoins + " coins");
        System.out.println("Feline Questions Correct: " + ghostCatScore + "/10");
        System.out.println("Equity Questions Correct: " + ghostEqScore + "/10");
        System.out.println("Mammal Questions Correct: " + ghostMamScore + "/10");
    }
    
    public static String getGhostName() {
        return ghostName;
    }
    
    public static int getGhostCoins() {
        //report out current number of coins in inventory
        return ghostCoins;
    }
    
    public static int getGhostEQ() {
        //report out correct equity answers out of total questions
        return ghostEqScore;
    }
    
    public static int getGhostMam() {
        //report out correct mammal answers out of total questions
        return ghostMamScore;
    }
    
    public static int getGhostCat() {
        //report out correct cat answers out of total questions
        return ghostCatScore;
    }


}
