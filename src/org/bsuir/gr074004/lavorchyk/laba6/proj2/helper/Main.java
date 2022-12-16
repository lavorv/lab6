package org.bsuir.gr074004.lavorchyk.laba6.proj2;

import java.util.Scanner;
import org.bsuir.gr074004.lavorchyk.laba6.proj2.helper.PrintHelper;

class Main {
	public static void main(String[] args) {
		System.out.print("Enter message: ");
		
		Scanner scanner = new Scanner(System.in);
		String message = scanner.nextLine();
		
		PrintHelper helper = new PrintHelper();
		helper.print(message);
	}
}
