package combo;

import dice.Dice;

public class SmallStraight extends Combination {
	public SmallStraight() {
		super("Младший стрит");
	}

	@Override
	public int points(Dice[] dices) {
		int[] values = new int[6];
		for(int i = 0; i < dices.length; i++) {
			values[dices[i].getValue() - 1]++;
		}
		int[] counts = new int[6];
		for(int i = 0; i < values.length; i++) {
			counts[values[i]]++;
		}
		if(counts[2] > 1) {
			return 0;
		}
		if(counts[2] == 1) {
			if(
				counts[1] == 3
				&&
				(
					(values[0] == 0 && values[1] == 0)
					||
					(values[0] == 0 && values[5] == 0)
					||
					(values[4] == 0 && values[5] == 0)
				)
			) {
				return 25;
			}
			return 0;
		}
		if(
			counts[1] == 5
			&&
			values[2] != 0
			&&
			values[3] != 0
		) {
			return 25;
		}
		return 0;
	}
}
