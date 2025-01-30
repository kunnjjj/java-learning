package TicTacToe;

public abstract class PlayingPiece {
    PieceType pieceType;

    PlayingPiece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public void print() {
        switch (pieceType) {
            case X:
                System.out.print("X ");
                break;

            case O:
                System.out.print("0 ");
                break;

            default:
                System.out.print("- ");
        }
    }
}
