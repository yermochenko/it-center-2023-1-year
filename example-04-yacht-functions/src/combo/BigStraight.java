package combo;

import dice.Dice;

public class BigStraight extends Combination {
	public BigStraight() {
		super("Старший стрит");
	}

	@Override
	public int points(Dice[] dices) {
		int[] values = new int[6];
		for(int i = 0; i < dices.length; i++) {
			values[dices[i].getValue() - 1]++;
		}
		for(int i = 0; i < values.length; i++) {
			if(values[i] > 1) {
				return 0;
			}
		}
		if(values[0] == 0 || values[5] == 0) {
			return 30;
		}
		return 0;
	}
}
