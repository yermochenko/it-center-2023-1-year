public class Main {
	static int rollDice() {
		return (int)(Math.random() * 6) + 1;
	}
	static int chance(int d1, int d2, int d3, int d4, int d5) {
		return d1 + d2 + d3 + d4 + d5;
	}
	public static void main(String[] args) throws InterruptedException {
		int x1 = rollDice();
		int x2 = rollDice();
		int x3 = rollDice();
		int x4 = rollDice();
		int x5 = rollDice();
		
		System.out.println(x1 + " " + x2 + " " + x3 + " " + x4 + " " + x5);
		System.out.println("количество очков для комбинации \"Шанс\": " + chance(x1, x2, x3, x4, x5));
	}
}
