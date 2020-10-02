package sk.itsovy.nemethd;

import java.util.Set;

public class Solver {

    private int[][] arr;
    private Board board;

    private Tile[][] tiles;

    public void start() {
        if (!readData()) {
            System.out.println("Mas smolu.");
            System.out.println("Data source not found!");
            return;
        }
        board = new Board(arr);
        Tile[][] tiles = board.getTiles();
        board.reduceAvailableValues();
        //solve();
    }

    public boolean readData() {
        arr = new InputData().getData();
        return true;
    }

    public void solve() {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                if (tiles[i][j].getSize() == 1) {
                    tiles[i][j].setValue((int) tiles[i][j].getAvailableValues().iterator().next());
                    tiles[i][j].remove(tiles[i][j].getValue());
                }
                return;
            }
        }
    }
}
