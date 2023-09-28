import java.util.ArrayList;

//4.a
class GameMenu{

//4.b
	private ArrayList<String> actions = new ArrayList<>();

//4.c
	public GameMenu(ArrayList<String> arrlist){

		//4.d
		this.actions = arrlist;

	}

//4.h
	public void displayMenu(){

		for(String s: actions){
			System.out.println(s);
		}
	}
}