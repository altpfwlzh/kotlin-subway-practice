package lotto

import lotto.model.PurchaseAmount
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class PurchaseAmountTest {
    @ValueSource(ints = [0, 100_001])
    @ParameterizedTest
    fun `구입 금액이 1000 ~ 100_000을 벗어나면 예외가 발생한다`(int: Int) {
        assertThrows<IllegalArgumentException> {
            PurchaseAmount(int)
        }
    }

    @ValueSource(ints = [1500, 9200])
    @ParameterizedTest
    fun `구입 금액이 1000원 단위가 아니면 예외가 발생한다`(int: Int) {
        assertThrows<IllegalArgumentException> {
            PurchaseAmount(int)
        }
    }
}