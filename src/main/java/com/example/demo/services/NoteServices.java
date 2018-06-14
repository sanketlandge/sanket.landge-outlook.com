package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositories.NoteRepository;
import com.example.demo.model.Note;

@RestController
public class NoteServices {

	@Autowired
	NoteRepository noteRepository;
	
	@RequestMapping("/note")
	@ResponseBody
	private List<Note> findAllNote() {
		return (List<Note>) noteRepository.findAll();
	}
	
	@RequestMapping("/addNote")
	@ResponseBody
	private void add() {
		Note note = new Note();
		note.setDescription("hi");
		noteRepository.save(note);
	}
}
