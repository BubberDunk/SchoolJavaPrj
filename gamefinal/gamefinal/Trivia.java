package gamefinal;

import java.io.FileNotFoundException;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Trivia {

	
	public static void triviaMethod(int triviaRoom) throws FileNotFoundException{
		Scanner scnr = new Scanner(System.in);
		int q;
		String userInput;
		//add flavor text for trivia machine and a y/n for if they want to doo
		System.out.println("Good let's begin then...");
		for(q = 0; q <= 10; q++){
			System.out.println(questions[triviaRoom][q]);
			userInput = scnr.nextLine();
			if(userInput.contains(answers[triviaRoom][q])){
				System.out.println("Correct!");
			}else{
				System.out.println("incorrect :<");
			}
		}
		
	}

	
	final static String[][] questions = new String[4][];
	final static String[][] answers = new String[4][];
	
		 //subject 1
   	questions [1][0] = "1. Which is not a mammal characteristic?"
   						+"\na. milk production"
   						+"\nb. autotrophy"
   						+"\nc. warm blooded"
   						+"\nd. none of the above";
   	answers[1][0] = "b";
   	 
   	questions [1][1] = "2. Egg laying mammals are called _____"
   	 					+"\na. xenarthra"
   	 					+"\nb. reptiles"
   	 					+"\nc. monotremes"
   	 					+"\nd. none of the above";
   	answers [1][1] = "c";
   	 
   	 questions [1][2] = "3. Which continent is known for their large marsupials?"
   						+"a. australia"
   						+"b. asia"
   						+"c. south america"
   						+"d. none of the above";
   	 answers[1][2] = "a";
   	 
   	 questions [3][0] = "4. Do dolphins have bones in their tail fins?";
   	 questions [3][1] = "a. yes";
   	 questions [3][2] = "b. no";
   	 questions [3][3] = "c. sometimes";
   	 questions [3][4] = "d. none of the above";
   	 answers [1][3] = "b";
   	 
   	 questions [4][0] = "5. Which of these are not a mammal?";
   	 questions [4][1] = "a. humans";
   	 questions [4][2] = "b. dingos";
   	 questions [4][3] = "c. pangolins";
   	 questions [4][4] = "d. none of the above";
   	 answers   [1][4] = "d";

   	 questions [5][0] = "6. Which is the largest land mammal?";
   	 questions [5][1] = "a. Hippo";
   	 questions [5][2] = "b. African forest elephant";
   	 questions [5][3] = "c. African bush elephant";
   	 questions [5][4] = "d. none of the above";
   	 answers[1][5] = "c";
   	 
   	 questions [6][0] = "7. How many chambers does a rabbits heart have?";
   	 questions [6][1] = "a. 1";
   	 questions [6][2] = "b. 4";
   	 questions [6][3] = "c. 8";
   	 questions [6][4] = "d. none of the above";
   	 answers[1][6] = "b";
   	 
   	 questions [7][0] = "8. Which is closest in size to a blue whales eye?";
   	 questions [7][1] = "a. baseball";
   	 questions [7][2] = "b. dodgeball";
   	 questions [7][3] = "c. ping pong ball";
   	 questions [7][4] = "d. none of the above";
   	 answers[1][7] = "b";
   	 
   	 questions [8][0] = "9. Which mammal can fly?";
   	 questions [8][1] = "a. bats";
   	 questions [8][2] = "b. pikas";
   	 questions [8][3] = "c. penguins";
   	 questions [8][4] = "d. none of the above";
   	 answers[1][8] = "a";
   	 
   	 questions [9][0] = "10. The name “mammalia” was coined by ____ in which decade?";
   	 questions [9][1] = "a. Charles Darwin, 1830’s";
   	 questions [9][2] = "b. Carl Linnaeus, 1750’s";
   	 questions [9][3] = "c. Aristotle, 350 BC";
   	 questions [9][4] = "d. none of the above";
   	 answers[1][9] = "b";
   	 
   	 // subject 2
   	 sub2questions [2][0] = "1. When was the Americans with Disabilities Act (ADA) passed, "
   			 + "giving more access and opportunity to people with disabilities?";
   	 sub2questions [0][1] = "a. 1918";
   	 sub2questions [0][2] = "b. 1975";
   	 sub2questions [0][3] = "c. 1981";
   	 sub2questions [0][4] = "d. 1990";
   	 sub2answers [0] = "d";
   	 
   	 sub2questions [1][0] = "2. Around how many different living languages currently "
   			 + "exist on this planet?";
   	 sub2questions [1][1] = "a. 6,500";
   	 sub2questions [1][2] = "b. 450";
   	 sub2questions [1][3] = "c. Over 10,000";
   	 sub2questions [1][4] = "d. 3";
   	 sub2answers [1] = "a";
   	 
   	 sub2questions [2][0] = "3. How many Indigenous Nations exist in the place the U.S. occupies?";
   	 sub2questions [2][1] = "a. 1000+";
   	 sub2questions [2][2] = "b. 564";
   	 sub2questions [2][3] = "c. 30";
   	 sub2questions [2][4] = "d. 252";
   	 sub2answers [2] = "d";

   	 sub2questions [3][0] = "4. Who was the first Indigenous Woman to receive a medical degree "
   			 + "in the U.S.?";
   	 sub2questions [3][1] = "a. Buffy Ste Marie";
   	 sub2questions [3][2] = "b. Mary Ellen Hillaire";
   	 sub2questions [3][3] = "c. Susan La Flesche Picotte";
   	 sub2questions [3][4] = "d. Joy Harjo";
   	 sub2answers [3] = "c";
   	 
   	 sub2questions [4][0] = "5. What is the name of the document that Europeans used to justify "
   			 + "killing Indigenous Peoples and the taking of the land?";
   	 sub2questions [4][1] = "a. Age of Discovery";
   	 sub2questions [4][2] = "b. Manifest Destiny";
   	 sub2questions [4][3] = "c. Doctrine of Discovery";
   	 sub2questions [4][4] = "d. Edict of Nantes";
   	 sub2answers [4] = "c";

   	 sub2questions [5][0] = "6. Who was the first Black lawyer in the U.S.?";
   	 sub2questions [5][1] = "a. Fredrick Douglas ";
   	 sub2questions [5][2] = "b. Angela Davis";
   	 sub2questions [5][3] = "c. Thurgood Marshall";
   	 sub2questions [5][4] = "d. John Mercer Langston";
   	 sub2answers [5] = "d";
   		 
   	 sub2questions [6][0] = "7. What year was segregation ruled unconstitutional in the U.S.?";
   	 sub2questions [6][1] = "a. 1887";
   	 sub2questions [6][2] = "b. 1923";
   	 sub2questions [6][3] = "c. 1954";
   	 sub2questions [6][4] = "d. 1961";
   	 sub2answers [6] = "c";
   	 
   	 sub2questions [7][0] = "8. Which of the following contributes to institutional racism?";
   	 sub2questions [7][1] = "a. Personal Biases";
   	 sub2questions [7][2] = "b. Prison Industrial Complex";
   	 sub2questions [7][3] = "c. White Supremacy";
   	 sub2questions [7][4] = "d. All of the above";
   	 sub2answers [7] = "d";
   	 
   	 sub2questions [8][0] = "9. Which pronouns would be considered “prefered” by the "
   			 + "person using them?";
   	 sub2questions [8][1] = "a. They/Them";
   	 sub2questions [8][2] = "b. Ze/Zem";
   	 sub2questions [8][3] = "c. She/Her";
   	 sub2questions [8][4] = "d. None of the above";
   	 sub2answers [8] = "d";
    
   	 sub2questions [9][0] = "10. Which is the most accurate definition of equity in terms of "
   			 + "social transformation toward collective liberation?";
   	 sub2questions [9][1] = "a. Every person for themselves, individual competition "
   			 + "for resources and visibility.";
   	 sub2questions [9][2] = "b. Every person gets the same amount of resources.";
   	 sub2questions [9][3] = "c. A structure of hierarchy where the people being paid the "
   			 + "most make the decisions.";
   	 sub2questions [9][4] = "d. A structure of economics and governance wherein each person "
   			 + "impacted is given access to the conversations and decision-making processes "
   			 + "concerning the allocation of resources AND the peoples who have been most "
   			 + "negatively impacted by state violence are at the forefront of leadership "
   			 + "in change-making.";
   	 sub2answers [9] = "d";
   	 
   	 // subject 3
   	 sub3questions [0][0] = "1. How many bones does a cat have in their body?";
   	 sub3questions [0][1] = "a. 206";
   	 sub3questions [0][2] = "b. 230";
   	 sub3questions [0][3] = "c. 255";
   	 sub3questions [0][4] = "d. 192";
   	 sub3answers [0] = "b";
   	 
   	 sub3questions [1][0] = "2. What is a group of kittens called?";
   	 sub3questions [1][1] = "a. A litter";
   	 sub3questions [1][2] = "b. A cluster";
   	 sub3questions [1][3] = "c. A cuddle";
   	 sub3questions [1][4] = "d. A kindle";
   	 sub3answers [1] = "d";
   	 
   	 sub3questions [2][0] = "3. Which flavor can’t cats taste?";
   	 sub3questions [2][1] = "a. Sweet";
   	 sub3questions [2][2] = "b. Sour";
   	 sub3questions [2][3] = "c. Bitter";
   	 sub3questions [2][4] = "d. Spicy";
   	 sub3answers [2] = "a";
   	 
   	 sub3questions [3][0] = "4. Which ancient Egyptian goddess was the patron of cats?";
   	 sub3questions [3][1] = "a. Sekhmet";
   	 sub3questions [3][2] = "b. Anuket";
   	 sub3questions [3][3] = "c. Bastet";
   	 sub3questions [3][4] = "d. Pakhet";
   	 sub3answers [3] = "c";
   	 
   	 sub3questions [4][0] = "5. What is the building height above which cat survival after falls begins to increase?";
   	 sub3questions [4][1] = "a. 3 stories";
   	 sub3questions [4][2] = "b. 7 stories";
   	 sub3questions [4][3] = "c. 11 stories";
   	 sub3questions [4][4] = "d. 19 stories";
   	 sub3answers [4] = "b";

   	 sub3questions [5][0] = "6. At what age is a cat no longer a kitten?";
   	 sub3questions [5][1] = "a. 2 months";
   	 sub3questions [5][2] = "b. 6 months";
   	 sub3questions [5][3] = "c. 1 year";
   	 sub3questions [5][4] = "d. 2 years";
   	 sub3answers [5] = "c";
   	 
   	 sub3questions [6][0] = "7. Where was the only cat to have been to space from? (She made it back safely)";
   	 sub3questions [6][1] = "a. France";
   	 sub3questions [6][2] = "b. Russia";
   	 sub3questions [6][3] = "c. USA";
   	 sub3questions [6][4] = "d. Japan";
   	 sub3answers [6] = "a";
    
   	 sub3questions [7][0] = "8. What percentage of their waking hours do cats typically spend grooming?";
   	 sub3questions [7][1] = "a. 10-30%";
   	 sub3questions [7][2] = "b. 30-50%";
   	 sub3questions [7][3] = "c. 50-70%";
   	 sub3questions [7][4] = "d. 70-90%";
   	 sub3answers [7] = "b";

   	 sub3questions [8][0] = "9. What is the name of the world’s largest cat painting?";
   	 sub3questions [8][1] = "a. The Bachelor’s Party";
   	 sub3questions [8][2] = "b. Cats Suggested as the Fifty-Three stations of the Tokaido";
   	 sub3questions [8][3] = "c. La Poete";
   	 sub3questions [8][4] = "d. My Wife’s Lovers";
   	 sub3answers [8] = "d";
   	 
   	 sub3questions [9][0] = "10. When was the first cat video filmed?";
   	 sub3questions [9][1] = "a. 1894";
   	 sub3questions [9][2] = "b. 1907";
   	 sub3questions [9][3] = "c. 1916";
   	 sub3questions [9][4] = "d. 1933";
   	 sub3answers [9] = "d";
   	 
   	 
   	 
          	 
		
	}
}
