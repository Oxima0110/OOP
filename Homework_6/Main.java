package Homework_6;

import Homework_6.controller.NoteController;
import Homework_6.models.FailOperationTxt;
import Homework_6.models.NoteOperation;
import Homework_6.models.NoteOperatoinTxt;
import Homework_6.views.Button;
import Homework_6.views.View;
import Homework_6.views.ViewTerminal;
import personal.model.FileOperation;

public class Main {
    public static void main(String[] args) {
        View view = new ViewTerminal();
        FileOperation fileOperation = new FailOperationTxt("E:\\OOP\\Homework_6\\note.txt");
        NoteOperation operation = new NoteOperatoinTxt(fileOperation);
        NoteController controller = new NoteController(operation);
        Button button = new Button(controller, view);
        button.run();
    }
}
