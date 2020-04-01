package controller;

import javafx.fxml.FXML;
import model.Holes;
import model.Partition;
import model.Process;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Integer> process = new ArrayList<>();
    ArrayList<Holes> holes = new ArrayList<>();
    ArrayList<Partition> partition = new ArrayList<>();

    public void addDemo(){
        process.add(1);
        process.add(2);
        process.add(3);

        
    }



}
