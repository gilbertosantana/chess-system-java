package chess;

import boardgame.BoardException;

import java.io.Serializable;

public class ChessException extends BoardException {

    public static final long serialVersionUID = 1L;

    public ChessException(String message) {
        super(message);
    }
}
