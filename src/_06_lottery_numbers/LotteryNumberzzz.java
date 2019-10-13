package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumberzzz {
public static void main(String[] args) {
	int lotteree = 0;
	Random factory = new Random();
	lotteree = factory.nextInt(81);
	System.out.println(lotteree);
	int lottere = 0;
	lottere = factory.nextInt(81);
	System.out.println(lottere);
	int lottereee = 0;
	lottereee = factory.nextInt(81);
	System.out.println(lottereee);
	int lottery = 0;
	lottery = factory.nextInt(81);
	System.out.println(lottery);
	int lotteryy = 0;
	lotteryy = factory.nextInt(81);
	System.out.println(lotteryy);
	String message = " ";
	String space = ", ";
	String end = ", and ";
	message += lotteree;
	message += space;
	message += lottere;
	message += space;
	message += lottereee ;
	message += space;
	message += lottery;
	message += end;
	message += lotteryy;
	JOptionPane.showMessageDialog(null, "Your numbers are" +message);
}}


