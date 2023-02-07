package patikadevclassp2;

import java.util.Random;

public class Fighter {

	private String name;
	private int damage;
	private int health;
	private int weight;
	private int dodge;
	
	Fighter(String name, int damage, int health, int weight, int dodge){
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		if(dodge > 0 && dodge < 100) {
			this.dodge = dodge;
		} else {
			this.dodge = 0;
		}
		
	}
	
	public int hit(Fighter foe) {
		
		if(foe.isDodge()) {
			System.out.println(foe.getName() + " gelen hasari blokladi!");
			System.out.println("-------------------");
			return foe.health;
		}
		if(foe.health - this.damage < 0)
			return 0;
		System.out.println(this.name + "=>" + foe.getName() + " " + this.damage + " hasar vurdu!");
		return foe.health - this.damage;
	}
	
	public boolean isDodge() {
		double randomNumber = Math.random() * 100;
		return randomNumber <= this.dodge;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getDodge() {
		return dodge;
	}

	public void setDodge(int dodge) {
		this.dodge = dodge;
	}
}
