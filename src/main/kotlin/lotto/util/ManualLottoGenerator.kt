package lotto.util

import lotto.model.Lotto
import lotto.model.LottoNumber

class ManualLottoGenerator : LottoGenerator {
    override fun generate(cnt: Int): Lotto
        = Lotto(RandNumGenerator().generateRandNums(LottoNumber.MIN_NUM, LottoNumber.MAX_NUM, cnt))

}