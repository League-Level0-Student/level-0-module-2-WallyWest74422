import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("Please enter (in inches),your height!");
	int num = Integer.parseInt(height);
	if(num >48) {
		JOptionPane.showMessageDialog(null, "You are allowed to ride the coaster. Have Fun!!!!");
	}else { JOptionPane.showMessageDialog(null, "Sorry. Please grow and then come back! Have Fun!!!");
}
}}
