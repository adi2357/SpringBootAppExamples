package com.myfirstapp.model;

public class Greeting {
	long messageId;
	String message;
	
	public Greeting(long messageId, String message) {
		this.messageId = messageId;
		this.message = message;
	}

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
