package edu.goit.service;

import edu.goit.entity.Note;
import edu.goit.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public List<Note> listAll() {
        return noteRepository.findAll();
    }

    public Note add(Note note) {
        return noteRepository.save(note);
    }

    public void deleteById(long id) {
        if (!noteRepository.existsById(id)) {
            throw new RuntimeException("Note with this id doesn't exist");
        }
        noteRepository.deleteById(id);
    }

    public void update(Note note) {
        if (!noteRepository.existsById(note.getId())) {
            throw new RuntimeException("Note with this id doesn't exist");
        }
        noteRepository.save(note);
    }

    public Note getById(long id) {
        if (!noteRepository.existsById(id)) {
            throw new RuntimeException("Note with this id doesn't exist");
        }
        return noteRepository.findById(id).orElseThrow();
    }

}