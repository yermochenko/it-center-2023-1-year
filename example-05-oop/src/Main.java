class Cpu {
	String name;
	int price;
	int cores;
	double speed;
	// TODO: добавить метод out()
}

class Ram {
	int price;
	int volume;
	// TODO: добавить метод out()
}

class SystemBlock {
	int price;
	int power;
	// TODO: добавить поля "процессор" и "память"
	public void out() {
		System.out.println("Мощность блока питания: " + power + " Вт");
		System.out.println("Стоимость системного блока: " + Main.formatPrice(price));
		// TODO: добавить вывод информации о процессоре и памяти
	}
}

class Monitor {
	String name;
	int price;
	double diagonal;
	int pixelsWidth;
	int pixelsHeight;
	public void out(int number) {
		if(number == 0) {
			System.out.print("Монитор: ");
		} else {
			System.out.print("Монитор № " + number + ": ");
		}
		System.out.println(name);
		if(number == 0) {
			System.out.print("Цена монитора: ");
		} else {
			System.out.print("Цена " + number + "-го монитора: ");
		}
		System.out.println(Main.formatPrice(price));
		if(number == 0) {
			System.out.print("Размер диагонали монитора: ");
		} else {
			System.out.print("Размер диагонали " + number + "-го монитора: ");
		}
		System.out.println(diagonal + "\"");
		if(number == 0) {
			System.out.print("Разрешение монитора: ");
		} else {
			System.out.print("Разрешение " + number + "-го монитора: ");
		}
		System.out.println(pixelsWidth + " x " + pixelsHeight);
	}
}

class Computer {
	String name;
	int price;
	SystemBlock systemBlock;
	Monitor[] monitors;
	public void out() {
		System.out.println("********** Компьютер **********");
		System.out.println("Модель: " + name);
		System.out.println("Общая стоимость: " + Main.formatPrice(price));	
		systemBlock.out();
		if(monitors.length == 1) {
			monitors[0].out(0);
		} else if(monitors.length > 1) {
			for(int i = 0; i < monitors.length; i++) {
				monitors[i].out(i + 1);
			}
		} else {
			System.out.println("Продаётся без монитора");
		}
		System.out.println("*******************************");
	}
}

public class Main {
	public static String formatPrice(int price) {
		return price / 100 + " руб. " + price % 100 + " коп.";
	}
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.name = "HP";
		c1.price = 2_349__49;
		c1.systemBlock = new SystemBlock();
		c1.systemBlock.price = 2_000__00;
		c1.systemBlock.power = 500;
		// TODO: установить процессор и память
		c1.monitors = new Monitor[] { new Monitor() };
		c1.monitors[0].name = "LG";
		c1.monitors[0].price = 300__00;
		c1.monitors[0].diagonal = 19.3;
		c1.monitors[0].pixelsWidth = 1280;
		c1.monitors[0].pixelsHeight = 1024;
		c1.out();
		Computer c2 = new Computer();
		c2.name = "Dell";
		c2.price = 3_449__99;
		c2.systemBlock = new SystemBlock();
		c2.systemBlock.price = 2_400_00;
		c2.systemBlock.power = 750;
		// TODO: установить процессор и память
		c2.monitors = new Monitor[] { new Monitor(), new Monitor() };
		c2.monitors[0].name = "Philips";
		c2.monitors[0].price = 500__00;
		c2.monitors[0].diagonal = 24;
		c2.monitors[0].pixelsWidth = 1920;
		c2.monitors[0].pixelsHeight = 1080;
		c2.monitors[1].name = "Philips";
		c2.monitors[1].price = 500__00;
		c2.monitors[1].diagonal = 24;
		c2.monitors[1].pixelsWidth = 1920;
		c2.monitors[1].pixelsHeight = 1080;
		c2.out();
		Computer c3 = new Computer();
		c3.name = "Apple MacMini";
		c3.price = 4_321__89;
		c3.systemBlock = new SystemBlock();
		c3.systemBlock.price = 4_200_00;
		c3.systemBlock.power = 400;
		// TODO: установить процессор и память
		c3.monitors = new Monitor[0];
		c3.out();
	}
}
