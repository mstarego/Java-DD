
public class Item {
	/*
	 * atkValue - added to character attack value
	 * defValue - added to character defense value
	 * healValue - when activated, added to character health value
	 * durability - number of uses until item breaks/ is lost
	 * heldBonus - true if it's a constant bonus, false if it's a one-time activated bonus
	 */
	private int atkValue, defValue, healValue, durability;
	private boolean heldBonus;
	
	
	public Item(int atk, int def, int heal, int dur, boolean bonus) {
		atkValue = atk;
		defValue = def;
		healValue = heal;
		durability = dur;
		heldBonus = bonus;
		
	}
	
	public int getAtkValue() {
		return atkValue;
	}
	public void setAtkValue(int atk) {
		atkValue = atk;
	}
	public void increaseAtkValue(int atk) {
		atkValue += atk;
	}
	public void decreaseAtkValue(int atk) {
		atkValue -= atk;
	}
	public int getDefValue() {
		return defValue;
	}
	public void setDefValue(int def) {
		defValue = def;
	}
	public void increaseDefValue(int def) {
		defValue += def;
	}
	public void decreaseDefValue(int def) {
		defValue -= def;
	}
	public int getHealValue() {
		return healValue;
	}
	public void setHealValue(int heal) {
		healValue = heal;
	}
	public void increaseHealValue(int heal) {
		healValue += heal;
	}
	public void decreaseHealValue(int heal) {
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
