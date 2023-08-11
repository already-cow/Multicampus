package org.galapagos.mcmorning.cli;

import java.util.Scanner;

public class input {
	static Scanner sc = new Scanner(System.in);

	// Facade Pattern
	public static String read(String title) {
		System.out.println(title);
		return sc.nextLine();
	}
}
