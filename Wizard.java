
/*
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 */

public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	private boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		this.name = "";
		this.health = 0;
		this.key = 0;
		this.locked = false;
	}//end empty constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name, int health, int key, boolean locked) {
		this.key = key;
		this.locked = false;
		setName(name);
		setHealth(health);
		
	}//end preferred constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 * @return 
	 */
	public void takeDamage(int power) {
		
		
		if (isLocked() == false) {
			health -= power;
		}//end if
		
	}//end takeDamage
	
	@Override
	public void lock(int key) {
		if (key == getKey()) {
			locked = true;
		}//end if
	}//end lock

	@Override
	public void unlock(int key) {
		if (key == getKey()) {
			locked = false;
			
		}//end if
	}//end unlock

	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//end setName

	public int getHealth() {
		return health;
	}//end getHealth

	public void setHealth(int health) {
		this.health = health;
	}//end setHealth

	public int getKey() {
		return key;
	}//end getKey

	public void setKey(int key) {
		
		if (key > 0 && this.key == 0) {
			this.key = key;
			
		}//end if
	}//end setKey

	public boolean isLocked() {
		return locked;
	}//end isLocked

	public void setLocked(boolean locked) {
		this.locked = locked;
	}//end setLocked
	
	@Override
	public String toString() {
		return "Wizard [Name: " + name + ", Health: " + health + ", Key: " + key + ", Locked: " + locked + "]";
	}//end toString
	
}//end class

