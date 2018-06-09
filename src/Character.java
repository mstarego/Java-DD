import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public abstract class Character {

	private double strength, speed, constitution, intelligence, wisdom, charisma, dexterity, health, xPos, yPos;
	private int gold;
	private Point point;
	private Weapon equippedWeapon;
	private Armor equippedArmor;
	private Heal equippedHeal;
	private Shield equippedShield;
	private Tool equippedTool;
	Die d25 = new Die(25);
	public ArrayList<Item> inventory;
	
	public Character() {
		xPos = 2.5;
		yPos = 2.5;
		health = 0;
		strength = 0;
		speed = 0;
		constitution = 0;
		intelligence = 0;
		dexterity = 0;
		gold = 0;
		inventory = new ArrayList<Item>();
	}
	
	public Character(double startingXPos, double startingYPos, double hp, double str, double spd, double tgh, double agi, double dxt, int startingGold) {
		xPos = startingXPos;
		yPos = startingYPos;
		health = hp;
		strength = str;
		speed = spd;
		constitution = tgh;
		intelligence = agi;
		dexterity = dxt;
		gold = startingGold;
		inventory = new ArrayList<Item>();
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
	public double getConstitution() {
		return constitution;
	}
	public void setConstitution(double con) {
		constitution = con;
	}
	public void increaseConstitution(double con) {
		constitution += con;
	}
	public void decreaseConstitution(double con) {
		constitution -= con;
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
		dexterity -= dxt;
	}
	public double getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(double i) {
		intelligence = i;
	}
	public void increaseIntelligence(double i) {
		intelligence += i;
	}
	public void decreaseIntelligence(double i) {
		intelligence -= i;
	}
	public double getWisdom() {
		return wisdom;
	}
	public void setWisdom(double w) {
		wisdom = w;
	}
	public void increaseWisdom(double w) {
		wisdom += w;
	}
	public void decreaseWisdom(double w) {
		wisdom -= w;
	}
	public double getCharisma() {
		return charisma;
	}
	public void setCharisma(double c) {
		charisma = c;
	}
	public void increaseCharisma(double c) {
		charisma += c;
	}
	public void decreaseCharisma(double c) {
		charisma -= c;
	}
	public int getGoldBalance() {
		return gold;
	}
	public void setGoldBalance(int g) {
		gold = g;
	}
	public void increaseGoldBalance(int g) {
		gold += g;
	}
	public void decreaseGoldBalance(int g) {
		gold  -= g;
	}
	public Weapon getEquippedWeapon() {
		return equippedWeapon;
	}
	public void setEquippedWeapon(Weapon w) {
		equippedWeapon = w;
	}
	public Armor getEquippedArmor() {
		return equippedArmor;
	}
	public void setEquippedArmor(Armor a) {
		equippedArmor = a;
	}
	public Heal getEquippedHeal() {
		return equippedHeal;
	}
	public void setEquippedHeal(Heal h) {
		equippedHeal = h;
	}
	public Shield getEquippedShield() {
		return equippedShield;
	}
	public void setEquippedShield(Shield s) {
		equippedShield = s;
	}
	public Tool getEquippedTool() {
		return equippedTool;
	}
	public void setEquippedTool(Tool t) {
		equippedTool = t;
	}
	public Space getSpace() {
		for(Space space : GameBoard.spaces) {
		if(space.contains(new Point2D.Double(getXPos(), getYPos()))) {
			return space;
		}
		}
		return null;
	}
	public void attack(Character enemy) {
		double dmg = getStrength() + equippedWeapon.getAtkValue();
		damage(dmg, enemy);
		
	}	
	public abstract void ability();
	public void damage(double damageDealt, Character enemy) {
		double realDamage = damageDealt - (enemy.getConstitution() + enemy.getEquippedArmor().getDefValue() + enemy.getEquippedShield().getDefValue())/ 3.0;
		enemy.decreaseHealth(realDamage);
	}
	//move to player
	public boolean isTraversable(Space currentSpace) {
		if(getDexterity() >= currentSpace.getDifficulty()) {
			return true;
		}
		return false;
	}
	
	
	
}
