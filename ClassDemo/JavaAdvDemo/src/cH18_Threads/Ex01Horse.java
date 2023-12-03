package cH18_Threads;

public class Ex01Horse extends Thread {
	private Ex01Race race;
	private int track;
	private int distance;
	
	public Ex01Horse(Ex01Race race, int track) {
		this.race = race;
		this.track = track;
		this.distance = 0;
	}
	/*horse類別建構子)*/
	
	public int getDistance() {
		return distance;
	}
	
	@Override
	public void run() {
		while(!race.isCompleted()) {
			this.distance += Math.random()*10;
			if(this.distance>=100) {
				this.distance=100;
				race.setWinner(this.track);
				race.setCompleted(true);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		
	}

}
