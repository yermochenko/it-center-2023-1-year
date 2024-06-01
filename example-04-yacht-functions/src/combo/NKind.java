package combo;

import dice.Dice;

public class NKind extends Combination {
	private final int n;

	public NKind(String name, int n) {
		super(name);
		this.n = n;
	}

	@Override
	public int points(Dice[] dices) {
		int[] values = new int[6];
		for(int i = 0; i < dices.length; i++) {
			values[dices[i].getValue() - 1]++;
		}
		for(int i = 0; i < values.length; i++) {
			if(values[i] >= n) {
				return (i + 1) * n;
			}
		}
		return 0;
	}
}
