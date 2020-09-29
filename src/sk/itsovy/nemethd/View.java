package sk.itsovy.nemethd;

public class View {

    private InputData inputData = new InputData();
    private int[][] tiles = inputData.getData();

    public void printBoard() {
        System.out.println(" -----------------------------");
        for (int i = 0; i < 9; i++) {
            System.out.print("¦");
            for (int j = 0; j < 9; j++) {
                System.out.print(" " + tiles[i][j] + " ");
                if (j == 2 || j == 5 || j == 8) System.out.print("¦");
            }
            System.out.println();
            if (i == 2 || i == 5 || i == 8) System.out.println(" -----------------------------");
        }
    }
}
