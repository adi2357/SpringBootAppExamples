package com.myfirstapp.service;

import com.myfirstapp.model.Greeting;
import com.myfirstapp.model.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(long id);
}
