package combo;

import dice.Dice;

public class Yacht extends Combination {
	public Yacht() {
		super("Яхта");
	}

	@Override
	public int points(Dice[] dices) {
		if(dices[0].equals(dices[1]) && dices[1].equals(dices[2]) && dices[2].equals(dices[3]) && dices[3].equals(dices[4])) {
			return 50;
		}
		return 0;
	}
}
