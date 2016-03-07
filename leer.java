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
}
