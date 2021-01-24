package com.revature.project.character;

import com.revature.project.monster.Monster;

//Inherit from Character. Morph to Warrior
public class Warrior extends Character{
	private String job= "Warrior";
	private int health = 50;
	private int damage = 100;
	
	//Constructor
	public Warrior() {
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
	
	// Override Character Class method
		public int attack(Monster m) {
			System.out.println("The " + this.job + " attack."+ " The " + m.getType() +" loses "+ this.damage + " points");
			return m.getHealth() - this.damage;
		}
}
