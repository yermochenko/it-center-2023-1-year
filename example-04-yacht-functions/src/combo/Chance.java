package combo;

import dice.Dice;

public class Chance extends Combination {
	public Chance() {
		super("Шанс");
	}

	@Override
	public int points(Dice[] dices) {
		int sum = 0;
		for(int i = 0; i < dices.length; i++) {
			sum += dices[i].getValue();
		}
		return sum;
	}
}
