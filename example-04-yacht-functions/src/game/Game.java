package game;

import java.util.Arrays;
import java.util.Scanner;

import combo.BigStraight;
import combo.Chance;
import combo.Combination;
import combo.FullHouse;
import combo.NKind;
import combo.SmallStraight;
import combo.TopSection;
import combo.Yacht;
import dice.Dice;

public class Game {
	private Scanner con = new Scanner(System.in);
	private int points;
	private Dice[] dices = new Dice[5];
	private Combination[] combinations = {
		new TopSection("Единицы", 1),
		new TopSection("Двойки", 2),
		new TopSection("Тройки", 3),
		new TopSection("Четвёрки", 4),
		new TopSection("Пятёрки", 5),
		new TopSection("Шестёрки", 6),
		new NKind("Сэт", 3),
		new NKind("Карэ", 4),
		new SmallStraight(),
		new BigStraight(),
		new Chance(),
		new FullHouse(),
		new Yacht()
	};

	public Game() {
		for (int i = 0; i < dices.length; i++) {
			dices[i] = new Dice();
		}
	}

	public int play() {
		while (combinations.length > 0) {
			System.out.println("***** Начало раунда *****");
			System.out.println("Всего очков: " + points);
			roll();
			System.out.println(Arrays.toString(dices) + "\n");
			showCombinations();
			int[] indexes = askRerollDices();
			if (indexes.length > 0) {
				roll(indexes);
				System.out.println(Arrays.toString(dices) + "\n");
				showCombinations();
				indexes = askRerollDices();
				if (indexes.length > 0) {
					roll(indexes);
					System.out.println(Arrays.toString(dices) + "\n");
					showCombinations();
				}
			}
			int usedCombinationIndex = askUsedCombination();
			points += combinations[usedCombinationIndex].points(dices);
			deleteCombination(usedCombinationIndex);
		}
		return points;
	}

	private void deleteCombination(int index) {
		if (index < combinations.length) {
			Combination[] newCombinations = new Combination[combinations.length - 1];
			if (index > 0) {
				System.arraycopy(combinations, 0, newCombinations, 0, index);
			}
			if (index < combinations.length - 1) {
				System.arraycopy(combinations, index + 1, newCombinations, index, combinations.length - index - 1);
			}
			combinations = newCombinations;
		} else {
			throw new ArrayIndexOutOfBoundsException(index);
		}
	}

	private int askUsedCombination() {
		System.out.print("Введите номер используемой комбинации: ");
		return Integer.parseInt(con.nextLine()) - 1;
	}

	private int[] askRerollDices() {
//		System.out.print("Введите количество перебрасываемых кубиков: ");
//		int n = con.nextInt();
//		int[] indexes = new int[n];
//		if (n > 0) {
//			System.out.print("Введите номера кубиков (через пробел): ");
//			for (int i = 0; i < n; i++) {
//				indexes[i] = con.nextInt() - 1;
//			}
//		}

		System.out.print("Введите номера кубиков (через пробел): ");
		String str = con.nextLine().trim();
		if(!str.isEmpty()) {
			String[] strs = str.split("\\s+");
			int[] indexes = new int[strs.length];
			for(int i = 0; i < strs.length; i++) {
				indexes[i] = Integer.parseInt(strs[i]) - 1;
			}
			return indexes;
		} else {
			return new int[0];
		}
	}

	private void showCombinations() {
		System.out.println("Доступные комбинации:");
		for (int i = 0; i < combinations.length; i++) {
			System.out.println("   " + (i + 1) + ") " + combinations[i].getName() + ", " + combinations[i].points(dices));
		}
		System.out.println();
	}

	private void roll(int... indexes) {
		if (indexes.length == 0) {
			indexes = new int[dices.length];
			for (int i = 0; i < indexes.length; i++) {
				indexes[i] = i;
			}
		}
		for (int i = 0; i < indexes.length; i++) {
			dices[indexes[i]].roll();
		}
	}
}
