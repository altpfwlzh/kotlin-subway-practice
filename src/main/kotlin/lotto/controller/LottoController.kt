package lotto.controller

import lotto.misc.ExceptionHandler
import lotto.model.PurchaseAmount
import lotto.view.InputView
import lotto.view.OutputView

class LottoController(
    private val inputView: InputView,
    private val outputView: OutputView,
    private val exceptionHandler: ExceptionHandler,
) {
    fun run() {
        val purchaseAmount = exceptionHandler.inputUntilSuccess { receivePurchaseAmount() }
    }

    private fun receivePurchaseAmount(): PurchaseAmount {
        outputView.outputPurchaseAmount()
        return PurchaseAmount(inputView.inputInt())
    }
}