package combo;

import dice.Dice;

public class TopSection extends Combination {
	private final int value;

	public TopSection(String name, int value) {
		super(name);
		this.value = value;
	}

	@Override
	public int points(Dice[] dices) {
		int sum = 0;
		for(int i = 0; i < dices.length; i++) {
			if(dices[i].getValue() == value) sum += value;
		}
		return sum;
	}
}
