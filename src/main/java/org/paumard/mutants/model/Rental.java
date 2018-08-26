package org.paumard.mutants.model;

public class Rental {

    private Tape _tape;
    private int _daysRented;

    public Rental(Tape tape, int daysRented) {
        _tape = tape;
        _daysRented = daysRented;
    }

    public int daysRented() {
        return _daysRented;
    }

    public Tape tape() {
        return _tape;
    }
}