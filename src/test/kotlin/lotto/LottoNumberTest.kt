package lotto

import lotto.model.LottoNumber
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class LottoNumberTest {
    @ValueSource(ints = [999, 0, -4])
    @ParameterizedTest
    fun `로또 숫자에 1 ~ 45 외의 숫자가 들어가면 예외가 발생한다`(int: Int) {
        assertThrows<IllegalArgumentException> {
            LottoNumber(int)
        }
    }
}