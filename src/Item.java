
public class Item {
	/*
	 * atkValue - added to character attack value
	 * defValue - added to character defense value
	 * healValue - when activated, added to character health value
	 * durability - number of uses until item breaks/ is lost
	 * heldBonus - true if it's a constant bonus, false if it's a one-time activated bonus
	 */
	private double atkValue, defValue, healValue;
	public int durability;
	private boolean heldBonus;
	
	
	public Item(double atk, double def, double heal, int dur, boolean bonus) {
		atkValue = atk;
		defValue = def;
		healValue = heal;
		durability = dur;
		heldBonus = bonus;
		
	}
	
	public double getAtkValue() {
		return atkValue;
	}
	public void setAtkValue(double atk) {
		atkValue = atk;
	}
	public void increaseAtkValue(double atk) {
		atkValue += atk;
	}
	public void decreaseAtkValue(double atk) {
		atkValue -= atk;
	}
	public double getDefValue() {
		return defValue;
	}
	public void setDefValue(double def) {
		defValue = def;
	}
	public void increaseDefValue(double def) {
		defValue += def;
	}
	public void decreaseDefValue(double def) {
		defValue -= def;
	}
	public double getHealValue() {
		return healValue;
	}
	public void setHealValue(double heal) {
		healValue = heal;
	}
	public void increaseHealValue(double heal) {
		healValue += heal;
	}
	public void decreaseHealValue(double heal) {
		healValue -= heal;
	}
	public int getDurabilityValue() {
		return durability;
	}
	public void setDurabilityValue(int dur) {
		durability = dur;
	}
	public void increaseDurabilityValue(int dur) {
		durability += dur;
	}
	public void decreaseDurabilityValue(int dur) {
		durability -= dur;
	}
	public boolean isHeldBonus() {
		return heldBonus;
	}

	
}
