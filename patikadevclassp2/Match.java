package patikadevclassp2;

import java.util.Random;

public class Match {

	Fighter f1;
	Fighter f2;
	
	private int minWeight;
	private int maxWeight;
	
	public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		if(fpCheck(f1, f2)) {
			this.f1 = f1;
			this.f2 = f2;
		} else {
			this.f1 = f2;
			this.f2 = f1;
		}
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	
	private boolean fpCheck(Fighter f1, Fighter f2) {
		Random rand = new Random();
		int randNum = rand.nextInt(2);
		if(randNum == 0) {
			System.out.println(f1.getName() + " ilk hamleyi yapacak.");
			return true;
		} else {
			System.out.println(f2.getName() + " ilk hamleyi yapacak.");
			return false;
		}
	}

	public void run() {
		if (isCheck()) {
			while(this.f1.getHealth() > 0 && this.f2.getHealth() > 0) {
				System.out.println("----------");
				System.out.println("Yeni Round");
				System.out.println("----------");
				this.f2.setHealth(this.f1.hit(f2));
				if(isWin()) {
					break;
				}
				this.f1.setHealth(this.f2.hit(f1));
				if(isWin()) {
					break;
				}
				System.out.println(this.f2.getName() + " Health: " + this.f2.getHealth());
				System.out.println(this.f1.getName() + " Health: " + this.f1.getHealth());
				System.out.println("-------------------");
			}
		} else {
			System.out.println("Sporcularin sikletleri uygun degil!");
		}
	}
	

	public boolean isWin() {
		if(this.f1.getHealth() == 0) {
			System.out.println(this.f2.getName() + " kazandi!");
			return true;
		} if (this.f2.getHealth() == 0) {
			System.out.println(this.f1.getName() + " kazandi!");
			return true;
		}
		return false;
	}
	

	private boolean isCheck() {
		if((this.f1.getWeight() >= this.minWeight && this.f2.getWeight() >= this.minWeight) 
				&& this.f1.getWeight() <= this.maxWeight && this.f2.getWeight() <= this.maxWeight)
			return true;
		return false;
	}
}
