//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _07_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		/ * 1. Ask the user which animal they want, then play the sound of that animal.
		 
		
		
		/* 2. Make it so that the user can keep entering new animals. */
		for(int i=0;true; i++) {
	String response =	JOptionPane.showInputDialog("Which animal do you want?");
	
			if(response.equals("dog")) {
					playWoof();
			}else if(response.equals("duck")) {
				playQuack();
			}else if(response.equals("cat")) {
				playMeow();
			}else if(response.equals("llama")) {
				playLlama();
			}else if(response.equals("cow")){
			playMoo();
	}else JOptionPane.showMessageDialog(null,"Try Again");}}

	void playMoo() {
		playNoise(mooFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
