package Project;

public class Player {
	private String name; 
	private int goal;
	private int assist;
	
	public Player() {}
	
	public Player(String name,int goal,int assist) {
		this.name = name;
		this.goal = goal;
		this.assist = assist;
	}
    //String name �̴ϱ� public void �� �ƴ� public String
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//int goal �̴ϱ� public void �� �ƴ� public int
	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}
}
