package sk.itsovy.nemethd;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        new Solver().start();

        View view = new View();
        view.printBoard();
    }
}
