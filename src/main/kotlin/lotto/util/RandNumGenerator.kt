package lotto.util

import camp.nextstep.edu.missionutils.Randoms

class RandNumGenerator {
    fun generateRandNums(startNum: Int, endNum: Int, count: Int): MutableList<Int> = Randoms.pickUniqueNumbersInRange(startNum, endNum, count)
}