import java.util.Arrays;

public class Main {
	static int rollDice() {
		return (int)(Math.random() * 6) + 1;
	}

	static int topSection(int[] d, int value) {
		int sum = 0;
		int i = 0;
		while(i < d.length) {
			if(d[i] == value) sum += value;
			i++;
		}
		return sum;
	}

	static int fullHouse(int[] d) {
		Arrays.sort(d);
		if(d[0] == d[1] && d[3] == d[4] && (d[1] == d[2] || d[2] == d[3])) {
			return 40;
		}
		return 0;
	}

	static int chance(int[] d) {
		int sum = 0;
		int i = 0;
		while(i < d.length) {
			sum += d[i];
			i++;
		}
		return sum;
	}

	public static void main(String[] args) throws InterruptedException {
		String[] names = {"Единицы", "Двойки", "Тройки", "Четвёрки", "Пятёрки", "Шестёрки"};
		//int[] x = {1, 4, 1, 4, 4};
		//*
		int[] x = new int[5];
		int i = 0;
		while(i < x.length) {
			x[i] = rollDice();
			i++;
		}
		//*/

		System.out.println(Arrays.toString(x));
		int n = 1;
		while(n <= names.length) {
			System.out.println("Очки для комбинации \"" + names[n - 1] + "\": " + topSection(x, n));
			n++;
		}
		System.out.println("Очки для комбинации \"Фул Хаус\": " + fullHouse(x));
		System.out.println("Очки для комбинации \"Шанс\": " + chance(x));
	}
}
