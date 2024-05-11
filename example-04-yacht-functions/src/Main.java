import java.util.Arrays;

import combo.Chance;
import combo.Combination;
import combo.FullHouse;
import combo.TopSection;
import combo.Yacht;
import dice.Dice;

public class Main {
	public static void main(String[] args) {
		/*
		Dice[] dices = {new Dice(5), new Dice(1), new Dice(5), new Dice(5), new Dice(1)};
		//*/
		//*
		Dice[] dices = new Dice[5];
		for(int i = 0; i < dices.length; i++) {
			dices[i] = new Dice();
		}
		//*/

		System.out.println(Arrays.toString(dices));
		Combination[] combinations = {
			new TopSection("Единицы", 1),
			new TopSection("Двойки", 2),
			new TopSection("Тройки", 3),
			new TopSection("Четвёрки", 4),
			new TopSection("Пятёрки", 5),
			new TopSection("Шестёрки", 6),
			new Chance(),
			new FullHouse(),
			new Yacht()
		};
		for(int i = 0; i < combinations.length; i++) {
			System.out.println("Очки для комбинации \"" + combinations[i].getName() + "\": " + combinations[i].points(dices));
		}
	}
}
