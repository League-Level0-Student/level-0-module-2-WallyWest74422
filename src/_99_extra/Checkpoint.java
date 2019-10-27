package _99_extra;

import javax.swing.JOptionPane;

public class Checkpoint {

}
Random Checkpoint
On paper, write code that does the following: 
1. Get a random whole number that is less than 1,000.
int Randomnum = 0
Random number = new Random();
Randomnum = number.nextInt(1000);

2. Get another random whole number that is less than 900.
int num = 0
Random number = new Random();
num = number.nextInt(900);
The user is going to make some cookies.

On paper, write code that does the following:
	
1. Ask the user how many cups of flour they have. If they have less than 2 cups, tell
them to go to the store to buy more.
String flour = JOptionPane.showInputDialog("How many cups of flour do you have?")
int num = Integer.parseInt(flour);
if(num <2) {
	JOptionPane.showMessageDialog(null, "Go to Walmart and buy more flour!");
}
2. Now ask them how many people they are going to give cookies to. If they are going
to give cookies to more than 30 people, tell them they are going to have to bake two
batches of cookies! 

String cookies = JOptionPane.showInputDialog("How many cups of flour do you have?")
int number = Integer.parseInt(cookies);
if(number >30) {
	JOptionPane.showMessageDialog(null, "You need to bake 2 batches of cookies!");
}

3. Finally, ask them how many batches of cookies they baked. If they baked 2 batches
of cookies, tell them they are lucky to have so many friends. 

String batches = JOptionPane.showInputDialog("How many cups of flour do you have?")
int howmany = Integer.parseInt(batches);
if(howmany == 2) {
	JOptionPane.showMessageDialog(null, "You are lucky to have so many friends!");
}

1. Write code to call the printMessage method shown below
void printMessage() {
          System.out.println("message");
 }
printMessage();
2. Write code to call the setName method shown below
void setName(String name) {
          this.name = name;
 }
setName("int");
3. Write code to call the getNumber method shown below
int getNumber() {
          return number;
 }
int x = getNumber();