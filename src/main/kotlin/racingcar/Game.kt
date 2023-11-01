package racingcar

class Game {
    private enum class ProgressMessage(val message: String) {
        RequestCarName("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
        RequestTryNumber("시도할 횟수는 몇 회인가요?"),
        DescribeNextResult("\n실행결과");

        fun show() {
            println(this.message)
        }
    }

    fun run() {
        ProgressMessage.RequestCarName.show()
        ProgressMessage.RequestTryNumber.show()
        ProgressMessage.DescribeNextResult.show()
    }
}