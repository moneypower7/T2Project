import java.util.Scanner;
public class Events { //Everyone in the group can add their own events, they can be however funny or serious you want them to be, I have added an event so that you can see how the setup might/will look. We can adjust the rarity of each event later
	Scanner u = new Scanner(System.in);
	public int ev0(int p){//No event, you proceed normally
		int position = p;
		System.out.println("Hmmm, that's weird... you encountered nothing on your travel, you walked forward 4 miles feeling a little bored"); //We can either use miles or spaces if we want to make it like a board game
		position += 4;
		return position;
	}
	public int ev1(int p){
		int position = p;
		int choice;
		System.out.println("You come across a strange temple, would you like to enter? (1) Yes (2) No");
		choice = u.nextInt();
		switch (choice){
		case 1:
			System.out.println("Korean Jesus welcomes you and grants you his blessing, feeling loved you walk 8 miles");
			position += 8;
		case 2:
			System.out.println("Korean Jesus is dissapointed in you, you walk 1 mile");
			position+=1;
		}
		return position;
	}
}