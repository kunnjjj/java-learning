package TicTacToe;

import java.util.UUID;

public class Player {
    private UUID id;
    private String name;
    private PlayingPiece piece;

    Player(String name, PlayingPiece piece) {
        this.name = name;
        this.piece = piece;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return this.name;
    }

    public PlayingPiece getPiece() {
        return this.piece;
    }

}
