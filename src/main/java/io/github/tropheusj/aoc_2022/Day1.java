package io.github.tropheusj.aoc_2022;

import io.github.tropheusj.Data;

public class Day1 {
	public static void main(String[] args) {
		String data = Data.get(2022, 1);
		String[] elves = data.split("\n\n");
		int largest = 0;
		int largest2 = 0;
		int largest3 = 0;
		for (String elf : elves) {
			String[] cals = elf.split("\n");
			int total = 0;
			for (String cal : cals) {
				total += Integer.parseInt(cal);
			}
			if (total > largest) {
				largest3 = largest2;
				largest2 = largest;
				largest = total;
			} else if (total > largest2) {
				largest3 = largest2;
				largest2 = total;
			} else if (total > largest3) {
				largest3 = total;
			}
		}
		System.out.println("largest: " + largest);
		System.out.println("3 largest: " + (largest + largest2 + largest3));
	}
}
