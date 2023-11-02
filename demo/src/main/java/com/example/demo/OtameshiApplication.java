package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OtameshiApplication {

	public static void main(String[] args) {
		YUSYA y = new YUSYA();
		y.hp=100;
		YUSYA y2= new YUSYA();
		y2.hp=y.hp;
		y2.hp=300;
		System.out.println(y.hp);
	}

}
