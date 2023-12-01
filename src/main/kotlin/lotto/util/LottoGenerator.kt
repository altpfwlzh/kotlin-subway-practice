package lotto.util

import lotto.model.Lotto

interface LottoGenerator {
    fun generate(cnt: Int = 1): Lotto
}