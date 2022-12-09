package Homework_6.controller;

import java.util.List;

import Homework_6.models.Note;
import Homework_6.models.NoteOperation;

public class NoteController {

    private  NoteOperation noteOperation;

    public NoteController(NoteOperation noteOperation) {
        this.noteOperation = noteOperation;
    }

    public void saveNote(Note note) throws Exception {
        // validateUser(user);
        noteOperation.CreateNote(note);
    }

    public List<Note> readNoteList() {
        return noteOperation.getAllNote();
    }


}
