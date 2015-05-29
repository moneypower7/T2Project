import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Events {
	int speed; // determines how many spaces the player move forward
	
	String item; // the item the player choose to use
	
	int position; // the player's location on the board
	
	int choice; // the player's choice of action
	
	ArrayList<String> items;
	
	Scanner sc;
	
	public Events () {
		speed = 4; // default speed
		position = -1; // starting location
		choice = 0; // initialize choice
		items = new ArrayList<String>(); // list of items in inventory
		sc = new Scanner(System.in);
	}
	
	public int ev0 (int p /* p is player's location when the event begins */) {// No
																				// event,
																				// you
																				// proceed
																				// normally
																				// @Troy
		position = p; // sets position in the method
		System.out
				.println("Hmmm, that's weird... you encountered nothing on your travel, you walked forward "
						+ speed + " miles feeling a little bored");
		position += speed; // changes speed accordingly
		
		return position;
	}
	
	public int ev1 (int p /* p is player's location when the event begins */) { // Strange
																					// Temple
																					// (Korean
																					// Jesus)
																					// @Troy
		position = p; // sets position in the method
		System.out.println("You come across a strange temple.");
		System.out.println("(1) Enter");
		System.out.println("(2) Move on");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				speed += 2; // changes speed accordingly
				System.out
						.println("Korean Jesus welcomes you and grants you his blessing, your speed has been increased by 2 and is now: "
								+ speed);
				position += speed + 8; // changes position accordingly
				break;
			case 2:
				System.out
						.println("Korean Jesus is disappointed in you, you walk 1 mile");
				position += 1; // changes position accordingly
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev2 (int p /* p is player's location when the event begins */) { // Deep
																					// Woods
																					// (Shulk)
																					// @Nick
		position = p; // sets position in the method
		System.out
				.println("Deep in the woods you stumble upon an old man who asks, "
						+ "\"Would you like to learn the way of the Monado?\"");
		System.out.println("(1) " + "\"I'm really feeling it!\"");
		System.out.println("(2) "
				+ "Nah, my power levels are already over 9000.\"");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out
						.println("You acquired the Monado! Use it to escape any dangerous situation.");
				items.add("Monado");
				position++; // changes position accordingly
				break;
			case 2:
				System.out
						.println("You got your ass handed to you by an old man. Thank Korean Jesus the hospital was only 3 miles back.");
				position -= 3; // changes position accordingly
				break;
			default:
				System.out
						.println("Really, dude? Just choose a valid action. Have fun in hell.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev3 (int p /* p is player's location when the event begins */) { // White
																					// Rabbit
																					// @Troy&Nick
		position = p; // sets position in the method
		System.out
				.println("There is a white rabbit in the road, it looks rather fluffy and cute");
		System.out.println("(1) Reach out and pet it ");
		System.out.println("(2) Ignore it and move on ");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out.println(" IT IS THE RABBIT!!!");
				System.out.println("You died horribly, it was gruesome");
				position = -1; // changes position accordingly
				break;
			case 2:
				System.out
						.println("Probably a good idea, it's better to avoid cuteness");
				position += speed; // changes position accordingly
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev4 (int p /* p is player's location when the event begins */) { // Stolen
																					// Shoe
																					// @Troy
		position = p; // sets position in the method
		System.out
				.println("You encountered a squirrel, it tricked you and stole your shoe, your speed has been diminished");
		speed -= 1; // changes speed accordingly
		position += speed; // changes position accordingly
		
		return position;
	}
	
	public int ev5 (int p /* p is player's location when the event begins */) { // LOLRUS
																					// (Korean
																					// Jesus)
																					// @Troy
		position = p; // sets position in the method
		System.out
				.println("You encountered the LOLRUS, he seems quite content with the bucket he has in his flippers");
		System.out.println("(1) Steal his bucket");
		System.out.println("(2) Leave him be");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out
						.println("You stole his bucket, he seems quite sad... As you carefully place the bucket in your backpack you begin to worry that you have upset Korean Jesus");
				items.add("Bucket");
				position += speed; // changes position accordingly
				break;
			case 2:
				System.out
						.println("You are a wonderful human being, Korean Jesus smiles upon you, your speed has increased");
				speed += 2; // changes speed accordingly
				position += speed; // changes position accordingly
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev6 (int p /* p is player's location when the event begins */)
			throws IOException, URISyntaxException, InterruptedException { // Do
																			// you
		// want to
		// be god?
		// (Korean
		// Jesus)
		// @Troy
		position = p; // sets position in the method
		System.out
				.println("A strange man with long hair wearing a robe and flipflops approaches you, for some reason he looks strangely familiar");
		System.out.println("\"Would you like to be a god young man?\"");
		System.out.println("(1)\"Yes please\" ");
		System.out
				.println("(2) \"No thank you sir, I am perfectly happy being a human\" ");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				if (Desktop.isDesktopSupported() /* checks if desktop is supported*/) {
					Desktop.getDesktop().browse( // directs default browser to provided url
					new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
				}
				TimeUnit.SECONDS.sleep(10); // no action can be completed for 10 seconds
				System.out
						.println("\"Silly mortal, you shall be spared this time. This time...\"");
				position += speed; // changes position accordingly
				break;
			case 2:
				System.out
						.println("Korean Jesus is proud of you, your speed increases and he moves you forward 3 miles");
				speed += 2; // changes speed accordingly
				position += speed + 3; // changes position accordingly
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev7 (int p /* p is player's location when the event begins */) { // Sketchy
																					// Temple
																					// @Troy&Nick
		position = p; // sets position in the method
		int choice2;
		System.out.println("You pass by a sketchy Temple, it looks very old");
		System.out.println("(1) Enter");
		System.out.println("(2) Move on");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out
						.println("Once inside the temple you come to a fork in the hallway");
				System.out.println("(1) Right");
				System.out.println("(2) Left");
				choice2 = getChoice();
				switch (choice2) { // gives player another choice of action
					case 1:
						System.out
								.println("A boulder fell on you Indiana Jones style, it was gruesome.. You are now dead");
						position = -1; // changes position accordingly
						break;
					case 2:
						System.out
								.println("You made it safely out of the temple and found a mysterious crystal");
						items.add("Mysterious Crystal");
				}
				position += speed; // changes position accordingly
				break;
			case 2:
				System.out.println("You move on without any troubles");
				position += speed; // changes position accordingly
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev8 (int p /* p is player's location when the event begins */) { // Rabbit
																					// Hole
																					// (Korean
																					// Jesus)
																					// @Troy&Nick
		position = p; // sets position in the method
		String choice2; // second choice for player
		int choice3; // third choice for player
		System.out
				.println("You stepped in the wrong hole and a rabbit stole your shoe");
		System.out.println("(1) Reach your hand in ");
		System.out
				.println("(2) Accept your fate and give the rabbit the full pair");
		System.out.println("(3) Inventory");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out.println("The rabbit takes your hand off");
				System.out.println("(1) Reach your other hand in ");
				System.out.println("(2) Accept your fate move on");
				choice3 = getChoice();
				switch (choice3) { // gives player another choice of action
					case 1:
						System.out
								.println("You are literally too stupid to live, god has smitten you... You are now dead, and extra crispy");
						position = -1; // changes position accordingly
						break;
					case 2:
						System.out
								.println("Korean Jesus is proud of you, you move on, a bit slower than before");
						speed -= 1;
						position += speed; // changes speed accordingly
						break;
				}
				break;
			case 2:
				System.out
						.println("You move on, it is a bit slower and muddier now without your shoe");
				speed -= 1; // changes speed accordingly
				position += speed; // changes position accordingly
				break;
			case 3:
				System.out.println("You check your backpack and find: " + items);
				System.out.println("Enter the item you would like to use");
				choice2 = sc.next();
				if (items.toString().toLowerCase().contains(choice2.toLowerCase()) /*makes
																					both strings lowercase, then checks if the given choice of item is in the item list*/) {
					switch (choice2.toLowerCase()) { // gives player a choice of
														// items to use
						case "monado":
							System.out
									.println("A bit overkill, but you know... ya killed it, feeling a little proud of yourself for retrieving your shoe, you move on at an increased pace");
							speed += 3; // changes speed accordingly
							position += speed; // changes position accordingly
							items.remove(items.indexOf("Monado"));
							break;
						case "mysterious crystal":
							System.out
									.println("Turns out its a fire crystal, you smile as the rabbit sizzles, too bad the fire consumed your shoe as well");
							speed += 1; // changes speed accordingly
							items.remove(items.indexOf("Mysterious Crystal"));
							position += speed; // changes position accordingly
							break;
						case "rock":
							System.out
									.println("You bash the rabbit's head in with a sly grin on your face... it was a bit overkill, though.");
							speed += 3; // changes speed accordingly
							items.remove(items.indexOf("Rock"));
							position += speed; // changes position accordingly
							break;
						case "railgun":
							System.out
									.println("You blow the rabbit's head in with a sly grin on your face... it was a bit overkill, though.");
							speed += 3; // changes speed accordingly
							items.remove(items.indexOf("Railgun"));
							position += speed; // changes position accordingly
							break;
						case "bazooka":
							System.out
									.println("You blow the rabbit's head in with a sly grin on your face... it was a bit overkill, though.");
							speed += 3; // changes speed accordingly
							items.remove(items.indexOf("Bazooka"));
							position += speed; // changes position accordingly
							break;
						default:
							System.out
									.println("Really you used your "
											+ choice2
											+ " to try to kill a rabbit?? Well, it did nothing");
							speed -= 1; // changes speed accordingly
							position += speed; // changes position accordingly
					}
				}
				else {
					System.out
							.println("You do not even own this item, you can no longer use items on this event... and it keeps your shoe");
					speed -= 1; // changes speed accordingly
					position += speed; // changes position accordingly
				}
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev9 (int p /* p is player's location when the event begins */) { // Rock
																					// (Korean
																					// Jesus)
																					// @Troy&Nick
		position = p; // sets position in the method
		System.out
				.println("You stub your toe on a rock, you think to yourself \"Hmmmm... this could be useful\" ");
		System.out.println("(1) Pick it up ");
		System.out.println("(2) Leave it be");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out
						.println("You put it in your backpack. It is quite heavy and will probably slow you down. Oh well");
				items.add("Rock");
				speed -= 1; // changes speed accordingly
				position += speed; // changes position accordingly
				break;
			case 2:
				System.out
						.println("Too bad for you... you might need that rock later. ");
				position += speed; // changes position accordingly
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev10 (int p /* p is player's location when the event begins */) { // Lake
																					// @Troy&Nick
		position = p; // sets position in the method
		System.out
				.println("You encounter a large lake with no visible way across");
		System.out.println("(1) Try to swim across ");
		System.out.println("(2) Wander around");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out.println("You decide to try to swim across");
				if (items.contains("Rock")) {
					System.out
							.println("Well thanks to that handy-dandy rock you picked up you were weighed down and drowned");
					position = -1;
				}
				else {
					System.out.println("You made it across safely");
					position += speed + 4;
				}
				break;
			case 2:
				System.out
						.println("You wandered until you found a small ferry and crossed safely");
				position += speed; // changes position accordingly
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev11 (int p /* p is player's location when the event begins */) { // Death
																					// Note
																					// Reference
																					// (Korean
																					// Jesus)
																					// @Troy&Nick
		position = p; // sets position in the method
		System.out.println("You sneak up on an unsuspecting stranger you see");
		System.out.println("(1) Say Hello");
		System.out.println("(2) Access inventory");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out
						.println("You say hello, yet he does not seem to hear you so you move on");
				position += speed; // changes position accordingly
				break;
			case 2:
				item = backpack();
				switch (item.toLowerCase()) { // gives player a choice of items to
												// use
					case "monado":
						System.out
								.println("A bit overkill, but you know... ya killed him, you only have room in your backpack to take one item");
						System.out.println("(1) Black leather-bound notebook");
						System.out.println("(2) Bazooka");
						System.out.println("(3) Railgun");
						choice = getChoice();
						switch (choice) {
							case 1:
								System.out.println("You become the God of the new world");
								position = 100; // changes position accordingly
								break;
							case 2:
								System.out
										.println("You carefully put it into your backpack");
								items.add("Bazooka");
								break;
							case 3:
								System.out
										.println("You carefully put it into your backpack");
								items.add("Railgun");
								break;
							default:
								System.out
										.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
								position = -1; // changes position accordingly
								break;
						}
						position += speed; // changes position accordingly
						items.remove(items.indexOf("Monado")); // removes monado from item list
						break;
					case "mysterious crystal":
						System.out
								.println("Turns out it is a fire crystal, you smile as the stranger sizzles, too bad the fire consumed his items as well");
						speed += 1; // changes speed accordingly
						position += speed; // changes position accordingly
						break;
					case "rock":
						System.out
								.println("You hit him over the head with a rock, he is out cold... you only have room in your backpack to take one item");
						System.out.println("(1) Black leather-bound notebook");
						System.out.println("(2) Bazooka");
						System.out.println("(3) Railgun");
						choice = getChoice();
						switch (choice) {
							case 1:
								System.out.println("You become the God of the new world");
								position = 100; // changes position accordingly
								break;
							case 2:
								System.out
										.println("You carefully put it into your backpack");
								items.add("Bazooka");
								break;
							case 3:
								System.out
										.println("You carefully put it into your backpack");
								items.add("Railgun");
								break;
							default:
								System.out
										.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
								position = -1; // changes position accordingly
								break;
						}
						speed += 1; // changes speed accordingly
						position += speed; // changes position accordingly
						break;
					default:
						System.out
								.println("Using that item accomplished nothing, you move on");
						position += speed; // changes position accordingly
				}
				position += speed; // changes position accordingly
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev12 (int p /* p is player's location when the event begins */) { // Hot
																					// spring
																					// (lovely
																					// women)
																					// @Nick
		position = p; // sets position in the method
		System.out
				.println("The gods are in your favor as you seem to have found a hot spring with some lovely women to match...");
		System.out.println("(1) Approach and see what happens");
		System.out.println("(2) Resist the urge");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out
						.println("You're not quite sure what happened but you feel tired and a bit... sweaty? You definitely feel like slowing down for a bit.");
				speed -= 1;
				position += speed; // changes position accordingly
				break;
			case 2:
				System.out
						.println("You feel like much less of a man but somehow feel like you avoided a crisis. You are hasty in your, well, haste.");
				speed += 2; // changes speed accordingly
				position += speed; // changes position accordingly
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev13 (int p /* p is player's location when the event begins */) { // Desert
																					// (mirage
																					// +
																					// weed)
																					// @Nick
		position = p; // sets position in the method
		System.out
				.println("In the middle of a desert you see some palm trees and some huts in the distance.");
		System.out.println("(1) Approach with caution");
		System.out.println("(2) Run in looking for something to steal");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out.println("You realize it was just a mirage and move on");
				position += speed; // changes position accordingly
				break;
			case 2:
				System.out
						.println("You see some sketchy cigarettes and a lighter just laying there");
				System.out.println("(1) 420 Blaze it, baby!!!");
				System.out.println("(2) Better leave the weed alone...");
				choice = getChoice();
				switch (choice) { // gives player another choice of action
					case 1:
						System.out
								.println("Turns out you were hallucinating and put a scorpion in your mouth. The venom got you.");
						position = -1; // changes position accordingly
						break;
					case 2:
						System.out
								.println("Good thing you said no to drugs! You walk fast feeling rather proud of yourself.");
						speed += 1; // changes speed accordingly
						position += speed; // changes position accordingly
						break;
					default:
						System.out
								.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
						position = -1; // changes position accordingly
						break;
				}
		}
		
		return position;
	}
	
	public int ev14 (int p /* p is player's location when the event begins */) { // Tree
																					// area
																					// (cat)
																					// @Nick
		position = p; // sets position in the method
		System.out
				.println("You stop to rest against a tree and a strange cat approaches you and looks hungry.");
		System.out.println("(1) Turn away and walk off");
		System.out.println("(2) Look around for something to feed it");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out
						.println("You feel bad but you didn't have any food for it anyway. You carry on with your life.");
				position += speed; // changes position accordingly
				break;
			case 2:
				System.out
						.println("In your attempt to be nice, the cat urinates on your map and proceeds to claw it up. Good job. You run back 5 miles to the rest stop to buy another map.");
				position -= 5; // changes position accordingly
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev15 (int p /* p is player's location when the event begins */) { // Hermes
																					// Boots
																					// @Troy
		position = p; // sets position in the method
		System.out
				.println("You found a new pair of shoes, they have a nice set of wings painted on the side");
		System.out.println("(1) Put them on");
		System.out.println("(2) Leave them there and move on");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out
						.println("You should probably have thought this through first but luckily for you they are Hermes\'s boots, Gotta go fast");
				speed += 7; // changes speed accordingly
				position += speed; // changes position accordingly
				break;
			case 2:
				System.out
						.println("THEY HAD WINGS!! WINGS!!!!... and YOU!... YOU turned that shit down!!");
				position += speed; // changes position accordingly
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev16 (int p /* p is player's location when the event begins */) { // Walker
																					// @Troy
		String choice2;
		position = p; // sets position in the method
		System.out
				.println("As you stumble through the woods you come across a Walker");
		System.out.println("(1) Ignore it and jog past it");
		System.out.println("(2) Try to say hello");
		System.out.println("(3) Access Inventory");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out.println("You move on without incident");
				position += speed; // changes position accordingly
				break;
			case 2:
				System.out.println("The noise catches the zoimbie's attention");
				position += speed; // changes position accordingly
				break;
			case 3:
				choice2 = backpack();
				choice2.toLowerCase();
				switch (choice2.toLowerCase()) { // gives player a choice of items
													// to use
					case "monado":
						System.out
								.println("A bit overkill, but you know... ya killed it, feeling a little proud of yourself for preventing an apocalypse, you move on at an increased pace");
						speed += 3; // changes speed accordingly
						position += speed; // changes position accordingly
						items.remove(items.indexOf("Monado"));
						break;
					case "mysterious crystal":
						System.out
								.println("Turns out its a fire crystal, you smile as the zombie sizzles... You probably prevented an apocalypse of some sort, nice job!");
						speed += 3; // changes speed accordingly
						items.remove(items.indexOf("Mysterious Crystal"));
						position += speed; // changes position accordingly
						break;
					case "rock":
						System.out
								.println("You bash the zombie's head in with a sly grin on your face...You probably prevented an apocalypse of some sort. nice job!");
						speed += 3; // changes speed accordingly
						items.remove(items.indexOf("Rock"));
						position += speed; // changes position accordingly
						break;
					case "railgun":
						System.out
								.println("You blow the zombie's head in with a sly grin on your face... You probably prevented an apocalypse of some sort. Nice job!");
						speed += 3; // changes speed accordingly
						items.remove(items.indexOf("Railgun"));
						position += speed; // changes position accordingly
						break;
					case "bazooka":
						System.out
								.println("You blow the zombie's head in with a sly grin on your face... You probably prevented an apocalypse of some sort. Nice job!");
						speed += 3; // changes speed accordingly
						items.remove(items.indexOf("Bazooka"));
						position += speed; // changes position accordingly
						break;
					default:
						System.out.println("Really, you used your "
								+ choice2
								+ " to try to kill a zombie?? Well, it did nothing");
						speed -= 1; // changes speed accordingly
						position += speed; // changes position accordingly
				}
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		
		return position;
	}
	
	public int ev17 (int p /* p is player's location when the event begins */) { // Hutch
																					// Waterfall
																					// @Troy
		position = p; // sets position in the method
		System.out.println("\"Voices bothering you man? Ive been there\"");
		System.out.println("(1) \"Yes! are my fillings picking up the View?\"");
		System.out.println("(2) \"No you are crazy\"");
		choice = getChoice();
		switch (choice) { // gives player a choice of action
			case 1:
				System.out.println("\"You need one of these doo-dangs\"");
				System.out.println("He hands you a foil hat");
				System.out.println("");
				System.out
						.println("\"Thanks again!\" you say as you walk away wearing your new hat");
				speed += 2; // changes speed accordingly
				position += speed; // changes position accordingly
				break;
			case 2:
				System.out
						.println("He did seem a bit odd, so you ignore him and move on");
				position += speed; // changes position accordingly
				break;
			default:
				System.out
						.println("No pity is shown to those who cannot follow the rules of the game. Die, you fiend.");
				position = -1; // changes position accordingly
				break;
		}
		return position;
	}
	
	public String backpack () {
		String choice2;
		System.out.println("You check your backpack and find: " + items);
		System.out.println("Enter the item you would like to use");
		choice2 = sc.next();
		if (items.toString().toLowerCase().contains(choice2.toLowerCase())/*makes both strings lowercase,
																			then checks if the given string is in the item list*/) {
			return choice2;
		}
		else {
			System.out
					.println("The item you entered is not in your backpack, you can no longer use items for this event");
			return null;
		}
		
	}
	
	public int getChoice () {
		
		int i = -1;
		
		try {
			
			i = sc.nextInt();
			
		}
		catch (NumberFormatException e) {
			
		}
		catch (InputMismatchException e) {
			
		}
		
		return i;
		
	}
}
