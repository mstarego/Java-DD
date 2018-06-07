import java.awt.*;
import java.util.ArrayList;

public abstract class Character {

	private double strength, speed, toughness, agility, dexterity, health, xPos, yPos;
	private Point point;
	private Item equippedWeapon;
	private Armor equippedArmor;
	private Heal equippedHeal;
	private Shield equippedShield;
	private Tool equippedTool;
	public ArrayList<Item> inventory;
	
	public Character(double startingXPos, double startingYPos, double hp, double str, double spd, double tgh, double agi, double dxt) {
		xPos = startingXPos;
		yPos = startingYPos;
		health = hp;
		strength = str;
		speed = spd;
		toughness = tgh;
		agility = agi;
		dexterity = dxt;
		inventory = new ArrayList<Item>();
	}

	
	public Character(double startingXPos, double startingYPos, double hp, double str, double spd, double tgh, double agi, double dxt, Weapon w, Armor a, Heal h, Shield s, Tool t) {
		xPos = startingXPos;
		yPos = startingYPos;
		health = hp;
		strength = str;
		speed = spd;
		toughness = tgh;
		agility = agi;
		dexterity = dxt;
		inventory = new ArrayList<Item>();
		inventory.add(w);
		inventory.add(a);
		inventory.add(h);
		inventory.add(s);
		inventory.add(t);
		equippedWeapon = w;
		equippedArmor = a;
		equippedHeal = h;
		equippedShield = s;
		equippedTool = t;
		
		
		
	}
	public double getXPos() {
		return xPos;
	}
	public void setXPos(double x) {
		xPos = x;
	}
	public void increaseXPos(double x) {
		xPos += x;
	}
	public void decreaseXPos(double x) {
		xPos -= x;
	}
	public double getYPos() {
		return yPos;
	}
	public void setYPos(double y) {
		yPos = y;
	}
	public void increaseYPos(double y) {
		yPos += y;
	}
	public void decreaseyPos(double y) {
		yPos -= y;
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(int x, int y) {
		point = new Point(x, y);
	}
	public double getHealth() {
		return health;
	}
	public void setHealth(double hp) {
		health = hp;
	}
	public void increaseHealth(double hp) {
		health += hp;
	}
	public void decreaseHealth(double hp) {
		health -= hp;
	}
	public double getStrength() {
		return strength;
	}
	public void setStrength(double str) {
		strength = str;
	}
	public void increaseStrength(double str) {
		strength += str;
	}
	public void decreaseStrength(double str) {
		strength -= str;
	}
	public double getToughness() {
		return toughness;
	}
	public void setToughness(double tgh) {
		toughness = tgh;
	}
	public void increaseToughness(double tgh) {
		toughness += tgh;
	}
	public void decreaseToughness(double tgh) {
		toughness -= tgh;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double spd) {
		speed = spd;
	}
	public void increaseSpeed(double spd) {
		speed += spd;
	}
	public void decreaseSpeed(double spd) {
		speed -= spd;
	}
	public double getDexterity() {
		return dexterity;
	}
	public void setDexterity(double dxt) {
		dexterity = dxt;
	}
	public void increaseDexterity(double dxt) {
		dexterity += dxt;
	}
	public void decreaseDexterity(double dxt) {
		agility -= dxt;
	}
	public double getAgility() {
		return agility;
	}
	public void setAgility(double agi) {
		agility = agi;
	}
	public void increaseAgility(double agi) {
		agility += agi;
	}
	public void decreaseAgility(double agi) {
		agility -= agi;
	}
	public Item getEquippedWeapon() {
		return equippedWeapon;
	}
	public void setEquippedWeapon(Weapon w) {
		equippedWeapon = w;
	}
	public Item getEquippedArmor() {
		return equippedArmor;
	}
	public void setEquippedArmor(Armor a) {
		equippedArmor = a;
	}
	public Item getEquippedHeal() {
		return equippedHeal;
	}
	public void setEquippedHeal(Item h) {
		equippedWeapon = h;
	}
	public Item getEquippedShield() {
		return equippedShield;
	}
	public void setEquippedShield(Shield s) {
		equippedShield = s;
	}
	public Item getEquippedTool() {
		return equippedTool;
	}
	public void setEquippedTool(Tool t) {
		equippedTool = t;
	}
	public void attack(Character enemy) {
		double dmg = getStrength() + equippedWeapon.getAtkValue();
		damage(dmg, enemy);
		
	}	public abstract void ability();
	public void damage(double damageDealt, Character enemy) {
		double realDamage = damageDealt - (enemy.getToughness() + enemy.getEquippedArmor().getDefValue() + enemy.getEquippedShield().getDefValue())/ 3.0;
		enemy.decreaseHealth(realDamage);
	}
	//move to player
	public abstract boolean isTraversable(Space currentSpace);
	
	
	
}
