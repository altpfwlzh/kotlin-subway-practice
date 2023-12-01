package lotto.model

data class LottoNumber(private val num: Int) {
    init{
        require(num in MIN_NUM..MAX_NUM) {throw IllegalArgumentException(OUT_OF_RANGE)}
    }

    companion object {
        const val MIN_NUM = 1
        const val MAX_NUM = 45
        const val LOTTO_NUM_COUNT = 6
        const val BONUS_NUM_COUNT = 1

        const val OUT_OF_RANGE = "로또 번호는 $MIN_NUM ~ ${MAX_NUM}여야 합니다."
    }
}