class Main{

	public static void main(String[] args){

		//1.g
		Team team1 = new Team("Hold F");

		//1.i
		team1.setRank(1);

		//1.k
		Team team2 = new Team("Hold M");
		Team team3 = new Team("Hold J");
		Team team4 = new Team("Hold Z");
		Team team5 = new Team("Hold W");
		Team team6 = new Team("Hold L");

		team2.setRank(2);
		team3.setRank(3);
		team4.setRank(4);
		team5.setRank(5);
		team6.setRank(6);
		
		System.out.println(team1.toString());
		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());
		System.out.println(team6.toString());
	}	
}