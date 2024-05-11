package dice;
import java.util.Comparator;

public class DiceComparator implements Comparator<Dice> {
	@Override
	public int compare(Dice dice1, Dice dice2) {
		return Integer.compare(dice1.getValue(), dice2.getValue());
	}
}
