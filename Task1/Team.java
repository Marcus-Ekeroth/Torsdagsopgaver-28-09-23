class Team{

	//1.c
	private String teamName;
	//1.d
	private int rank;
	//1.e
	private String name;

	//1.f
	public Team(String nameOfTeam){

		this.teamName = nameOfTeam;
	}


	//1.h
	public void setRank(int rankNumber){

		this.rank = rankNumber;
	}

	//1.j
	public String toString(){

		String s = "Hold: "+ this.teamName + ": " + this.rank;
		return s;
	}
}