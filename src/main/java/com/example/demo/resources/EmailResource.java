package com.example.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmailDTO;
import com.example.demo.services.EmailService;

@RestController
@RequestMapping(value = "/emails")
public class EmailResource {
	
	@Autowired
	private EmailService service;

	@PostMapping
	public ResponseEntity<Void> send(@RequestBody EmailDTO dto){
		service.sendEMail(dto);
		return ResponseEntity.noContent().build();
	}
}
