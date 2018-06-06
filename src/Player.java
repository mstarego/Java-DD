
public class Player extends Character {

	
	public Player(double startingXPos, double startingYPos, double hp, double str, double spd, double tgh, double agi, double dxt, Item w, Item a, Item h, Item s, Item t) {
		super(startingXPos, startingYPos, hp, str, spd, tgh, agi, dxt, w, a, h, s, t);
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
