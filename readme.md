# Example of inheritance and polymorphism
***

In this project, I create 3 packages, Main package hold the GameStart class which run the entire program. Character package had a Character parent class and two subclass: Mage and Warrior 

This project contains: 
- Getters and Setters (appeared in all classes in Monster, Character Package)
- Method Overloading (appeared in Monster class attack method from line 39-49)
- Constructor (can be seen in Mage, Warrior, Monster class)
- Different methods (can be seen in every class)
- Method overriding in the child class (appeared in Attack method in Warrior, Mage class from line 31-34)
- Inheritance (can be seen in Talk method from line 18-20, the fields from line 6-8)

Result:
```
I'm a Mage I have 30 health points!
And I'm the main Character
I'm a Warrior I have 50 health points!
----------------
The monster appeared. It has 334 points.
The Mage attack. The Random Monter loses 200 point
The Random Monter has 134 left!
----------------
The Random Monter attacks. The Warrior loses 31 point
The warrior has 19 healthpoint left
```