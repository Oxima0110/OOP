package Homework_6.models;

import java.util.ArrayList;
import java.util.List;

import personal.model.FileOperation;


public class NoteOperatoinTxt implements NoteOperation{

    private NoteMapper mapper = new NoteMapper();
    private FileOperation fileOperation;

    public NoteOperatoinTxt(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Note> getAllNote() {
       List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public String CreateNote(Note note) {
        List<Note> notes = getAllNote();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        saveNotes(notes);
        return id;
    }

    private void saveNotes(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item: notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }
    
}
