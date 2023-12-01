package lotto.util

import camp.nextstep.edu.missionutils.Randoms

class RandNumGenerator {
    fun generateRandNums(startNum: Int, endNum: Int, count: Int): List<Int> = Randoms.pickUniqueNumbersInRange(startNum, endNum, count)
}