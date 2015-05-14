import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.Enum.*

/* important shit to do:
 - Include checker so each event only happens once
 - fully implement items
 */

public class Events {
	int speed;
	int position;
	int choice;
	ArrayList<String> items;
	TimeUnit.SECONDS.sleep(1);
	public Events() {
		speed = 2;
		position = 0;
		choice = 0;
		items = new ArrayList<String>();
	}

	Scanner u = new Scanner(System.in);

	public int ev0(int p) {// No event, you proceed normally @Troy
		position = p;
		System.out
				.println("Hmmm, that's weird... you encountered nothing on your travel, you walked forward 4 miles feeling a little bored");
		position += speed;
		return position;
	}

	public int ev1(int p) { // Strange Temple (Korean Jesus) @Troy
		position = p;
		System.out
				.println("You come across a strange temple.");
		System.out.println("(1) Enter");
		System.out.println("(2) Move on");
		choice = u.nextInt();
		switch (choice) {
		case 1:
			System.out
					.println("Korean Jesus welcomes you and grants you his blessing, your speed has been increased by 2 and is now: "
							+ speed);
			position += speed + 8;
			break;
		case 2:
			System.out
					.println("Korean Jesus is disappointed in you, you walk 1 mile");
			position += 1;
			break;
		default:
			System.out
					.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
			position = 0;
			break;
		}
		return position;
	}

	public int ev2(int p) { // Deep Woods (Shulk) @Nick
		position = p;
		System.out
				.println("Deep in the woods you stumble upon an old man who asks, "
						+ "\"Would you like to learn the way of the Monado?\"");
		System.out.println("(1) " + "\"I'm really feeling it!\"");
		System.out.println("(2) "
				+ "Nah, my power levels are already over 9000.\"");
		choice = u.nextInt();
		switch (choice) {
		case 1:
			System.out
					.println("You acquired the Monado! Use it to escape any dangerous situation.");
			items.add("Monado");
			position++;
			break;
		case 2:
			System.out
					.println("You got your ass handed to you by an old man. Thank Korean Jesus the hospital was only 3 miles back.");
			position -= 3;
			break;
		default:
			System.out
					.println("Really, dude? Just choose a valid action. Have fun in hell.");
			position = 0;
			break;
		}
		return position;
	}

	public int ev3(int p) { //
		position = p;
		System.out.println("");
		choice = u.nextInt();
		switch (choice) {
		case 1:
			System.out.println("");
			break;
		case 2:
			System.out.println("");
			break;
		default:
			System.out
					.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
			position = 0;
			break;
		}
		return position;
	}

	public int evcreation(int p) { // Strange Temple (Korean Jesus) @Troy
		position = p;
		System.out.println("");
		choice = u.nextInt();
		switch (choice) {
		case 1:
			System.out.println("");
			break;
		case 2:
			System.out.println("");
			break;
		default:
			System.out
					.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
			position = 0;
			break;
		}
		return position;
	}
}
