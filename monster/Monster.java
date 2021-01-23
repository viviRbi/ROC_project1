package com.revature.project.monster;

import com.revature.project.character.Mage;
import com.revature.project.character.Warrior;

public class Monster {
	private String type = "Random Monter";
	private int health;
	private int damage;
	
	//Constructor
	public Monster(){
		this.health = (int) (300 + (Math.random() * 1000));
	}
	
	// Getter and Setter
	public int  getHealth() {
		return this.health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public String getType() {
		return this.type;
	}
	// End Getter and Setter
	
	public void appear() {
		System.out.println("The monster appeared. It has "+ this.getHealth() + " points.");
	}
	
	public void checkStatus() {
		System.out.println("The " + this.getType() +" has "+ this.getHealth() + " left!");
	}
	
	// Overloading
	public int attack(Mage c) {
		this.damage = (int) (5 + (Math.random() * 40));
		System.out.println("The " + this.type + " attacks."+ " The " + c.getJob() +" loses "+ this.damage + " point");
		return c.getHealth() - this.damage;
	}
	
	public int attack(Warrior c) {
		this.damage = (int) (5 + (Math.random() * 40));
		System.out.println("The " + this.type + " attacks."+ " The " + c.getJob() +" loses "+ this.damage + " point");
		return c.getHealth() - this.damage;
	}
	// End Overloading
}
