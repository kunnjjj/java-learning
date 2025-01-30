package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece piece) {
        if (board[row][col] != null) {
            board[row][col] = piece;
            return true;
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    board[i][j].print();
                } else {
                    System.out.print(" ");
                }
                System.out.print("| ");
            }
            System.out.println();
        }
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    Pair<Integer, Integer> freeCell = new Pair<>(i, j);
                    freeCells.add(freeCell);
                }
            }
        }
        return freeCells;
    }

    public PlayingPiece getPiece(int row, int col) {
        return board[row][col];
    }

}
