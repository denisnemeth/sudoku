package sk.itsovy.nemethd;

public class Board {

    private Tile[][] tiles;

    public Board(int[][] arr) {
        this.tiles = new Tile[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tiles[i][j] = new Tile(arr[i][j]);
            }
        }
    }

    public Tile[][] getTiles() {return tiles;}

    public void reduceAvailableValues() {
        reduceAvailableValuesInRow();
        reduceAvailableValuesInColumn();
        reduceAvailableValuesInSquare();
    }

    private void reduceAvailableValuesInRow() {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                if (tiles[i][j].getValue() == 0) {
                    for (int k = 0; k < 9; k++) {
                        System.out.print(tiles[i][k].getValue() + " ");
                        if (tiles[i][j].contains(tiles[i][k].getValue())) tiles[i][j].remove(tiles[i][k].getValue());
                    }
                    System.out.println(tiles[i][j].printAvailable());
                    System.out.println();
                }
            }
        }
    }

    private void reduceAvailableValuesInColumn() {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                if (tiles[i][j].getValue() == 0) {
                    for (int k = 0; k < 9; k++) {
                        System.out.print(tiles[k][j].getValue() + " ");
                        if (tiles[i][j].contains(tiles[k][j].getValue())) tiles[i][j].remove(tiles[k][j].getValue());
                    }
                    System.out.println(tiles[i][j].printAvailable());
                    System.out.println();
                }
            }
        }
    }

    private void reduceAvailableValuesInSquare() {}
}
