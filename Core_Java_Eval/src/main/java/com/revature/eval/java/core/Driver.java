package com.revature.eval.java.core;

public class Driver {

	public static void main(String[] args) {
		String string = "n";
		int key = 13;
		int tempKey = key;
		int num =0;
		String[] letter = string.split("");
		String str = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String[] alphabetArr = alphabet.split("");
		
		for(int i=0;i<string.length();i++) {
			num = alphabet.indexOf(letter[i]);
			if((num+1)+tempKey>26) {
				tempKey = ((num+1)+(tempKey))- alphabetArr.length;
				str = str + alphabetArr[tempKey-1];
				tempKey = key;
			} else {
				tempKey = ((num+1)+(tempKey));
				str = str + alphabetArr[tempKey-1];	
				tempKey = key;
			}
		}		
		System.out.println(str);
	}

}
