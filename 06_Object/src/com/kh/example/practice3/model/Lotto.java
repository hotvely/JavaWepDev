package com.kh.example.practice3.model;

import java.util.Arrays;

public class Lotto {

	int[] lotto;
	int randNum = 0;

	public Lotto() {
		lotto = new int[6];

		for (int i = 0; i < lotto.length;) {
			randNum = (int) (Math.random() * 45 + 1);

			if (!isSame(i)) {
				lotto[i] = randNum;
				i++;
			}
		}
	}

	boolean isSame(int currIdx) {
		for (int j = 0; j < currIdx; j++) {
			if (lotto[j] == randNum) {
				return true;
			}
		}
		return false;
	}

	public String information() {
		return Arrays.toString(lotto);
	}

}
