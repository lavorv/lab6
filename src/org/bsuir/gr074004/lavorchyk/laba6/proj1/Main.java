package org.bsuir.gr074004.lavorchyk.laba6.proj1;

import org.bsuir.gr074004.lavorchyk.laba6.proj1.util.MyPrinter;

class Main {
	public static void main(String[] args) {
		MyPrinter printer = new MyPrinter();
		String message = String.join(" ", args);
		printer.print(message);
	}
}

