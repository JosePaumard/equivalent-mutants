package org.paumard.mutants.model;

public class Tape {

    private String _serialNumber;
    private Movie _movie;

    public Tape(String serialNumber, Movie movie) {
        _serialNumber = serialNumber;
        _movie = movie;
    }

    public Movie movie() {
        return _movie;
    }

    public String serialNumber() {
        return _serialNumber;
    }
}