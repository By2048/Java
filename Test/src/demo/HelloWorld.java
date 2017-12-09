package demo;

public class HelloWorld {
	public static void main(String[] args) {
		byte b = (byte) 129;
		System.out.println(b);
		// 字符串常量
		System.out.println("Hello World");

		// 整数常量
		System.out.println(100);

		// 小数常量
		System.out.println(12.345);

		// 字符常量
		System.out.println('A');
		// 下面的是错误的
		// System.out.println('BC');

		System.out.println("BC");
		System.out.println('1');

		// 布尔常量
		System.out.println(true);
		System.out.println(false);

		System.out.println(0b100);// 4
		System.out.println(0100);// 64
		System.out.println(100);// 100
		System.out.println(0x100);// 256
	}
}
