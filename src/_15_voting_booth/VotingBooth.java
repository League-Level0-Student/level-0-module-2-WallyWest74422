package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("Please enter your age!");
	int num = Integer.parseInt(age);
	if(num >18) {
	JOptionPane.showInputDialog("Who do you think the next president should be?");
	}else { JOptionPane.showMessageDialog(null, "Sorry, nobody cares what you think");
}
}
}
