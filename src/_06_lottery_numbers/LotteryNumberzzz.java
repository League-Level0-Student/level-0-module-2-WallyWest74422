package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumberzzz {
public static void main(String[] args) {
	int lotteree = 0;
	Random number = new Random();
	for (int i=0;  i<6; i++) {
	lotteree = number.nextInt(81);
	System.out.println(lotteree);}
	JOptionPane.showMessageDialog(null, "Your Lottery Numbers are" +lotteree);
}
}
