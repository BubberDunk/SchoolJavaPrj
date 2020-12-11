package gamefinal;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Trivia {
	 
	public static void triviaMethod(int triviaRoom) throws FileNotFoundException{
	String[][] questions = new String[4][10];
	String[][] answers = new String[4][10];
	
	questions[0][0] = "1. Which is not a mammal characteristic?"
   						+"\na. milk production"
   						+"\nb. autotrophy"
   						+"\nc. warm bloodedness"
   						+"\nd. none of the above";
   	answers[0][0] = "b";
   	 
   	questions[0][1] = "2. Egg laying mammals are called _____"
   	 					+"\na. xenarthra"
   	 					+"\nb. reptiles"
   	 					+"\nc. monotremes"
   	 					+"\nd. none of the above";
   	answers[0][1] = "c";
   	 
   	 questions[0][2] = "3. Which continent is known for their large marsupials?"
   						+"\na. Australia"
   						+"\nb. Asia"
   						+"\nc. South America"
   						+"\nd. none of the above";
   	 answers[0][2] = "a";
   	 
   	 questions[0][3] = "4. Do dolphins have bones in their tail fins?"
   			 			+"\na. yes"
   			 			+ "\nb. no"
   			 			+ "\nc. sometimes"
   			 			+ "\nd. none of the above";
   	 answers[0][3] = "b";
   	 
   	 questions[0][4] = "5. Which of these are not a mammal?"
   	 					+ "\na. humans"
   	 					+ "\nb. dingos"
   	 					+ "\nc. pangolins"
   	 					+ "\nd. none of the above";
   	 answers[0][4] = "d";

   	 questions[0][5] = "6. Which is the largest land mammal?"
   	 					+ "\na. Hippo"
   	 					+ "\nb. African forest elephant"
   	 					+ "\nc. African bush elephant"
   	 					+ "\nd. none of the above";
   	 answers[0][5] = "c";
   	 
   	 questions[0][6] = "7. How many chambers does a rabbits heart have?"
   	 					+ "\na. 1"
   	 					+ "\nb. 4"
   	 					+ "\nc. 8"
   	 					+ "\nd. none of the above";
   	 answers[0][6] = "b";
   	 
   	 questions[0][7] = "8. Which is closest in size to a blue whales eye?"
   	 					+ "\na. baseball"
   	 					+ "\nb. dodgeball"
   	 					+ "\nc. ping pong ball"
   	 					+ "\nd. none of the above";
   	 answers[0][7] = "b";
   	 
   	 questions[0][8] = "9. Which mammal can fly?"
   	 					+ "\na. bats"
   	 					+ "\nb. pikas"
   	 					+ "\nc. penguins"
   	 					+ "\nd. all of the above";
   	 answers[0][8] = "a";
   	 
   	 questions[0][9] = "10. The name 'mammalia' was coined by ____ in which decade?"
   	 					+ "\na. Charles Darwin, 1830s"
   	 					+ "\nb. Carl Linnaeus, 1750s"
   	 					+ "\nc. Aristotle, 350 BC"
   	 					+ "\nd. none of the above";
   	 answers[0][9] = "b";
   	 
   	 // subject 2
   	 questions[1][0] = "1. When was the Americans with Disabilities Act (ADA) passed, giving more access and opportunity to people with disabilities?"
   	 					+ "\na. 1918"
   	 					+ "\nb. 1975"
   	 					+ "\nc. 1981"
   	 					+ "\nd. 1990";
   	 answers[1][0] = "d";
   	 
   	 questions[1][1] = "2. Around how many different living languages currently exist on this planet?"
   	 					+ "\na. 6,500"
   	 					+ "\nb. 450"
   	 					+ "\nc. Over 10,000"
   	 					+ "\nd. 3";
   	 answers[1][1] = "a";
   	 
   	 questions[1][2] = "3. How many Indigenous Nations exist in the place the U.S. occupies?"
   	 					+ "\na. 1000+"
   	 					+ "\nb. 564"
   	 					+ "\nc. 30"
   	 					+ "\nd. 252";
   	 answers[1][2] = "d";

   	 questions[1][3] = "4. Who was the first Indigenous woman to receive a medical degree in the U.S.?"
   	 					+ "\na. Buffy Ste Marie"
   	 					+ "\nb. Mary Ellen Hillaire"
   	 					+ "\nc. Susan La Flesche Picotte"
   	 					+ "\nd. Joy Harjo";
   	 answers[1][3] = "c";
   	 
   	 questions[1][4] = "5. What is the name of the document that Europeans used to justify killing Indigenous Peoples and the taking of the land?"
   	 					+ "\na. Age of Discovery"
   	 					+ "\nb. Manifest Destiny"
   	 					+ "\nc. Doctrine of Discovery"
   	 					+ "\nd. Edict of Nantes";
   	 answers[1][4] = "c";

   	 questions[1][5] = "6. Who was the first Black lawyer in the U.S.?"
   	 					+ "\na. Fredrick Douglas "
   	 					+ "\nb. Angela Davis"
   	 					+ "\nc. Thurgood Marshall"
   	 					+ "\nd. John Mercer Langston";
   	 answers[1][5] = "d";
   		 
   	 questions[1][6] = "7. What year was segregation ruled unconstitutional in the U.S.?"
   	 					+ "\na. 1887"
   	 					+ "\nb. 1923"
   	 					+ "\nc. 1954"
   	 					+ "\nd. 1961";
   	 answers[1][6] = "c";
   	 
   	 questions[1][7] = "8. Which of the following contributes to institutional racism?"
   	 					+ "\na. personal biases"
   	 					+ "\nb. Prison Industrial Complex"
   	 					+ "\nc. white supremacy"
   	 					+ "\nd. all of the above";
   	 answers[1][7] = "d";
   	 
   	 questions[1][8] = "9. Which pronouns would be considered 'preferred' by the person using them?"
   	 					+ "\na. They/Them"
   	 					+ "\nb. Ze/Zem"
   	 					+ "\nc. She/Her"
   	 					+ "\nd. None of the above";
   	 answers[1][8] = "d";
    
   	 questions[1][9] = "10. Which is the most accurate definition of equity in terms of social transformation toward collective liberation?"
   	 					+ "\na. Every person for themselves, individual competition for resources and visibility."
   	 					+ "\nb. Every person gets the same amount of resources."
   	 					+ "\nc. A structure of hierarchy where the people being paid the most make the decisions."
   	 					+ "\nd. A structure of economics and governance wherein each person impacted is given access to the conversations and decision-making processes "
   	 					+ "\nconcerning the allocation of resources AND the peoples who have been most negatively impacted by state violence are at the forefront of leadership in change-making.";
   	 answers[1][9] = "d";
   	 
   	 // subject 3
   	 questions[2][0] = "1. How many bones does a cat have in their body?"
   	 					+ "\na. 206"
   	 					+ "\nb. 230"
   	 					+ "\nc. 255"
   	 					+ "\nd. 192";
   	 answers[2][0] = "b";
   	 
   	 questions[2][1] = "2. What is a group of kittens called?"
   	 					+ "\na. A litter"
   	 					+ "\nb. A cluster"
   	 					+ "\nc. A cuddle"
   	 					+ "\nd. A kindle";
   	 answers[2][1] = "d";
   	 
   	 questions[2][2] = "3. Which flavor can cats not taste?"
   	 					+ "\na. Sweet"
   	 					+ "\nb. Sour"
   	 					+ "\nc. Bitter"
   	 					+ "\nd. Spicy";
   	 answers[2][2] = "a";
   	 
   	 questions[2][3] = "4. Which ancient Egyptian goddess was the patron of cats?"
   	 					+ "\na. Sekhmet"
   	 					+ "\nb. Anuket"
   	 					+ "\nc. Bastet"
   	 					+ "\nd. Pakhet";
   	 answers[2][3] = "c";
   	 
   	 questions[2][4] = "5. What is the building height above which cat survival after falls begins to increase?"
   	 					+ "\na. 3 stories"
   	 					+ "\nb. 7 stories"
   	 					+ "\nc. 11 stories"
   	 					+ "\nd. 19 stories";
   	 answers[2][4] = "b";

   	 questions[2][5] = "6. At what age is a cat no longer a kitten?"
   	 					+ "\na. 2 months"
   	 					+ "\nb. 6 months"
   	 					+ "\nc. 1 year"
   	 					+ "\nd. 2 years";
   	 answers[2][5] = "c";
   	 
   	 questions[2][6] = "7. Where was the only cat to have been to space from? (She made it back safely)"
   	 					+ "\na. France"
   	 					+ "\nb. Russia"
   	 					+ "\nc. USA"
   	 					+ "\nd. Japan";
   	 answers[2][6] = "a";
    
   	 questions[2][7] = "8. What percentage of their waking hours do cats typically spend grooming?"
   	 					+ "\na. 10-30%"
   	 					+ "\nb. 30-50%"
   	 					+ "\nc. 50-70%"
   	 					+ "\nd. 70-90%";
   	 answers[2][7] = "b";

   	 questions[2][8] = "9. What is the name of the world's largest cat painting?"
   	 					+ "\na. The Bachelors' Party"
   	 					+ "\nb. Cats Suggested as the Fifty-Three stations of the Tokaido"
   	 					+ "\nc. La Poete"
   	 					+ "\nd. My Wife's Lovers";
   	 answers[2][8] = "d";
   	 
   	 questions[2][9] = "10. When was the first cat video filmed?"
   	 					+ "\na. 1894"
   	 					+ "\nb. 1907"
   	 					+ "\nc. 1916"
   	 					+ "\nd. 1933";
   	 answers[2][9] = "a";
   	 
  // subject 4
   	 questions[3][0] = "1. The game of \"Go\" originated in ancient... "
   	 					+ "\na. Rome"
   	 					+ "\nb. China"
   	 					+ "\nc. Egypt"
   	 					+ "\nd. Crete";
   	 answers[3][0] = "b";
   	 
   	 questions[3][1] = "2. It was played in ancient Egypt, Greece, and Rome. "
   	 		+ "\nName this game involving dice in which each player has 15 pieces to move around a board:"
   	 					+ "\na. Chess"
   	 					+ "\nb. Checkers"
   	 					+ "\nc. Backgammon"
   	 					+ "\nd. Dominoes";
   	 answers[3][1] = "c";
   	 
   	 questions[3][2] = "3. Castling is a move in what game?"
   	 					+ "\na. Chess"
   	 					+ "\nb. Castlevania"
   	 					+ "\nc. Reversi"
   	 					+ "\nd. Battleship";
   	 answers[3][2] = "a";
   	 
   	 questions[3][3] = "4. During the Renaissance, villagers found the time to play skittles, a pastime that most closely resembles what modern game?"
   	 					+ "\na. Croquet"
   	 					+ "\nb. Lacrosse"
   	 					+ "\nc. Shuffleboard"
   	 					+ "\nd. Bowling";
   	 answers[3][3] = "d";
   	 
   	 questions[3][4] = "5. In 1930, Alfred Butts, an unemployed architect, dreamed up what new game in which players have to make up words using randomly chosen letters?"
   	 					+ "\na. Boggle"
   	 					+ "\nb. Scrabble"
   	 					+ "\nc. Hangman"
   	 					+ "\nd. Bananagrams";
   	 answers[3][4] = "b";

   	 questions[3][5] = "6. The game of poona originated in India. It was brought to England in 1873. It is played on a court with rackets and shuttlecock. Today poona is better known as:"
   	 					+ "\na. Tennis"
   	 					+ "\nb. Ping-pong"
   	 					+ "\nc. Badminton"
   	 					+ "\nd. Pickleball";
   	 answers[3][5] = "c";
   	 
   	 questions[3][6] = "7. Skipping flat stones across the surface of water is the game of ducks and..."
   	 					+ "\na. Dogs"
   	 					+ "\nb. Dragons"
   	 					+ "\nc. Drakes"
   	 					+ "\nd. Stones";
   	 answers[3][6] = "c";
    
   	 questions[3][7] = "8. What was the first coin-operated arcade game to be commercially released?"
   	 					+ "\na. Pong"
   	 					+ "\nb. Pac-man"
   	 					+ "\nc. Computer Space"
   	 					+ "\nd. Space Invaders";
   	 answers[3][7] = "c";

   	 questions[3][8] = "9. What is the name of the world's first home video game console?"
   	 					+ "\na. Atari"
   	 					+ "\nb. Magnavox Odyssey"
   	 					+ "\nc. Coleco Telstar"
   	 					+ "\nd. Nintendo Entertainment System";
   	 answers[3][8] = "b";
   	 
   	 questions[3][9] = "10. What video game are you most likely to find buried in El Paso, Texas?"
   	 					+ "\na. Super Mario Bros. 2"
   	 					+ "\nb. E.T. The Extra-Terrestrial"
   	 					+ "\nc. Wii Sports"
   	 					+ "\nd. Zelda: The Wand of Gamelon";
   	 answers[3][9] = "b";
   	 
   	Scanner scnr = new Scanner(System.in);
	int q;
	String userInput;
	System.out.println("Good! Let's begin, then.");
	for(q = 0; q <= 9; q++){
		System.out.println(questions[triviaRoom - 1][q]);
		userInput = scnr.nextLine();
		if(userInput.contains(answers[triviaRoom - 1][q])){
			FinalMain.triviaScore(triviaRoom);
			System.out.println("Correct!");
		}else{
			System.out.println("incorrect :<");
		}
	}
	FinalMain.postTrivia(triviaRoom);
   	 
		
	}
   	 
}
