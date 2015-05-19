import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) throws IOException,
			URISyntaxException, InterruptedException { // Main Idea is that the
														// player is on a road
														// and comes across
														// different events as
														// they progress,
														// similar to board game
														// online
		// TODO Auto-generated method stub
		int position, event, choice;
		Scanner u = new Scanner(System.in);
		position = 0;
		Events e = new Events();
		Random random = new Random();
		System.out.println(position);
		while (position < 100 && position >= 0) {
			System.out.println("Your position is " + position);
			event = random.nextInt(8) + 1;
			/*
			 * /case (any): position = events.methodofevent(position); (The
			 * method will return the position, this way based on the event and
			 * how they handle the event the player can move forward or
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
			}
			choice = 3;

			while (choice != 1) {
				System.out.println("(1) Check Inventory");
				System.out.println("(2) Move On");
				choice = u.nextInt();
				switch (choice) {
				case 1:
					System.out.println("You have these items in your backpack:"
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
			int x;
			for (x=0;x<20;x++){
				System.out.println("");
			}
		}

	}

}
