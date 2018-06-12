import java.awt.*;

public class Space extends Rectangle{
	
	private int xPos, yPos;
	private double width, height, xCenter, yCenter;
	private int difficulty;
	public boolean undiscovered = true;
	public Color color = Color.GREEN;
	public Type type;
	public enum Type{
		FOREST, VILLAGE;
	}
	public Space(int x, int y, int w, int h, Type t) {
		super(x, y, w, h);
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		switch(t) {
		case FOREST:
			setColor(Color.GREEN);
			type = t;
			break;
		case VILLAGE:
			setColor(Color.LIGHT_GRAY);
			type = t;
			break;
		}
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
		return ((double)xPos) + width / 2.0;
	}
	public double getYCenter() {
		return ((double)yPos) + height / 2.0;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color c) {
		color = c;
	}
	public Type getType() {
		return type;
	}
	
	public String toString() {
		return x + "	" + y + "	" + width + "	" + height;
	}
	
	
}
