import java.util.ArrayList;
import java.util.Scanner;
	
	
public class Player extends Character {
	
	ArrayList<Integer> rolls = new ArrayList<Integer>();
	Die d6 = new Die(6);
	Scanner input = new Scanner(System.in);
	public enum Race {
		DWARF, ELF, HALFLING, HUMAN, DRAGONBORN, GNOME, HALFELF, HALFORC, TIEFLING
	}
	
	public enum Class{
		BARBARIAN, BARD, CLERIC, DRUID, FIGHTER, MONK, PALIDAN, RANGER, ROGUE, SORCERER, WARLOCK, WIZARD
	}
	
	public Player(Race r, Class c) {
		super();
		startingStats();
		assignStats();
		switch(r) {
		case DWARF:
			increaseConstitution(2);
			setSpeed(25);
		case ELF:
			increaseDexterity(2);
			setSpeed(30);
		case HALFLING:
			increaseDexterity(2);
			setSpeed(25);
		case HUMAN:
			increaseCharisma(1);
			increaseConstitution(1);
			increaseDexterity(1);
			increaseIntelligence(1);
			increaseStrength(1);
			increaseWisdom(1);
			setSpeed(30);
		case DRAGONBORN:
			increaseStrength(2);
			increaseCharisma(1);
			setSpeed(30);
		case GNOME:
			increaseIntelligence(2);
			setSpeed(25);
		case HALFELF:
			increaseCharisma(2);
			increaseDexterity(1);
			increaseConstitution(1);
			setSpeed(30);
		case HALFORC:
			increaseStrength(2);
			increaseConstitution(1);
			setSpeed(30);
		case TIEFLING:
			increaseCharisma(2);
			increaseIntelligence(1);
			setSpeed(30);
		}
		switch(c) {
		case BARBARIAN:
			
		case BARD:
		case CLERIC:
		case DRUID:
		case FIGHTER:
		case MONK:
		case PALIDAN:
		case RANGER:
		case ROGUE:
		case SORCERER:
		case WARLOCK:
		case WIZARD:
		}
	}
	
	

	@Override
	public void ability() {
		// TODO Auto-generated method stub
		
	}
	
	public void startingStats() {
		for(int x = 0; x < 6; x++) {
			rolls.add(startingRolls());
		}
	}
	
	public int startingRolls() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int total = 0;
		int min = 7;
		for(int x = 0; x < 4; x++) {
		nums.add(d6.roll());
		}
		for(Integer num : nums) {
			if(num < min) {
				min = num;
			}
		}
		for(Integer num : nums) {
			total += num;
		}
		total -= min;
		return total;

		
	}
	
	
	public void assignStats() {
		int pick = 0;
		System.out.print("Strength: " + getStrength() + "\nDexterity: " + getDexterity() +
				"\nConstitution: " + getConstitution() + "\nIntelligence: " + getIntelligence() + "\nWisdom: " 
				+ getWisdom() + "\nCharisma: " + getCharisma() + "\n");
		do{
			System.out.print("Here are your rolls: " + rolls + " Which value would you like to use for strength?\n");
		
		pick = input.nextInt();
		for(int x = 0; x < rolls.size(); x++) {

			if(pick == rolls.get(x)) {
				increaseStrength(pick);;
				rolls.remove(x);
				pick = 0;
			}			
		}
		if(getStrength() < 6) {
			System.out.println("Invalid. Reenter your value");
		}
	}while(getStrength() < 6);
		
		System.out.print("Strength: " + getStrength() + "\nDexterity: " + getDexterity() +
				"\nConstitution: " + getConstitution() + "\nIntelligence: " + getIntelligence() + "\nWisdom: " 
				+ getWisdom() + "\nCharisma: " + getCharisma() + "\n");
		do{
			System.out.print("Here are your rolls: " + rolls + " Which value would you like to use for dexterity?\n");
		
		pick = input.nextInt();
		for(int x = 0; x < rolls.size(); x++) {

			if(pick == rolls.get(x)) {
				increaseDexterity(pick);;
				rolls.remove(x);
				pick = 0;
			}			
		}
		if(getDexterity() < 6) {
			System.out.println("Invalid. Reenter your value");
		}
	}while(getDexterity() < 6);
		
		System.out.print("Strength: " + getStrength() + "\nDexterity: " + getDexterity() +
				"\nConstitution: " + getConstitution() + "\nIntelligence: " + getIntelligence() + "\nWisdom: " 
				+ getWisdom() + "\nCharisma: " + getCharisma() + "\n");
		do{
			System.out.print("Here are your rolls: " + rolls + " Which value would you like to use for constitution?\n");
		
		pick = input.nextInt();
		for(int x = 0; x < rolls.size(); x++) {

			if(pick == rolls.get(x)) {
				increaseConstitution(pick);;
				rolls.remove(x);
				pick = 0;
			}			
		}
		if(getConstitution() < 6) {
			System.out.println("Invalid. Reenter your value");
		}
	}while(getConstitution() < 6);
	
		System.out.print("Strength: " + getStrength() + "\nDexterity: " + getDexterity() +
				"\nConstitution: " + getConstitution() + "\nIntelligence: " + getIntelligence() + "\nWisdom: " 
				+ getWisdom() + "\nCharisma: " + getCharisma() + "\n");
		do{
			System.out.print("Here are your rolls: " + rolls + " Which value would you like to use for intelligence?\n");
		
		pick = input.nextInt();
		for(int x = 0; x < rolls.size(); x++) {

			if(pick == rolls.get(x)) {
				increaseIntelligence(pick);;
				rolls.remove(x);
				pick = 0;
			}			
		}
		if(getIntelligence() < 6) {
			System.out.println("Invalid. Reenter your value");
		}
	}while(getIntelligence() < 6);
		
		System.out.print("Strength: " + getStrength() + "\nDexterity: " + getDexterity() +
				"\nConstitution: " + getConstitution() + "\nIntelligence: " + getIntelligence() + "\nWisdom: " 
				+ getWisdom() + "\nCharisma: " + getCharisma() + "\n");
		do{
			System.out.print("Here are your rolls: " + rolls + " Which value would you like to use for wisdom?\n");
		
		pick = input.nextInt();
		for(int x = 0; x < rolls.size(); x++) {

			if(pick == rolls.get(x)) {
				increaseWisdom(pick);;
				rolls.remove(x);
				pick = 0;
			}			
		}
		if(getWisdom() < 6) {
			System.out.println("Invalid. Reenter your value");
		}
	}while(getWisdom() < 6);
	
	
	System.out.print("Strength: " + getStrength() + "\nDexterity: " + getDexterity() +
			"\nConstitution: " + getConstitution() + "\nIntelligence: " + getIntelligence() + "\nWisdom: " 
			+ getWisdom() + "\nCharisma: " + getCharisma() + "\n");
	do{
		System.out.print("Here are your rolls: " + rolls + " Which value would you like to use for charisma?\n");
	
	pick = input.nextInt();
	for(int x = 0; x < rolls.size(); x++) {

		if(pick == rolls.get(x)) {
			increaseCharisma(pick);;
			rolls.remove(x);
			pick = 0;
		}			
	}
	if(getCharisma() < 6) {
		System.out.println("Invalid. Reenter your value");
	}
}while(getCharisma() < 6);

	System.out.print("Strength: " + getStrength() + "\nDexterity: " + getDexterity() +
			"\nConstitution: " + getConstitution() + "\nIntelligence: " + getIntelligence() + "\nWisdom: " 
			+ getWisdom() + "\nCharisma: " + getCharisma());
	}

	



}
