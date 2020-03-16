import board.ChessBoard
import board.BoardPoint
import board.Piece
import board.PieceType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BoardTest {
    @Test
    @DisplayName("체스판 초기화 테스트 - 말 존재 위치1")
    internal fun initialize1() {
        val board = ChessBoard()
        val piece = board.getPiece(BoardPoint.A1)
        assertThat(piece).isEqualTo(Piece.WHITE_ROOK)
    }

    @Test
    @DisplayName("체스판 초기화 테스트 - 말 존재 위치2")
    internal fun initialize2() {
        val board = ChessBoard()
        val piece = board.getPiece(BoardPoint.D8)
        assertThat(piece).isEqualTo(Piece.BLACK_QUEEN)
    }

    @Test
    @DisplayName("체스판 초기화 테스트 - 말 비존재 위치")
    internal fun initialize3() {
        val board = ChessBoard()
        val piece = board.getPiece(BoardPoint.A3)
        assertThat(piece).isNull()
    }
}