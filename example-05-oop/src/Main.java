class Cpu {
	// TODO: сделать поля приватными
	String name;
	int price;
	int cores;
	double speed;
	// TODO: добавить метод out()
	// TODO: добавить get-теры и set-теры для полей
}

class Ram {
	// TODO: сделать поля приватными
	int price;
	int volume;
	// TODO: добавить метод out()
	// TODO: добавить get-теры и set-теры для полей
}

class SystemBlock {
	private int price;
	private int power;
	// TODO: добавить поля "процессор" и "память" и get-теры и set-теры для них
	public void out() {
		System.out.println("Системный блок:");
		System.out.println("    Цена    : " + Main.formatPrice(price));
		System.out.println("    Мощность: " + power + " Вт");		
		// TODO: добавить вывод информации о процессоре и памяти
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
}

class Monitor {
	private String name;
	private int price;
	private double diagonal;
	private int pixelsWidth;
	private int pixelsHeight;
	public void out(int number) {
		if(number == 0) {
			System.out.print("Монитор: ");
		} else {
			System.out.print("Монитор №" + number + ": ");
		}
		System.out.println(name + ":");
		System.out.println("    Цена      : " + Main.formatPrice(price));
		System.out.println("    Диагональ : " + diagonal + "\"");
		System.out.println("    Разрешение: " + pixelsWidth + " x " + pixelsHeight);						
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiagonal() {
		return diagonal;
	}
	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}
	public int getPixelsWidth() {
		return pixelsWidth;
	}
	public void setPixelsWidth(int pixelsWidth) {
		this.pixelsWidth = pixelsWidth;
	}
	public int getPixelsHeight() {
		return pixelsHeight;
	}
	public void setPixelsHeight(int pixelsHeight) {
		this.pixelsHeight = pixelsHeight;
	}
}

class Computer {
	private String name;
	private int price;
	private SystemBlock systemBlock;
	private Monitor[] monitors;
	public void out() {
		System.out.println("********** Компьютер **********");
		System.out.println("Модель: " + name);
		System.out.println("Цена  : " + Main.formatPrice(price));	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public SystemBlock getSystemBlock() {
		return systemBlock;
	}
	public void setSystemBlock(SystemBlock systemBlock) {
		this.systemBlock = systemBlock;
	}
	public Monitor[] getMonitors() {
		return monitors;
	}
	public void setMonitors(Monitor[] monitors) {
		this.monitors = monitors;
	}
}

public class Main {
	public static String formatPrice(int price) {
		return price / 100 + " руб. " + price % 100 + " коп.";
	}
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.setName("HP");
		c1.setPrice(2_349__95);
		c1.setSystemBlock(new SystemBlock());
		c1.getSystemBlock().setPrice(2_000__00);
		c1.getSystemBlock().setPower(600);
		// TODO: установить процессор и память
		c1.setMonitors(new Monitor[] { new Monitor() });
		c1.getMonitors()[0].setName("LG");
		c1.getMonitors()[0].setPrice(490__00);
		c1.getMonitors()[0].setDiagonal(24.3);
		c1.getMonitors()[0].setPixelsWidth(1920);
		c1.getMonitors()[0].setPixelsHeight(1080);
		c1.out();
		Computer c2 = new Computer();
		c2.setName("Dell");
		c2.setPrice(3_449__99);
		c2.setSystemBlock(new SystemBlock());
		c2.getSystemBlock().setPrice(2_400_00);
		c2.getSystemBlock().setPower(750);
		// TODO: установить процессор и память
		c2.setMonitors(new Monitor[] { new Monitor(), new Monitor() });
		c2.getMonitors()[0].setName("Samsung");
		c2.getMonitors()[0].setPrice(300__00);
		c2.getMonitors()[0].setDiagonal(21);
		c2.getMonitors()[0].setPixelsWidth(1240);
		c2.getMonitors()[0].setPixelsHeight(720);
		c2.getMonitors()[1].setName("Philips");
		c2.getMonitors()[1].setPrice(200__00);
		c2.getMonitors()[1].setDiagonal(19);
		c2.getMonitors()[1].setPixelsWidth(1240);
		c2.getMonitors()[1].setPixelsHeight(1024);
		c2.out();
		Computer c3 = new Computer();
		c3.setName("Apple MacMini");
		c3.setPrice(4_567__89);
		c3.setSystemBlock(new SystemBlock());
		c3.getSystemBlock().setPrice(4_500__00);
		c3.getSystemBlock().setPower(500);
		// TODO: установить процессор и память
		c3.setMonitors(new Monitor[0]);
		c3.out();
	}
}
