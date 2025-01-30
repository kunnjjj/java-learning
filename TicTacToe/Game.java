package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Pair;

public class Game {
    private Deque<Player> players;
    private Board board;

    Game() {
        initializeGame();
    }

    private void initializeGame() {
        players = new LinkedList<>();

        Player player1 = new Player("Player1", new PlayingPieceX());
        Player player2 = new Player("Player2", new PlayingPieceO());

        players.add(player1);
        players.add(player2);

        board = new Board(3);
    }

    public String play() {
        Boolean shouldKeepPlaying = true;
        while (shouldKeepPlaying) {
            board.print();
            List<Pair<Integer, Integer>> freeCells = board.getFreeCells();
            if (freeCells.isEmpty()) {
                shouldKeepPlaying = false;
            }

            Player currentPlayer = players.removeFirst();
            System.out.print("Player: " + currentPlayer.getName() + " to move");

            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            scanner.close();

            String[] values = s.split(",");
            int row = Integer.valueOf(values[0]), col = Integer.valueOf(values[1]);

            boolean isPieceAdded = board.addPiece(row, col, currentPlayer.getPiece());

            if (isPieceAdded) {
                players.addLast(currentPlayer);
            } else {
                System.out.println("You entered at incorrect pos");
                players.addFirst(currentPlayer);
            }

            boolean winner = findWinner(row, col, currentPlayer.getPiece());

            if (winner) {
                return currentPlayer.getName();
            }
        }

        return "Tie";
    }

    private boolean findWinner(int row, int col, PlayingPiece piece) {
        // ENtire logic todo

        return true;
    }

}
