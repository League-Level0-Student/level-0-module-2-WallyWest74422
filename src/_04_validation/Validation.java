//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		for (int i=0;  i<11; i++) {
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		 if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "You look nice today");
			} else if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "You are good at coding");
			} else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "Have An AWESOME DAY! :)");
			} else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "U R COOL BEANS!!!");
			} else {
				JOptionPane.showMessageDialog(null, "I AM A BOT AND THIS IS AN AUTOMATED MESSAGE");
			}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}}
