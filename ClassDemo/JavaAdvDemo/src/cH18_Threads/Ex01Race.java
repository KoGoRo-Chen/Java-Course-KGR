package cH18_Threads;

public class Ex01Race {
	private boolean completed = false;
	private int winner = 0;
	private Ex01Horse[] horses;
	
	public boolean isCompleted() {
		return completed;
	}
	
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	public int getWinner() {
		return winner;
	}
	
	public void setWinner(int winner) {
		this.winner = winner;
	}
	
	public Ex01Race() {
		horses = new Ex01Horse[] {
				new Ex01Horse(this, 1),
				new Ex01Horse(this, 2),
				new Ex01Horse(this, 3),
				new Ex01Horse(this, 4),
				new Ex01Horse(this, 5)};
	}
	
	public void gameStart() {
		for(Ex01Horse h : horses)
			h.start();
	}
	
	public void reportStatus() {
		for(Ex01Horse h : horses)
			System.out.printf("%d\t", h.getDistance());
		System.out.println();
	}
	
	public static void main(String[] args) {
		Ex01Race race1 = new Ex01Race();
		race1.gameStart();
		System.out.println("===============比賽開始===============");
		System.out.println("No1\tNo2\tNo3\tNo4\tNo5");
		System.out.println("====================================");
		while(!race1.completed) {
			race1.reportStatus();
			try {
				Thread.sleep(100);
			} catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		race1.reportStatus();
		System.out.println("====================================");
		System.out.printf("比賽結束, %d號馬獲勝!", race1.winner);
	}
}

