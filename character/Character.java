package com.revature.project.character;

import com.revature.project.monster.Monster;

public class Character {
	private String job= "A Random Human";
	private int health = 10;
	private int damage;
	
	public int  getHealth() {
		return this.health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void talk() {
		System.out.println("And I'm the main Character");
	}
	
	// Will be Override
	public int attack(Monster m) {
		System.out.println("The " + this.job + " attack."+ " The " + m.getType() +" loses "+ this.damage + " point");
		return m.getHealth() - this.damage;
	}
	
}
