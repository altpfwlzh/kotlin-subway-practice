package lotto.util

import java.text.DecimalFormat

class Parser {
    fun cashDec(num: Int) : String {
        val dec = DecimalFormat("#,###원")
        return dec.format(num)
    }
}