import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Создаём объект-сканер для чтения данных с клавиатуры
		Scanner scanner = new Scanner(System.in);
		// Настраиваем объект-сканер на использование точки
		// в качестве разделителя целой и дробной части
		scanner.useLocale(Locale.ENGLISH);
		
		// Выводим сообщение - приглашение к вводу
		System.out.print("Введите первое действительное число: ");
		// Объявляем переменную и сохраняем в неё введённое с клавиатуры значение
		double x = scanner.nextDouble();
		System.out.print("Введите второе действительное число: ");
		double y = scanner.nextDouble();
		// Вычисляем значение выражения
		double z = x * x + y * y;
		// Выводим результат вычисления выражения
		System.out.println(x + "² + " + y + "² = " + z);

		System.out.print("Введите первое целое число: ");
		int a = scanner.nextInt();
		System.out.print("Введите второе целое число: ");
		int b = scanner.nextInt();
		int c = a / b;
		int d = a % b;
		System.out.println("Частное при делении " + a + " на " + b + " равно " + c);
		System.out.println("Остаток при делении " + a + " на " + b + " равен " + d);
		
		// Закрываем объект-сканер
		scanner.close();
	}
}
