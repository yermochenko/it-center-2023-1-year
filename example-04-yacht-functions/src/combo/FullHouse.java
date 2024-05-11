package combo;

import java.util.Arrays;

import dice.Dice;
import dice.DiceComparator;

public class FullHouse extends Combination {
	public FullHouse() {
		super("Фул Хаус");
	}

	@Override
	public int points(Dice[] srcDices) {
		Dice[] dices = new Dice[srcDices.length];
		System.arraycopy(srcDices, 0, dices, 0, srcDices.length);
		Arrays.sort(dices, new DiceComparator());
		if(dices[0].equals(dices[1]) && dices[3].equals(dices[4]) && (dices[1].equals(dices[2]) || dices[2].equals(dices[3]))) {
			return 40;
		}
		return 0;
	}
}
