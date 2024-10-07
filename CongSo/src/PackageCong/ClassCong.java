package PackageCong;

import java.util.Scanner;

public class ClassCong {
	public static String addLargeNumbers(String num1, String num2) {
		StringBuilder sb1 = new StringBuilder(num1);
		StringBuilder sb2 = new StringBuilder(num2);
		num1 = sb1.reverse().toString();
		num2 = sb2.reverse().toString();

		StringBuilder result = new StringBuilder();
		int maxLength = Math.max(num1.length(), num2.length());
		int carry = 0;

		for (int i = 0; i < maxLength; i++) {
			int digit1 = i < num1.length() ? num1.charAt(i) - '0' : 0;
			int digit2 = i < num2.length() ? num2.charAt(i) - '0' : 0;

			int total = digit1 + digit2 + carry;
			carry = total / 10;
			result.append(total % 10);
		}

		if (carry > 0) {
			result.append(carry);
		}

		return result.reverse().toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số thứ nhất: ");
		String number1 = scanner.nextLine();

		System.out.print("Nhập số thứ hai: ");
		String number2 = scanner.nextLine();

		String sumResult = addLargeNumbers(number1, number2);
		System.out.println("Tổng của " + number1 + " và " + number2 + " là: " + sumResult);
	}
}
