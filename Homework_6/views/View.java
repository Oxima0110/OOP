package Homework_6.views;

import Homework_6.models.Note;

public interface View {
     String prompt(String message);
     Note setNote(boolean forUpdate);
}
