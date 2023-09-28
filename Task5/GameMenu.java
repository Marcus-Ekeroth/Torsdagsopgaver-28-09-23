import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{

	private ArrayList<String> actions = new ArrayList<>();

	public GameMenu(ArrayList<String> arrlist){

		this.actions = arrlist;

	}

	public void displayMenu(){

		for(String s: actions){
			System.out.println(s);
		}
	}

	//5.a
	public String getAction(){

		System.out.println("Type a number to choose an action");

		for(String s: actions){
			System.out.println(s);
		}

		//5.b
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();

		//5.c
		return choice;
	}

	//5.d
	public static void doAction(int action){

		//5.f
		switch(actions){
		case 0:
			System.out.println("Starting the game now");
			break;
		case 1:
			System.out.println("Fetching previously saved game data");
			break;
		case 2:	
			System.out.println("Game paused");
			break;
		case 3:
			System.out.println("Ending game");
			break;
		}
	}
}