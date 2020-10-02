package sk.itsovy.nemethd;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Tile {

    private int value;
    private Set available;
    private int square;

    public Tile (int value) {
        this.value = value;
        available = new HashSet();
        if (value > 0) available = null;
        else Collections.addAll(available, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    public void setSquare(int square) {this.square = square;}

    public int getValue() {return value;}

    public void setValue(int value) {this.value = value;}

    public boolean contains(int value) {return available.contains(value);}

    public void remove(int value) {available.remove(value);}

    public void add(int value) {available.add(value);}

    public int getSize() {return available.size();}

    public Set getAvailableValues() {return available;}

    public String printAvailable() {return available.toString();}
}
