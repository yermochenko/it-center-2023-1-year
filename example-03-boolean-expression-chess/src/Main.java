import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		System.out.print("Введите координаты первой клетки: ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("Введите координаты второй клетки: ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int dx = Math.abs(x1 - x2);
		int dy = Math.abs(y1 - y2);
		if(dx != 0 || dy != 0) {
			// Ход ладьи
			System.out.println("Может ли ладья сделать ход из клетки (" + x1 + ", " + y1 + ") в клетку (" + x2 + ", " + y2 +")?");
			boolean canRookMove  = (dx == 0) || (dy == 0);
			if(canRookMove) {
				System.out.println("Может.");
			} else {
				System.out.println("Не может.");
			}
			// Ход слона
			System.out.println("Может ли слон сделать ход из клетки (" + x1 + ", " + y1 + ") в клетку (" + x2 + ", " + y2 +")?");
			boolean canBishopMove = (dx == dy);
			if(canBishopMove) {
				System.out.println("Может.");
			} else {
				System.out.println("Не может.");
			}
			// Ход ферзя
			System.out.println("Может ли ферзь сделать ход из клетки (" + x1 + ", " + y1 + ") в клетку (" + x2 + ", " + y2 +")?");
			boolean canQueenMove = canRookMove || canBishopMove;
			if(canQueenMove) {
				System.out.println("Может.");
			} else {
				System.out.println("Не может.");
			}
			// Ход конь
			System.out.println("Может ли конь сделать ход из клетки (" + x1 + ", " + y1 + ") в клетку (" + x2 + ", " + y2 +")?");
			boolean canKnightMove = ((dx == 1) && (dy == 2)) || ((dx == 2) && (dy == 1));
			if(canKnightMove) {
				System.out.println("Может.");
			} else {
				System.out.println("Не может.");
			}
		} else {
			System.out.println("Ошибка! Введены координаты одной и той же клетки.");
		}
		scanner.close();
	}
}
