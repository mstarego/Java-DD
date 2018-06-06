
public class Player extends Character {
	private Weapon equippedWeapon;
	private Armor equippedArmor;
	
	public Player(Weapon w, Armor a, HealthItem h, Shield s, Tool t) {
		
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ability() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isTraversable(Space currentSpace)  {
		if(getAgility() >= currentSpace.getDifficulty()) {
			return true;
		}
		return false;
	}

}
