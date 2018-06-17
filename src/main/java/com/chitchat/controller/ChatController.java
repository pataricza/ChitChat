package com.chitchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.chitchat.model.ChatMessage;
import com.chitchat.model.ChatUser;

@Controller
public class ChatController {
	
	ChatUser chatUser = new ChatUser();
	
	@GetMapping("/chat")
	public String chatMain(Model model) {
		ChatMessage chatMessage = new ChatMessage();
		model.addAttribute("chatMessage", chatMessage);
		model.addAttribute("chatUser", chatUser);
		return"ChatMain";
	}
	
	@PostMapping("/message")
	public String message(@ModelAttribute ChatMessage chatMessage) {
		chatUser.addMessage(chatMessage);
		return"redirect:/chat";
	}
	
	@GetMapping("/test")
	public String chatTest() {
		ChatMessage chatMessage = new ChatMessage();
		return "ChatTest";
	}
}
