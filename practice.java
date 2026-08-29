import java.util.Scanner;

public class practice {
	public static void main(String[] args) throws InterruptedException {

	Scanner scanner = new Scanner(System.in);

	System.out.print("\n [Server] What is your Adventurer's name? ");
	String adventurersName = scanner.nextLine();

	System.out.print("\n [Server] One moment...");

	Thread.sleep(1500);

	System.out.print("\n\n [Server] Logging in...");	

	Thread.sleep(1500);

	System.out.print("\n\n [Server] You're all set!");

	Thread.sleep(750);

	System.out.print("\n\n ============================================================================================");
	System.out.print("\n\n [ShopKeeper NPC 🧙🏼‍♂️] Greetings, Adventurer! A-Ah you must be " + adventurersName + "!" + " Welcome to my humble shop!\n\n 1 -> What do you sell?\n 2 -> Who are you? \n 3 -> I'll leave.\n\n " + "[" + adventurersName + "]: ");
	int characterAnswer1 = scanner.nextInt();

	// MY VARIABLES START 🚩

	// String adventurersName Ln 9
	// int charactersAnswer1 Ln 24, Ln 38
	// int charactersAnswer2 Ln 59, Ln 61 
	
	// MY VARIABLES END ⛳

	// WHAT TO ADD START 🚩

	// While loops
	// Starting

	// WHAT TO ADD END ⛳

	switch (characterAnswer1) {

		case 1: System.out.print("\n [ShopKeeper NPC 🧙🏼‍♂️] Ah, a curious traveler! I sell all sorts of magical goods! Potions, weapons, armors, you name it!  ");
			System.out.print("\n\n 1 -> Sword \n 2 -> Armor\n 3 -> Health Potion\n 4 -> Mana Potion\n\n" + " [" + adventurersName + "]: ");
	
			break;

		case 2: System.out.print("\n [ShopKeeper NPC 🧙🏼‍♂️] Me? I'm just a humble merchant trying to make a living.");

			break; 

		case 3: System.out.print("\n [ShopKeeper NPC 🧙🏼‍♂️] Safe travels!");
			break;


		default:
			System.out.print("\n [Command Error]");

	}


	int characterAnswer2 = scanner.nextInt();
	
	switch (characterAnswer2) {
		
		case 1: System.out.print("\n [ShopKeeper NPC 🧙🏼‍♂️] That will cost you 2 Silver Coins!  ");
			break;

		case 2: System.out.print("\n [ShopKeeper NPC 🧙🏼‍♂️] That will cost you 3 Silver Coins!  ");
			break;

		case 3: System.out.print("\n [ShopKeeper NPC 🧙🏼‍♂️] That will cost you 1 Silver Coin!  ");
			break;

		case 4: System.out.print("\n [ShopKeeper NPC 🧙🏼‍♂️] That will cost you 1 Silver Coin!  ");
			break;

		default:
			System.out.print("\n [Command Error]");


	}

	scanner.close();
	
	}
}