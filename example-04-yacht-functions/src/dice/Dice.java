package dice;
import java.util.Objects;

public class Dice {
	private int value;
	
	public Dice() {
		roll();
	}
	
	public Dice(int value) {
		if(1 <= value && value <= 6) {
			this.value = value;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int getValue() {
		return value;
	}
	
	public void roll() {
		value = (int)(Math.random() * 6) + 1;
	}

	@Override
	public String toString() {
		return Character.toString('⚀' + (value - 1)); // return Integer.toString(value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Dice other = (Dice) obj;
		return value == other.value;
	}	
}
