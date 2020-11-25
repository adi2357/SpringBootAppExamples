package com.myfirstapp.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.myfirstapp.model.Greeting;
import com.myfirstapp.model.User;

@Service
public class GreetingService implements IGreetingService{
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Override
	public Greeting addGreetingService(User user) {
		String message = String.format(template, (user.toString().isEmpty() ? "World" : user.toString()));
		return new Greeting(counter.incrementAndGet(), message);
	}

	@Override
	public Greeting getGreetingById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
