package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From runner....");

	}

}
