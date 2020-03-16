package view

import board.ChessBoard

class OutputView {
    companion object {
        fun printGameStart() {
            println(
                """
            체스 게임을 시작합니다.
            게임 시작은 start, 종료는 end 명령을 입력하세요.
        """.trimIndent()
            )
        }

        fun printChessBoard(chessboard: ChessBoard) {
            println(chessboard)
        }
    }
}