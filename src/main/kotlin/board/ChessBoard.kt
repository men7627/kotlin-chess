package board

import board.BoardPoint.*
import board.Piece.*

class ChessBoard() {
    private val points: MutableMap<BoardPoint, Piece?> = mutableMapOf(
        A1 to WHITE_ROOK, B1 to WHITE_KNIGHT, C1 to WHITE_BISHOP, D1 to WHITE_QUEEN,
        E1 to WHITE_KING, F1 to WHITE_BISHOP, G1 to WHITE_KNIGHT, H1 to WHITE_ROOK,
        A8 to BLACK_ROOK, B8 to BLACK_KNIGHT, C8 to BLACK_BISHOP, D8 to BLACK_QUEEN,
        E8 to BLACK_KING, F8 to BLACK_BISHOP, G8 to BLACK_KNIGHT, H8 to BLACK_ROOK
    )

    init {
        BoardPoint.values()
            .filter { boardPoint -> boardPoint.rank == "2" }
            .forEach { points[it] = WHITE_PAWN }

        BoardPoint.values()
            .filter { boardPoint -> boardPoint.rank == "7" }
            .forEach { points[it] = BLACK_PAWN }

        BoardPoint.values()
            .filter { boardPoint -> boardPoint.rank >= "3" && boardPoint.rank <= "6" }
            .forEach { points[it] = null }
    }

    fun getPiece(boardPoint: BoardPoint): Piece? {
        return points[boardPoint]
    }
}
