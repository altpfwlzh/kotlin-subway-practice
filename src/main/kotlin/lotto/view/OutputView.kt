package lotto.view

import lotto.constants.ErrorMessage
import lotto.constants.Strings

class OutputView() {
    private val strings: Strings = Strings
    private val errorMessage: ErrorMessage = ErrorMessage

    fun outputPurchaseAmount() = println(strings.OUTPUT_PURCHASE_AMOUNT)
}