package com.sonal.skaffold.demo.msvc1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonal.skaffold.demo.msvc1.connfig.GreetingsConfig;

import reactor.core.publisher.Mono;

@RestController
public class HelloMSvc1Controller {

	@Autowired
	private GreetingsConfig greetingsConfig;
	
	@GetMapping
	public Mono<String> helloMSvc1() {
		
		return Mono.just(greetingsConfig.getGreetingsMessage() +  " Micro Service 1 wokring with Skaffold and Helm Nicely together.........###");
	}
}
