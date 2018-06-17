package com.pataricza.chitchat.model;

import java.util.ArrayList;

public class ChatUser {
	
	private ArrayList<ChatMessage> messages;

	public ChatUser() {
		messages = new ArrayList<>();
	}

	public ArrayList<ChatMessage> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<ChatMessage> messages) {
		this.messages = messages;
	}
	
	public void addMessage(ChatMessage message) {
		messages.add(message);
		
	}
}
