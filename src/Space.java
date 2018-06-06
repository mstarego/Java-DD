import java.awt.*;

public class Space extends Rectangle{
	
	private int xPos, yPos;
	private double width, height, xCenter, yCenter;
	private int difficulty;
	public Space(int x, int y, int w, int h) {
		super(x, y, w, h);
		xPos = x;
		yPos = y;
		width = w;
		height = h;
	}
	public int getXPos() {
		return xPos;
	}
	public void setXPos(int x) {
		xPos = x;
	}
	public int getYPos() {
		return yPos;
	}
	public void setYPos(int y) {
		yPos = y;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(int w) {
		width = w;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int getDifficulty(){
		return difficulty;
	}
	public void setDifficulty(int d) {
		difficulty = d;
	}
	public double getXCenter() {
		return xCenter;
	}
	public double getYCenter() {
		return yCenter;
	}
	public String toString() {
		return x + "	" + y + "	" + width + "	" + height;
	}
	
	
}
