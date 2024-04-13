class Fraction {
	private int p;
	private int q;
	public Fraction() {
		this(0);
	}
	public Fraction(int p) {
		this(p, 1);
	}
	public Fraction(int p, int q) {
		if(q == 0) throw new ArithmeticException("знаменатель дроби равен 0");
		int k = gcd(p, q);
		p /= k;
		q /= k;
		if(q > 0) {
			this.p = p;
			this.q = q;
		} else {
			this.p = -p;
			this.q = -q;
		}		
	}
	public int getP() {
		return p;
	}
	public int getQ() {
		return q;
	}
	public void output() {
		if(p < 0) System.out.print("-");
		if(q == 1) {
			System.out.println(Math.abs(p));
		} else {
			System.out.println(Math.abs(p) + "/" + q);
		}
	}
	public static Fraction add(Fraction x, Fraction y) {
		return new Fraction(x.p * y.q + y.p * x.q, x.q * y.q);
	}
	// TODO: добавить метод для вычитания дробей
	// TODO: добавить метод для умножения дробей
	// TODO: добавить метод для деления дробей
	private static int gcd(int m, int n) {
		m = Math.abs(m);
		n = Math.abs(n);
		if(m < n) {
			int tmp = m;
			m = n;
			n = tmp;
		}
		return gcdRecurcive(m, n);
	}
	/**
	 * функция находит НОД (наибольший общий делитель) двух целых положительных чисел
	 * @param m - большее число (должно быть положительным)
	 * @param n - меньшее число (должно быть положительным)
	 * @return вычисленный НОД
	 */
	private static int gcdRecurcive(int m, int n) {
		if(n == 0) return m;
		int k = m % n;
		return gcdRecurcive(n, k);
	}
}

public class Main {
	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		System.out.print("f1: ");
		f1.output();
		Fraction f2 = new Fraction(-4);
		System.out.print("f2: ");
		f2.output();
		Fraction f3 = new Fraction(3, -7);
		System.out.print("f3: ");
		f3.output();
		System.out.print("f4: ");
		Fraction f4 = Fraction.add(f2, f3);
		f4.output();
		System.out.print("f5: ");
		Fraction f5 = new Fraction(24, 36);
		f5.output();
		Fraction f6 = new Fraction(2, 3);
		Fraction f7 = new Fraction(1, 3);
		System.out.print("f8: ");
		Fraction f8 = Fraction.add(f6, f7);
		f8.output();
	}
}
