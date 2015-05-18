import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.ArrayList;

public class GameMain {

	public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException{ //Main Idea is that the player is on a road and comes across different events as they progress, similar to board game online
		// TODO Auto-generated method stub
		int position,event;
		position = 0;
		Events e = new Events();
		Random random = new Random();
		System.out.println(position);
		while (position<100 && position>=0){
			System.out.println("Your position is "+ position);
			event = random.nextInt(8)+1;
			switch (event){
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
			/*/case (any):
			 * position = events.methodofevent(position); (The method will return the position, this way based on the event and how they handle the event the player can move forward or backward)
			 */
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}

	}

}
