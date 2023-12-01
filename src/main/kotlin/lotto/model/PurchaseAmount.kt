package lotto.model

import lotto.util.Parser

class PurchaseAmount(private val amount: Int) {
    init {
        require(amount in MIN_AMOUNT..MAX_AMOUNT) {
            throw IllegalArgumentException(
                AMOUNT_OUT_OF_RANGE.format(Parser().cashDec(MIN_AMOUNT), Parser().cashDec(MAX_AMOUNT))
            )
        }
        require(amount % MIN_AMOUNT == 0) {
            throw IllegalArgumentException(AMOUNT_UNIT_NOT_MATCHED.format(Parser().cashDec(MIN_AMOUNT)))
        }
    }

    companion object {
        const val MIN_AMOUNT = 1_000
        const val MAX_AMOUNT = 100_000

        const val AMOUNT_OUT_OF_RANGE = "구입 금액은 %s ~ %s여야 합니다."
        const val AMOUNT_UNIT_NOT_MATCHED = "구입 금액은 %s 단위여야 합니다."
    }
}