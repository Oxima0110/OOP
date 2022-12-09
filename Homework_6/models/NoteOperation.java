package Homework_6.models;

import java.util.List;

public interface NoteOperation {
    List<Note> getAllNote();
    String CreateNote(Note note);
}
