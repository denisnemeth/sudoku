package sk.itsovy.nemethd;

public class Solver {

    private int[][] arr;
    private Board board;

    public void start() {
        if (!readData()) {
            System.out.println("Mas smolu.");
            System.out.println("Data source not found!");
            return;
        }
        board = new Board(arr);
        board.reduceAvailableValues();
    }

    public boolean readData() {
        arr = new InputData().getData();
        return true;
    }
}
