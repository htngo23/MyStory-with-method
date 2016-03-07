import java.util.Scanner;

public class story {
	public static void main(String[] args) {
		{
			Scanner read = new Scanner(System.in);

			String choice = "";
			String job = "";
			String sport = "";
			String play = "";
			String games = "";
			String munch = "";
			String drink = "";
			String vacation = "";

			System.out.println("What do you want to do 1,2,3,4,5?");
			choice = read.nextLine();

			switch (choice) {
			case "1":
				System.out.println("Do you like shooting or fighting games?");
				games = read.next();
				if (games.equalsIgnoreCase("shooting")) {
					System.out.println("lets play halo");
					leer.KD();
				} else if (games.equalsIgnoreCase("fighting")) {
					System.out.println("lets play project m because brawl is childish");
					leer.FavoriteChar();
				}
				break;
			case "2":
				System.out.println("do you prefer to work in a office or forest?");
				job = read.next();
				if (job.equalsIgnoreCase("office")) {
					System.out.println("go work at EPIC");
				} else if (job.equalsIgnoreCase("forest")) {
					System.out.println("You are now a park ranger");
					leer.HelpRanger();
				}
				break;
			case "3":
				System.out.println("Do you like breakfast food or soups");
				munch = read.next();
				if (munch.equalsIgnoreCase("breakfast")) {
					System.out.println("IHOP or Denny's would be good");
					leer.Breakfast();
				} else if (munch.equalsIgnoreCase("soups")) {
					System.out.println("Pozole or pho sounds great!");
				}
				break;
			case "4":
				System.out.println("Do you want to drink beer or mimosas?");
				drink = read.next();
				if (drink.equalsIgnoreCase("beer")) {
					System.out.println("I prefer a Heinekin please!");
				} else if (drink.equalsIgnoreCase("mimosas")) {
					System.out.println("See you tomorrow at sunday brunch!");
				}
				break;
			case "5":
				System.out.println("Perhaps a Vacation? Korea or Brazil");
				vacation = read.next();
				if (vacation.equalsIgnoreCase("Korea")) {
					System.out.println("They have awesome internet!  Just don't go too far north!");
				} else if (vacation.equalsIgnoreCase("Brazil")) {
					System.out.println("Good choice, beautiful place to go");
				}
				break;
			default:
				System.out.println("Did I stutter?");
				break;
			}
		}
	}

}
