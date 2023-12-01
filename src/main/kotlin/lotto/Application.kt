package lotto

import lotto.controller.LottoController
import lotto.misc.ExceptionHandler
import lotto.view.InputView
import lotto.view.OutputView

fun main() {
    runCatching {
        val lottoController = LottoController(InputView(), OutputView(), ExceptionHandler())
        lottoController.run()
    }.onFailure {
        ExceptionHandler().printError(it.message)
    }
}
