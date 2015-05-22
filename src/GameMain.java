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
		// TODO Auto-generated method stub
		int position, event, choice;
		Scanner u = new Scanner(System.in);
		ArrayList<Integer> events = new ArrayList<Integer>();
		position = 0;
		Events e = new Events();
		Random random = new Random();
		while (position < 100 && position !=-1) {
			System.out.println("Your position is " + position);
			event = random.nextInt(14) + 1;
			while (events.contains(event)) {
				event = random.nextInt(17) + 1;
			}
			events.add(event);
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
			if (position != -1) {
				while (choice != 2) {
					System.out.println("(1) Check Inventory");
					System.out.println("(2) Move On");
					choice = u.nextInt();
					switch (choice) {
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
			if (position != -1){
				for (x = 0; x < 20; x++) {
				System.out.println("");
				}
			}
		}
		if (position>100){
			System.out.println("Congratulations! You have reached your destination");
		}else{
			System.out.println("");
		}
	}

}
