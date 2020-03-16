import board.ChessBoard
import view.OutputView
import java.util.*

fun main() {
    val chessboard = ChessBoard()
    OutputView.printGameStart()

    var input = Scanner(System.`in`).nextLine()
    while(input != "end"){
        OutputView.printChessBoard(chessboard)
        input = Scanner(System.`in`).nextLine()
    }
}
