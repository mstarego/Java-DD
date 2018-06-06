import java.awt.*;

public abstract class Character {

	private int strength, speed, toughness, agility, dexterity, xPos, yPos;
	private Point point;
	
	public int getXPos() {
		return xPos;
	}
	public void setXPos(int x) {
		xPos = x;
	}
	public void increaseXPos(int x) {
		xPos += x;
	}
	public void decreaseXPos(int x) {
		xPos -= x;
	}
	public int getYPos() {
		return yPos;
	}
	public void setYPos(int y) {
		yPos = y;
	}
	public void increaseYPos(int y) {
		yPos += y;
	}
	public void decreaseyPos(int y) {
		yPos -= y;
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(int x, int y) {
		point = new Point(x, y);
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int str) {
		strength = str;
	}
	public void increaseStrength(int str) {
		strength += str;
	}
	public void decreaseStrength(int str) {
		strength -= str;
	}
	public int getToughness() {
		return toughness;
	}
	public void setToughness(int tgh) {
		toughness = tgh;
	}
	public void increaseToughness(int tgh) {
		toughness += tgh;
	}
	public void decreaseToughness(int tgh) {
		toughness -= tgh;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int spd) {
		speed = spd;
	}
	public void increaseSpeed(int spd) {
		speed += spd;
	}
	public void decreaseSpeed(int spd) {
		speed -= spd;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dxt) {
		dexterity = dxt;
	}
	public void increaseDexterity(int dxt) {
		dexterity += dxt;
	}
	public void decreaseDexterity(int dxt) {
		agility -= dxt;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agi) {
		agility = agi;
	}
	public void increaseAgility(int agi) {
		agility += agi;
	}
	public void decreaseAgility(int agi) {
		agility -= agi;
	}
	public abstract void attack();
	public abstract void ability();
	//move to player
	public abstract boolean isTraversable(Space currentSpace);
	
	
	
}
