package board

import board.PieceColor.BLACK
import board.PieceColor.WHITE
import board.PieceType.*

enum class Piece(val pieceType: PieceType?, val pieceColor: PieceColor?, val printOut: String) {
    WHITE_ROOK(ROOK, WHITE, "r"), WHITE_KNIGHT(KNIGHT, WHITE, "n"), WHITE_BISHOP(BISHOP, WHITE, "b"),
    WHITE_QUEEN(QUEEN, WHITE, "q"), WHITE_KING(KING, WHITE, "k"), WHITE_PAWN(PAWN, WHITE, "p"),
    BLACK_ROOK(ROOK, BLACK, "R"), BLACK_KNIGHT(KNIGHT, BLACK, "N"), BLACK_BISHOP(BISHOP, BLACK, "B"),
    BLACK_QUEEN(QUEEN, BLACK, "Q"), BLACK_KING(KING, BLACK, "K"), BLACK_PAWN(PAWN, BLACK, "P"),
    EMPTY(null, null, ".")
}
