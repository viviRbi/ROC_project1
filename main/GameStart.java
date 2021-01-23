package com.revature.project.main;

import com.revature.project.character.Mage;
import com.revature.project.character.Warrior;
import com.revature.project.monster.Monster;

public class GameStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mage p1 = new Mage();
		p1.talk();
		
		Warrior p2 = new Warrior();
		System.out.println("----------------");
		Monster m = new Monster();
		m.appear();
		
		int mHealth = p1.attack(m);
		m.setHealth(mHealth);
		m.checkStatus();
		System.out.println("----------------");
		
		int healthLeft = m.attack(p2);
		p2.setHealth(healthLeft);
		System.out.println("The warrior has " + p2.getHealth()+ " healthpoint left");
	}

}
