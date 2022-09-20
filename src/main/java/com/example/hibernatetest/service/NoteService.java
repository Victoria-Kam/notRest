package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.Note;
import com.example.hibernatetest.reposiroty.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository repository;

    @Autowired
    public NoteService(NoteRepository repository) {
        this.repository = repository;
    }

    public List<Note> getAll(){
        return repository.getAll();
    }

    public void addNote(Note note){
        repository.addNote(note);
    }

    public Note getOne(long id){
        return repository.getOne(id);
    }


    /*public void update(Note note){
        repository.update(author);
    }

    public void delete(Note note){
        repository.delete(author);
    }*/
}