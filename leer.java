import java.util.Scanner;

public class leer {

	private static Scanner read;

	public static void KD() {
		read = new Scanner(System.in);
		String ratio;
		System.out.print("What is you average KD?");
		ratio = read.next();
		System.out.print("wow!" + ratio + "!, that is really good.");

	}

	public static void FavoriteChar() {
		read = new Scanner(System.in);
		String smasher;
		System.out.println("Who do you prefer? Captain Falcon? Mario? Marth?");
		smasher = read.next();
		switch (smasher) {
		case "Captain Falcon":
			System.out.println("Unstoppable with the KNEE!");
			break;
		case "Mario":
			System.out.print("Very well.. A classic");
			break;
		case "Marth":
			System.out.println("My favorite Character.  He is kinda OP..favorite.");
			break;
		default:
			System.out.println("I am sure they're a good choice.");
			break;
		}
	}

	public static void HelpRanger() {
		read = new Scanner(System.in);
		String forest;
		System.out.println("Would you rather save fires or plant new species of plants?");
		forest = read.next();
		if (forest.equalsIgnoreCase("save")) {
			System.out.println("Very brave of you!");
		} else if (forest.equalsIgnoreCase("plant")) {
			System.out.println("Way to plan for the future!");
		}
	}

	public static void Breakfast() {
		read = new Scanner(System.in);
		String bfood;
		System.out.println("Do you prefer Denny's or IHOP?");
		bfood = read.next();
		if (bfood.equalsIgnoreCase("Denny's")) {
			System.out.println("Get the steak and eggs!");
		} else if (bfood.equalsIgnoreCase("IHOP")) {
			System.out.println("Don't skimp on the pancakes!");
		}

	}

	public static void Korea() {
		read = new Scanner(System.in);
		String todo;
		System.out.println("Nightlife? Historical? Eat?");
		todo = read.next();
		switch (todo) {
		case "Nightlife":
			System.out.println("Go drink Soju in Hongdae");
			break;
		case "Historical":
			System.out.print("Visit the Northern Palace");
			break;
		case "Eat":
			System.out.println("Korean BBQ is a must!");
			break;
		default:
			System.out.println("Let me know how that goes!");
			break;
		}
	}

	public static void Brazil(){
		read = new Scanner(System.in);
		String todo;
		System.out.println("Nightlife? Historical? Eat?");
		todo = read.next();
		switch (todo) {
		case "Nightlife":
			System.out.println("Drinks on the beach!");
			break;
		case "Historical":
			System.out.print("Don't know much, but their soccer team is amazing");
			break;
		case "Eat":
			System.out.println("Their cinnamon pinapple is to die for!");
			break;
		default:
			System.out.println("Let me know how that goes!");
			break;
	}
}
}