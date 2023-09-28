import java.util.ArrayList;

//4.e

class Main{
	
	public static void main(String[] args){

		//4.f
		ArrayList<String> actions = new ArrayList<>();
		actions.add("1) Start Game");
		actions.add("2) Resume Game");
		actions.add("3) Pause Game");
		actions.add("4) End Game");
		
		//4.g
		GameMenu menu = new GameMenu(actions);

		//4.i
		menu.displayMenu();
	}
}