package com.revature.project.character;

import com.revature.project.monster.Monster;

public class Mage extends Character{
	private String job= "Mage";
	private int health = 30;
	private int damage = 200;
	
	//Constructor
	public Mage() {
		System.out.println("I'm a "+ this.job+ " I have "+ this.getHealth() + " health points!");
	}
	
	// Getter and Setter
	public String getJob() {
		return this.job;
	}
	
	public int  getHealth() {
		return this.health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	// End Getter and Setter
	
	// Override
	public int attack(Monster m) {
		System.out.println("The " + this.job + " attack."+ " The " + m.getType() +" loses "+ this.damage + " point");
		return m.getHealth() - this.damage;
	}
}
