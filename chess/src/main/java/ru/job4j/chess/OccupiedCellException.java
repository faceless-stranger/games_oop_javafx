package ru.job4j.chess;

public class OccupiedCellException extends Exception {
    public OccupiedCellException(){
        System.out.println("ячейка занята");
    }
}
