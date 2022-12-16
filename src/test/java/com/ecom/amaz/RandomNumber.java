package com.ecom.amaz;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random ran=new Random();
		int random = ran.nextInt(5000);
		System.out.println(random);
		
	}

}
