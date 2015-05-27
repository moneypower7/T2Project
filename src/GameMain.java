import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class GameMain {

	public static void main(String[] args) throws IOException,
			URISyntaxException, InterruptedException { // Main Idea is that the
														// player is on a road
														// and comes across
														// different events as
														// they progress,
														// similar to board game
														// online

		int position, event, choice,revive;
		revive = 1;
		while (revive!=2) {
			Scanner u = new Scanner(System.in);
			ArrayList<Integer> events = new ArrayList<Integer>(); // list of
																	// possible
																	// events
			position = 0; // sets initial position
			Events e = new Events(); // creates an instance of the Events class
			Random random = new Random(); // creates RNG
			while (position < 100 && position != -1) { // has player do a new
														// event
														// while they have not
														// yet
														// reached the finish
														// line
														// and have not died
				System.out.println("Your position is " + position); // tells you
																	// your
																	// position
				event = random.nextInt(14) + 1; // chooses one of the events
				while (events.contains(event)) {
					event = random.nextInt(17) + 1;
				}
				events.add(event);
				/*
				 * /case (any): position = events.methodofevent(position); (The
				 * method will return the position, this way based on the event
				 * and how they handle the event the player can move forward or
				 * backward)
				 */
				switch (event) {
				case 1:
					position = e.ev1(position);
					break;
				case 2:
					position = e.ev2(position);
					break;
				case 3:
					position = e.ev3(position);
					break;
				case 4:
					position = e.ev4(position);
					break;
				case 5:
					position = e.ev5(position);
					break;
				case 6:
					position = e.ev6(position);
					break;
				case 7:
					position = e.ev7(position);
					break;
				case 8:
					position = e.ev8(position);
					break;
				case 9:
					position = e.ev9(position);
					break;
				case 10:
					position = e.ev10(position);
					break;
				case 11:
					position = e.ev11(position);
					break;
				case 12:
					position = e.ev12(position);
					break;
				case 13:
					position = e.ev13(position);
					break;
				case 14:
					position = e.ev14(position);
					break;
				case 15:
					position = e.ev15(position);
					break;
				case 16:
					position = e.ev16(position);
					break;
				case 17:
					position = e.ev17(position);
					break;
				}
				choice = 3;
				if (position != -1) { // if you have not died
					while (choice != 2) { // while you haven't chosen to move on
						System.out.println("(1) Check Inventory");
						System.out.println("(2) Move On");
						choice = u.nextInt(); // user chooses what to do
						switch (choice) { // lets user choose an item
						case 1:
							System.out
									.println("You have these items in your backpack:"
											+ e.items);
							break;
						case 2:
							break;
						default:
							System.out
									.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
							position = -1;
							break;
						}
					}
				}

				int x;
				if (position != -1) { // if you have not died
					for (x = 0; x < 20; x++) { // iterates through 20 lines to
												// clear
												// the screen between events
						System.out.println("");
					}
				}
			}
			if (position > 100) { // win message
				System.out
						.println("Congratulations! You have reached your destination");
			} else {
				System.out
						.println("You failed the test of life, nice work... you should probably study harder next time");
				System.out.println("\"Would you like to try again young man?\"  Says Korean Jesus");
				System.out.println("(1) \"Yes! Please revive me Senpai\"");
				System.out.println("(2) \"No thanks, I hated my life anyway\"");
				
			}
		}
	}

}
