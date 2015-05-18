import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.Enum.*;

/* important shit to do:
 - Include checker so each event only happens once
 - fully implement items
 */
/* Ideas
 * Option to use the force
 * 
 */
public class Eventy {
	int speed;
	int position;
	int choice;
	ArrayList<String> items;
	public Eventy() {
		speed = 2;
		position = 0;
		choice = 0;
		items = new ArrayList<String>();
	}

	Scanner u = new Scanner(System.in);

	public int ev0(int p) {// No event, you proceed normally @Troy
		position = p;
		System.out
				.println("Hmmm, that's weird... you encountered nothing on your travel, you walked onward feeling a little bored");
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

	public int ev3(int p) { //White Rabbit @Troy&Nick
		position = p;
		System.out.println("There is white rabbit in the road, it looks rather fluffy and cute");
		System.out.println("(1) Reach out and pet it ");
		System.out.println("(2) Ignore it and move on ");
		choice = u.nextInt();
		switch (choice) {
		case 1:
			System.out.println("IT IS THE RABBIT!!!");
			System.out.println("You died horribly, it was gruesome");
			position = -1;
			break;
		case 2:
			System.out.println("Probably a good idea, it's better to avoid cuteness");
			position += speed;
			break;
		default:
			System.out
					.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
			position = 0;
			break;
		}
		return position;
	}

	public int ev4(int p) { //Stolen Shoe @Troy
		position = p;
		System.out.println("You encountered a squirrel, it tricked you and stole your shoe. Your speed has been diminished");
		choice = u.nextInt();
		speed -= 1;
		position += speed;
		return position;
	}
	
	public int ev5(int p) { // LOLRUS (Korean Jesus) @Troy
		position = p;
		System.out.println("You encountered the LOLRUS, he seems quite content with the bucket he has in his flippers");
		System.out.println("(1) Steal his bucket");
		System.out.println("(2) Leave him be");
		choice = u.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You stole his bucket, he seems quite sad... As you carefully place the bucket in your backpack you begin to worry that you have upset Korean Jesus");
			items.add("Bucket");
			position += speed;
			break;
		case 2:
			System.out.println("You are a wonderful human being, Korean Jesus smiles upon you, your speed has increased");
			speed += 2;
			position += speed;
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
		System.out.println("(1) ");
		System.out.println("(2) ");
		choice = u.nextInt();
		switch (choice) {
		case 1:
			System.out.println("");
			position += speed;
			break;
		case 2:
			System.out.println("");
			position += speed;
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
