package Homework_6.models;

import java.util.List;

public interface FailOperation {

    List<String> readAllLines();

    void saveAllLines(List<String> lines);
    
}
