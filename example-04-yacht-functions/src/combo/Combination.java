package combo;

import dice.Dice;

abstract public class Combination {
	private final String name;

	public Combination(String name) {
		this.name = name;
	}

	public final String getName() {
		return name;
	}

	abstract public int points(Dice[] dices);
}
