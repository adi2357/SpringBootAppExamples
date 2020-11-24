package com.myfirstapp.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myfirstapp.model.Greeting;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping(value = { "", "/", "/home" })
	public Greeting getGreeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@PostMapping("/post")
	public String getGreeting(@RequestBody Greeting greeting) {
		return "{\"messageId\":" + greeting.getMessageId() + ",\"message\":" + "\"" + String.format(template, greeting.getMessage()) + "\"}";
	}
	
	@PutMapping("/put/{messageId}")
	public Greeting getGreeting(@PathVariable long messageId, @RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(messageId, String.format(template, name)); 
	}
}
